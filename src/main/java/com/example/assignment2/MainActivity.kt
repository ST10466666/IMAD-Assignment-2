package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart=findViewById<Button>(R.id.buttonStart)

        buttonStart?.setOnClickListener {
            val intent=Intent(this,questtions::class.java)
            startActivity(intent)
        }
    }
}
