package com.cscorner.electroforge

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Prediction : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prediction)
        val txt1 = findViewById<TextView>(R.id.textView1pred)
        val txt2 = findViewById<TextView>(R.id.textView2pred)
        val txt3 = findViewById<TextView>(R.id.textView3pred)
        val txt4 = findViewById<TextView>(R.id.textView4pred)
        val txt5 = findViewById<TextView>(R.id.textView5pred)



    }
}