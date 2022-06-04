package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Taller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taller)
    }

    fun Informatica(view: View) {
        val informatica = Intent(this@Taller, Informatica()::class.java)
        startActivity(informatica)
    }
}