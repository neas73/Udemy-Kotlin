package com.NEAS.udemy_kotlin.Adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.NEAS.udemy_kotlin.activities.Persona
import kotlinx.android.synthetic.main.fila_persona.view.*

class PersonaAdapter(val context : Context, val layout : Int, val lista : List<Persona>) : BaseAdapter(){

    private val inflatorView : LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view : View
        val viewHolder: PersonaViewHolder

        if(convertView == null){
            view = inflatorView.inflate(layout, parent, false)
            viewHolder = PersonaViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as PersonaViewHolder
        }

        val fullName = "${lista[position].nombre} ${lista[position].apellido}"
        viewHolder.fullName.text = fullName
        viewHolder.edad.text = "${lista[position].edad}"

        Log.v("PERSONA", "Nombre: ${fullName}")

        return view
    }

    override fun getItem(position: Int): Any {
        return lista[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return lista.size
    }

}

private class PersonaViewHolder(view: View){
    val fullName : TextView = view.txtNombre
    val edad : TextView = view.txtEdad
}