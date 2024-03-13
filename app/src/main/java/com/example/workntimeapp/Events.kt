package com.example.workntimeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        val btn2 = findViewById<Button>(R.id.addEvent).setOnClickListener {
            val intent = Intent(this,AddEvent_page::class.java)
            startActivity(intent)
        }


        val btn1 = findViewById<Button>(R.id.back).setOnClickListener {
            onBackPressed()
        }


    }
}