package com.example.workntimeapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn1 = findViewById<Button>(R.id.button7)

//        btn1.setOnClickListener {
//            val intent = Intent(this,AddPlace::class.java)
//            startActivity(intent)
//        }

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home -> {
                    replaceFragment(Home())
                    true
                }
                R.id.records ->{
                    replaceFragment(Records())
                    true
                }
                R.id.profile ->{
                    replaceFragment(Profile())
                    true
                }
                else -> false
            }
        }
        replaceFragment(Home())

    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment).commit()

    }


}