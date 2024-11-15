package com.cscorner.electroforge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



      val  head = findViewById<TextView>(R.id.head)

        val live = findViewById<TextView>(R.id.livedat)
        val Text1 = findViewById<TextView>(R.id.textView1)
        val Text2 = findViewById<TextView>(R.id.textView2)
        val Text3 = findViewById<TextView>(R.id.textView3)
        val Text4 = findViewById<TextView>(R.id.textView4)
        val Text5 = findViewById<TextView>(R.id.textView5)

        val analyzebtn = findViewById<Button>(R.id.btn1)

        analyzebtn.setOnClickListener {
            val analyze_intent = Intent(this,AnalyzeData::class.java)
            startActivity(analyze_intent)

        }


        val historicalbtn = findViewById<Button>(R.id.btn2)
        historicalbtn.setOnClickListener {
            val hist_intent = Intent(this,HistoricalData::class.java)
            startActivity(hist_intent)
        }


        val prediction = findViewById<Button>( R.id.btn3)

        prediction.setOnClickListener {
            val pred_intent = Intent(this,Prediction::class.java)
            startActivity(pred_intent)
        }

        val generatereport = findViewById<Button>(R.id.btn4)

        generatereport.setOnClickListener {
            //code for implementation
        }






    }
}