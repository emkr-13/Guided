package com.example.guided4_bundle


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    private lateinit var nama : TextView
    private lateinit var npm : TextView
    private lateinit var fakultas : TextView
    private lateinit var prodi : TextView

    lateinit var  mBundle: Bundle

    lateinit var vNama : String
    lateinit var vNPM : String
    lateinit var vFakultas : String
    lateinit var vProdi : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBudle()
        setText()
    }

    fun  getBudle(){

        mBundle = intent.getBundleExtra("register")!!

        vNama=mBundle.getString("nama")!!
        vNPM=mBundle.getString("npm")!!
        vFakultas=mBundle.getString("falkutas")!!
        vProdi=mBundle.getString("prodi")!!
    }

    fun setText(){
        nama=findViewById(R.id.showNama)
        nama.setText(vNama)

        npm=findViewById(R.id.showNPM)
        npm.setText(vNPM)

        fakultas=findViewById(R.id.showFakultas)
        fakultas.setText(vFakultas)

        prodi=findViewById(R.id.showProdi)
        prodi.setText(vProdi)
    }
}