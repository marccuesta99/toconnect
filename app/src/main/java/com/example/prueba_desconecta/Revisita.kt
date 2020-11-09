package com.example.prueba_desconecta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View
import kotlin.system.exitProcess

class Revisita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revisita)

        val btn: Button = findViewById(R.id.buttonEnd)
        btn.setOnClickListener{
            Toast.makeText(this,"Heu acabat",Toast.LENGTH_SHORT).show()
            this.finish()
            exitProcess(0)
        }
    }
}