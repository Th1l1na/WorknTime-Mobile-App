package com.example.workntimeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculateSalary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_salary)

        val btn1 = findViewById<Button>(R.id.back)

        btn1.setOnClickListener {
            onBackPressed()
        }
    }


}