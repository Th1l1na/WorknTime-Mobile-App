package com.example.workntimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddEvent_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event_page)

        val btn1 = findViewById<Button>(R.id.back).setOnClickListener {
            onBackPressed()
        }
    }
}