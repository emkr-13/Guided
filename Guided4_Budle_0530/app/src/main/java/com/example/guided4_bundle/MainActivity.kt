package com.example.guided4_bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nama : TextInputEditText
    private lateinit var npm : TextInputEditText
    private lateinit var fakultas : TextInputEditText
    private lateinit var prodi : TextInputEditText

    private lateinit var btnRegister : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.ketikNama)
        npm = findViewById(R.id.ketikNPM)
        fakultas = findViewById(R.id.ketikFakultas)
        prodi = findViewById(R.id.ketikProdi)
        btnRegister=findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener{
            val intent = Intent (this,NextActivity :: class.java)
            val mBundle = Bundle()
//            data ne di masuke di bundle
            mBundle.putString("nama",nama.text.toString())
           mBundle.putString("npm",npm.text.toString())
            mBundle.putString("falkutas",fakultas.text.toString())
            mBundle.putString("prodi",prodi.text.toString())

            intent.putExtra("register", mBundle)

            startActivity(intent)
        }
    }
}