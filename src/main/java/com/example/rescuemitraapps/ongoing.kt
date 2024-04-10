package com.example.rescuemitraapps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ongoing : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ongoing)

        val button1 = findViewById<Button>(R.id.home)
        val button2 = findViewById<Button>(R.id.chat)

        button1.setOnClickListener {
            // Handle button 1 click
            val intent = Intent(this, citizensignin::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Handle button 2 click
            val intent = Intent(this, chatnow::class.java)
            startActivity(intent)
        }


    }}
