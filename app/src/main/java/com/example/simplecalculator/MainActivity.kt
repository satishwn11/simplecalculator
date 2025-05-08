package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDisplay = findViewById<TextView>(R.id.tvDisplay)
        val etInput1 = findViewById<EditText>(R.id.etInput1)
        val etInput2 = findViewById<EditText>(R.id.etInput2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubs = findViewById<Button>(R.id.btnSubs)
        val btnMult = findViewById<Button>(R.id.btnMult)
        val btnDiv = findViewById<Button>(R.id.btnDiv)

        btnAdd.setOnClickListener {
            val input1Text = etInput1.text.toString()
            val input2Text = etInput2.text.toString()

            val input1 = input1Text.toIntOrNull()
            val input2 = input2Text.toIntOrNull()

            if (input1 != null && input2 != null) {
                val result = input1 + input2
                tvDisplay.text = result.toString()
            } else {
                tvDisplay.text = "Invalid input"
            }
        }

        btnSubs.setOnClickListener {
            val input1Text = etInput1.text.toString()
            val input2Text = etInput2.text.toString()

            val input1 = input1Text.toIntOrNull()
            val input2 = input2Text.toIntOrNull()

            if (input1 != null && input2 != null) {
                val result = input1 - input2
                tvDisplay.text = result.toString()
            } else {
                tvDisplay.text = "Invalid input"
            }
        }
        btnMult.setOnClickListener {
            val input1Text = etInput1.text.toString()
            val input2Text = etInput2.text.toString()

            val input1 = input1Text.toIntOrNull()
            val input2 = input2Text.toIntOrNull()

            if (input1 != null && input2 != null) {
                val result = input1 * input2
                tvDisplay.text = result.toString()
            } else {
                tvDisplay.text = "Invalid input"
            }
        }
        btnDiv.setOnClickListener {
            val input1Text = etInput1.text.toString()
            val input2Text = etInput2.text.toString()

            val input1 = input1Text.toFloatOrNull()
            val input2 = input2Text.toFloatOrNull()

            if (input1 != null && input2 != null) {
                if (input2 != 0f) {
                    val result = input1 / input2
                    tvDisplay.text = result.toString()
                } else {
                    tvDisplay.text = "Cannot divide by 0"
                }
            } else {
                tvDisplay.text = "Invalid input"
            }
        }


    }
}