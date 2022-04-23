package com.amandaroos.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        val countText = findViewById(R.id.count_text) as TextView
        val countButton = findViewById(R.id.count_button) as Button

        countButton.setOnClickListener{
            count += 1
            countText.text = count.toString()
        }
    }
}