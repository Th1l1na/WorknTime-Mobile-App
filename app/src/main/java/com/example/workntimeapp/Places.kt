package com.example.workntimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Places : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)

        val btn1 = findViewById<Button>(R.id.back)

        btn1.setOnClickListener {
            onBackPressed()
        }
    }
}