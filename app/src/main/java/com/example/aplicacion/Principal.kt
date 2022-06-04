package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }


    fun Ipatria(view: View) {
        val ipatria = Intent(this@Principal, Ipatria()::class.java)
        startActivity(ipatria)
}
    fun Seccion(view: View) {
        val seccion = Intent(this@Principal, Seccion()::class.java)
        startActivity(seccion)
    }
    fun Espacios(view: View) {
        val espacios = Intent(this@Principal, Espacios()::class.java)
        startActivity(espacios)
    }
    fun Taller(view: View) {
        val taller = Intent(this@Principal, Taller()::class.java)
        startActivity(taller)
    }
    fun Himno(view: View) {
        val himno = Intent(this@Principal, Himno()::class.java)
        startActivity(himno)
    }

    fun Patria(view: View) {}
}