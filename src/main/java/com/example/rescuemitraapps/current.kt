package com.example.rescuemitraapps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class current : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.current)

        val button1 = findViewById<Button>(R.id.back)
        button1.setOnClickListener {
            val intent = Intent(this, rescue::class.java)
            startActivity(intent)

        }
    }
}