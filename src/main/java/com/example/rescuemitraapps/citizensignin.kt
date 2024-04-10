package com.example.rescuemitraapps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class citizensignin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.citizens)


        val buttons = findViewById<Button>(R.id.back)
        val button1 = findViewById<Button>(R.id.ongoing)
        val button2 = findViewById<Button>(R.id.Disaster)
        val button3 = findViewById<Button>(R.id.Emergency)
        val button4 = findViewById<Button>(R.id.Protocol)

        button1.setOnClickListener {
            // Handle button 1 click
            val intent = Intent(this, ongoing::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Handle button 2 click
            val intent = Intent(this, disaster::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            // Handle button 3 click
            val intent = Intent(this,emergency::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            // Handle button 4click
            val intent = Intent(this, protocol::class.java)
            startActivity(intent)

            buttons.setOnClickListener {
                // Handle buttons click
                val intent = Intent(this, second::class.java)
                startActivity(intent)
            }
        }
    }
}


























