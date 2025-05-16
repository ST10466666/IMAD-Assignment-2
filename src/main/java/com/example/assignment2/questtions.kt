package com.example.assignment2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.assignment2.R.id.scoreTextView


class questtions : AppCompatActivity() {
    private val questtions = listOf(
        "Nelson Mandela was the president in 1994" to true,
        "The capital of South Africa is Johannesburg" to false,
        "VAT in South Africa is currently 15%" to true,
        "The rand is stronger than the US dollar" to false,
        "South Africa has 11 official languages" to true
    )

    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questtions)

        val questionText = findViewById<TextView>(R.id.questionText)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val questionButton=findViewById<Button>(R.id.questionButton)

        fun updateQuestion() {
            if (currentQuestionIndex < questtions.size) {
                questionText.text = questtions[currentQuestionIndex].first
            } else {
                // Quiz completed
                val performance = when {
                    score == questtions.size -> "Perfect! 🎉"
                    score >= questtions.size * 0.7 -> "Great job! 👍"
                    else -> "Keep practicing! 💪"
                }
                Toast.makeText(
                    this,
                    "Quiz completed!\nFinal score: $score/${questtions.size}\n$performance",
                    Toast.LENGTH_LONG
                ).show()

                // Reset quiz
                currentQuestionIndex = 0
                score = 0
                updateQuestion()
            }
        }

        fun checkAnswer(userAnswer: Boolean) {
            val isCorrect = userAnswer == questtions[currentQuestionIndex].second
            if (isCorrect) {
                score++
                Toast.makeText(this, "✅ Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "❌ Incorrect!", Toast.LENGTH_SHORT).show()
            }
            currentQuestionIndex++
            updateQuestion()
        }

        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }

        updateQuestion()
    }
}

