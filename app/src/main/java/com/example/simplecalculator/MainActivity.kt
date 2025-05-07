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
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            val result = input1 + input2
            tvDisplay.text = result.toString()
        }
        btnSubs.setOnClickListener {
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            val result = input1 - input2
            tvDisplay.text = result.toString()
        }
        btnMult.setOnClickListener {
            val input1 = etInput1.text.toString().toInt()
            val input2 = etInput2.text.toString().toInt()

            val result = input1 * input2
            tvDisplay.text = result.toString()
        }
        btnDiv.setOnClickListener {
            val input1 = etInput1.text.toString().toFloat()
            val input2 = etInput2.text.toString().toFloat()

            val result = input1 / input2
            tvDisplay.text = result.toString()
        }

    }
}