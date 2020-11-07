package com.example.prueba_desconecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_desconecta.*
import com.airbnb.lottie.LottieAnimationView

class Desconecta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desconecta)

        desconectaImageView.setOnClickListener {
            inspiraAnimation(desconectaImageView, R.raw.breath)
        }
    }

    private fun inspiraAnimation(imageView: LottieAnimationView, animation: Int) : Boolean {
        imageView.setAnimation(animation)
        imageView.playAnimation()
        return true
    }
}