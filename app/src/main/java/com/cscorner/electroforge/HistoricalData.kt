package com.cscorner.electroforge

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HistoricalData : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_historical_data)
        val txt1 = findViewById<TextView>(R.id.textView1hist)
        val txt2 = findViewById<TextView>(R.id.textView2hist)
        val txt3 = findViewById<TextView>(R.id.textView3hist)
        val txt4 = findViewById<TextView>(R.id.textView4hist)
        val txt5 = findViewById<TextView>(R.id.textView5hist)
    }
}