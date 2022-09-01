package com.example.gd3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayNumber : AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val  intent: Intent = intent
        val message: String? = intent.getStringExtra("InputanAngka")

//        gawe text view
        val textView= TextView(this)
        textView.setTextSize(40F)
        textView.setText("Angka yang di yang anda input adalah " + message)

        setContentView(textView)
    }
}