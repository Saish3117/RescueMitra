package com.example.rescuemitraapps

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by its ID
        val buttonNavigateToSecondActivity = findViewById<Button>(R.id.button)

        // Set an OnClickListener for the button
        buttonNavigateToSecondActivity.setOnClickListener {
            // Create an Intent to navigate to SecondActivity
            val intent = Intent(this, second::class.java)
            startActivity(intent)
        }

        // Delay the navigation to SecondActivity for 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, second::class.java)
            startActivity(intent)
            finish() // Finish MainActivity to prevent going back to it using the back button
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}

class SecondActivity {

}
