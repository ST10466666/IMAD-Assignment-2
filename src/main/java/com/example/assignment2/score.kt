package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.color.utilities.Score
import org.w3c.dom.Text

class score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        val retryButton = findViewById<Button>(R.id.retryButton)
        val editAppButton = findViewById<Button>(R.id.exitAppButton)
        val reviewButton=findViewById<Button>(R.id.reviewButton)
        val reviewText=findViewById<TextView>(R.id.reviewText)

        val score = intent.getIntExtra("SCORE", 0)
        val total = intent.getIntExtra("TOTAL_QUESTIONS", 0)

        scoreTextView.text = "Your Score: $score/$total"

        retryButton.setOnClickListener {
            // Loop back to questtions
            startActivity(Intent(this,questtions::class.java))
            finish()
        }

        reviewButton.setOnClickListener {
            // Proceed to  questtions
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
