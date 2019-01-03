package com.kelvin5360.budget

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addAmount(view: View) {
        val sumText = findViewById<EditText>(R.id.sumText)
        val existingSum = if ("" == sumText.text.toString()) 0 else sumText.text.toString().toInt()
        val button: Button = view as Button
        sumText.setText((existingSum + button.text.toString().toInt()).toString())
    }

}
