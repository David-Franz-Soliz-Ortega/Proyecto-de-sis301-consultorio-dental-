package com.example.horarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hr: Button = findViewById(R.id.buttonHorario)
        hr.setOnClickListener {
            val intent: Intent =Intent(this, horario::class.java)
            startActivity(intent)
        }


    }}