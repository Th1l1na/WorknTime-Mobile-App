package com.example.workntimeapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Home : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the button by its ID
        val addEvent: Button = view.findViewById(R.id.AddEvent)


        // Set an OnClickListener to the button
        addEvent.setOnClickListener {
            // Start the desired Activity using an Intent
            val intent = Intent(activity, AddPlace::class.java)
            startActivity(intent)
        }

        val viewSalary: Button = view.findViewById(R.id.ViewSalary)
        // Set an OnClickListener to the button
        viewSalary.setOnClickListener {
            // Start the desired Activity using an Intent
            val intent = Intent(activity, CalculateSalary::class.java)
            startActivity(intent)
        }

        val viewEvent: Button = view.findViewById(R.id.ViewEvents)
        // Set an OnClickListener to the button
        viewEvent.setOnClickListener {
            // Start the desired Activity using an Intent
            val intent = Intent(activity, Events::class.java)
            startActivity(intent)
        }

        val viewplace: Button = view.findViewById(R.id.ViewPlace)
        // Set an OnClickListener to the button
        viewplace.setOnClickListener {
            // Start the desired Activity using an Intent
            val intent = Intent(activity, Places::class.java)
            startActivity(intent)
        }
    }




}