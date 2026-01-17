package com.example.yellowg

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Sarı arka plan ve G harfi
        val textView = TextView(this).apply {
            text = "G"
            textSize = 150f
            setTextColor(Color.BLACK)
            setBackgroundColor(Color.YELLOW)
            gravity = Gravity.CENTER
        }
        
        setContentView(textView)
    }
}
