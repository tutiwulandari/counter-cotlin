package com.example.mycounter

import android.app.Notification
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView= findViewById(R.id.resultTextView)

    }

    fun increment(view: View) {
        var number = Integer.parseInt(resultTextView.text.toString())
        ++number
        resultTextView.text = number.toString()
    }
    fun decrement(view: View) {
        var number = Integer.parseInt(resultTextView.text.toString())
        --number
        resultTextView.text = number.toString()
    }
    fun reset(view: View) {
        var number = Integer.parseInt(resultTextView.text.toString())
        number = 0
        resultTextView.text = number.toString()
    }
}