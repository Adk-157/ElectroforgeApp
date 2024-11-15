package com.cscorner.electroforge

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AnalyzeData : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_analyze_data)
        val txt1 = findViewById<TextView>(R.id.textView1anal)
        val txt2 = findViewById<TextView>(R.id.textView2anal)
        val txt3 = findViewById<TextView>(R.id.textView3anal)
        val txt4 = findViewById<TextView>(R.id.textView4anal)
        val txt5 = findViewById<TextView>(R.id.textView5anal)
    }
}