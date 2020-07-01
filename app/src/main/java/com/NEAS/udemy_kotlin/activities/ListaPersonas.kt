package com.NEAS.udemy_kotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.NEAS.udemy_kotlin.Adapters.PersonaAdapter
import com.NEAS.udemy_kotlin.R
import kotlinx.android.synthetic.main.lista_personas.*

class ListaPersonas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_personas)

        listViewPersonas.adapter = PersonaAdapter(this, R.layout.fila_persona, GetPersonas())
    }

    private fun GetPersonas() : List<Persona>{
        return listOf<Persona>(
            Persona("Nicolas", "Asso", 28),
            Persona("Emmanuel", "Asso", 29),
            Persona("Nicolas", "Soria", 30),
            Persona("Emmanuel", "Soria", 31),
            Persona("Estefania", "Mariano", 32),
            Persona("Aldana", "Mariano", 33),
            Persona("Estefania", "Felix", 34),
            Persona("Aldana", "Felix", 35),
            Persona("Nicolas", "Mariano", 36),
            Persona("Emmanuel", "Mariano", 37),
            Persona("Nicolas", "Felix", 38),
            Persona("Emmanuel", "Felix", 39),
            Persona("Estefania", "Asso", 40),
            Persona("Aldana", "Asso", 41),
            Persona("Estefania", "Soria", 42),
            Persona("Aldana", "Soria", 43),
            Persona("Alejandro", "Lora", 27),
            Persona("Fernando", "Vega", 37),
            Persona("Alicia", "Gómez", 19),
            Persona("Paula", "Escobar", 33),
            Persona("Alberto", "Parada", 22),
            Persona("Cristian", "Romero", 44),
            Persona("Octavio", "Hernández", 23),
            Persona("Yaiza", "Costi", 43),
            Persona("Naomi", "Fernandexz", 57),
            Persona("Jason", "Otah", 16),
            Persona("Alejandro", "Lora", 27),
            Persona("Fernando", "Vega", 37),
            Persona("Alicia", "Gómez", 19),
            Persona("Paula", "Escobar", 33),
            Persona("Alberto", "Parada", 22),
            Persona("Cristian", "Romero", 44),
            Persona("Octavio", "Hernández", 23),
            Persona("Yaiza", "Costi", 43),
            Persona("Naomi", "Fernandexz", 57),
            Persona("Jason", "Otah", 16)
        )
    }
}