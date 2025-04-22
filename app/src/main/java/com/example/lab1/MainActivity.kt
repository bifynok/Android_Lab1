package com.example.lab1

import android.os.Bundle
import android.text.InputType
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.buttonOk)
        val outputText = findViewById<TextView>(R.id.outputText)
        val showPassword = findViewById<RadioButton>(R.id.showPassword)
        val hidePassword = findViewById<RadioButton>(R.id.hidePassword)

        showPassword.setOnClickListener {
            editText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            editText.setSelection(editText.text.length)
        }

        hidePassword.setOnClickListener {
            editText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            editText.setSelection(editText.text.length)
        }

        button.setOnClickListener {
            val inputText = editText.text.toString()
            outputText.text = inputText
        }
    }
}