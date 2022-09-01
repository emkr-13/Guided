package com.example.gd3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.AbsListView
import android.widget.RadioButton
import android.widget.RadioGroup
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var etAngka : TextInputEditText
    private var btnRGrup : RadioGroup? = null
    private lateinit var btnRButton : RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val intent = Intent(this,DisplayMessange :: class.java)
        val message: String

        btnRGrup = findViewById(R.id.radioGrup)
        val rbc: Int = btnRGrup!!.checkedRadioButtonId
        btnRButton = findViewById(rbc)
        message = btnRButton.text.toString()

        intent.putExtra(EXTRA_MESSAGE,message)
        startActivity(intent)
    }

    fun  sendNumberMessage(view : View){
        val intent = Intent(this,DisplayNumber :: class.java)
        etAngka = findViewById(R.id.tietKetikAngka)
        val angka : Int = (etAngka.text.toString()).toInt()

        intent.putExtra("InputanAngka",angka.toString())
        startActivity(intent)
    }

    companion object{
        const val  EXTRA_MESSAGE = "MESSAGE"
    }

}