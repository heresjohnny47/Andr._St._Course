package com.example.gobeken

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
             button.setOnClickListener {
                val intent = Intent(this, Main3Activity::class.java)
                 startActivity(intent)
             }

        val button2: Button = findViewById(R.id.button2)
             button2.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                 startActivity(intent)
             }
    }
}