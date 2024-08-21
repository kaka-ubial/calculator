package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1input)
        val num2 = findViewById<EditText>(R.id.num2input)
        val add = findViewById<Button>(R.id.additionButton)
        val sub = findViewById<Button>(R.id.subtractionButton)
        val mul = findViewById<Button>(R.id.multiplicationButton)
        val div = findViewById<Button>(R.id.divisionButton)
        val result = findViewById<TextView>(R.id.result)

        add.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val calc = (number1 + number2).toString()
                result.text = "Resultado: $calc"
            } else {
                result.text = "Please enter valid numbers"
            }
        }

        sub.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val calc = (number1 - number2).toString()
                result.text = "Resultado: $calc"
            } else {
                result.text = "Please enter valid numbers"
            }
        }

        mul.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val calc = (number1 * number2).toString()
                result.text = "Resultado: $calc"
            } else {
                result.text = "Please enter valid numbers"
            }
        }

        div.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                if (number2 != 0.0) {
                    val calc = (number1 / number2).toString()
                    result.text = "Resultado: $calc"
                } else {
                    result.text = "Cannot divide by zero"
                }
            } else {
                result.text = "Please enter valid numbers"
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
