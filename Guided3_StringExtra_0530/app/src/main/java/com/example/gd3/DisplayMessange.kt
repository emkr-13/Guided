package com.example.gd3

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessange :  AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val  intent: Intent = intent
        val message: String = intent.getStringExtra(MainActivity.EXTRA_MESSAGE).toString()

//        gawe text view
        val textView= TextView(this)
        textView.setTextSize(40F)
        textView.setText("Anda Memilih Warna  " + message)

        if (message == "Merah"){
            textView.setTextColor(Color.parseColor("#FF0000"))
        }else if (message == "Hijau"){
            textView.setTextColor(Color.parseColor("#00FF00"))
        }else{
            textView.setTextColor(Color.parseColor("#00FFF8"))
        }

        setContentView(textView)
    }
}