package com.NEAS.udemy_kotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.NEAS.udemy_kotlin.R

class ImagenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen)

        Toast.makeText(this, "Soy un Toast", Toast.LENGTH_LONG).show()
    }
}
