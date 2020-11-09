package com.example.prueba_desconecta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Crea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crea)

        val btn: Button = findViewById(R.id.buttonCreate)
        btn.setOnClickListener{
            val r = Intent(this, Revisita::class.java)
            startActivity(r)
        }
    }
}