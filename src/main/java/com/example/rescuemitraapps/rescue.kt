package com.example.rescuemitraapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import android.annotation.SuppressLint

class rescue : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rescue)


        val buttonn = findViewById<Button>(R.id.homer)
        val button1 = findViewById<Button>(R.id.Announcement)
        val button2 = findViewById<Button>(R.id.current)
        val button3 = findViewById<Button>(R.id.past)
        val button4 = findViewById<Button>(R.id.geelp)


        button1.setOnClickListener {
            val intent = Intent(this, annoumcment::class.java)
            startActivity(intent)


            button2.setOnClickListener {
                // Handle Sign Up button click
                val intent = Intent(this, current::class.java)
                startActivity(intent)
                button3.setOnClickListener {
                    // Handle Sign In button click
                    val intent = Intent(this, past::class.java)
                    startActivity(intent)

                    buttonn.setOnClickListener {
                        val intent = Intent(this, second::class.java)
                        startActivity(intent)

                    }
                }
            }
        }
    }
}

