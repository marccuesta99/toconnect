package com.example.prueba_desconecta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun EmpezarAct(view: View){
        val r = Intent(this, Inspira::class.java);
        startActivity(r);
        Thread.sleep(2000);
        val j = Intent(this, Aguanta::class.java);
        startActivity(j);
        Thread.sleep(2000);
        val i = Intent(this, Expira::class.java);
        startActivity(i);
    }

//probando//
}