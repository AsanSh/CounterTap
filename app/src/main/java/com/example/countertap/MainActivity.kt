package com.example.countertap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap(view: View) {
        count++

        val textview = findViewById<TextView>(R.id.tv_counter)
        textview.text = "Вы нажали на кнопку $count раз"
    }

}