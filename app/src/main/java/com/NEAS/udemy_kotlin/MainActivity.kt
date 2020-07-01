package com.NEAS.udemy_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.NEAS.udemy_kotlin.activities.ListaPersonas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImagen0.setOnClickListener{

        }

        btnLista.setOnClickListener {
            startActivity(Intent(this,  ListaPersonas::class.java))
        }
    }


}