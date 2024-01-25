package com.example.simplecounter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<ImageView>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)

        var increment = 1
        var counter = 90

        button.setOnClickListener {
            counter+=increment
            textView.text = counter.toString()
            if (counter == 100) {
                upgradeButton.visibility = View.VISIBLE
        }
        upgradeButton.setOnClickListener {
            increment += 1
            upgradeButton.visibility = View.INVISIBLE
            }
        }
    }
}