package com.example.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toastMe(view: View) {
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()
        var count: Int = Integer.parseInt(countString)
        val myToast = Toast.makeText(this, "Count Number is : " + count, Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.textView)

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.textView)

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}