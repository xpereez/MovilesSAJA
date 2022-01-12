package com.example.movilessaja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickRegistro(view: View){
        irPantallaRegistro()
    }

    fun irPantallaRegistro() {
        val pantallaLogin = Intent(this, RegistrarseActivity::class.java)
        startActivity(pantallaLogin)
    }
}