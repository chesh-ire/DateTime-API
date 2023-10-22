package com.example.datetimeapi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextView by its ID
        val dateTextView = findViewById<TextView>(R.id.dateTextView)

        // Get the current date
        val currentDate = getCurrentDate()

        // Set the date in the TextView
         dateTextView.text = currentDate
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat(" EEEE, dd-MM-yyyy , HH:mm:ss", Locale.getDefault())
        val date = Date()
        return dateFormat.format(date)
    }
}
