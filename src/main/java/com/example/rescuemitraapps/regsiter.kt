package com.example.rescuemitraapps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class regsiter : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val button1 = findViewById<Button>(R.id.SinIn)
        val button2 = findViewById<Button>(R.id.signini)

        button1.setOnClickListener {
            val intent = Intent(this, rescue::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, login::class.java)
                startActivity(intent)

            }
        }
    }
}