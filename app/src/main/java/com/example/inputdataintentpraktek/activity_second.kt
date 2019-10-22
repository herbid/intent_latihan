package com.example.inputdataintentpraktek

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class activity_second : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val ket:String
        val intent = intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nilai = intent.getIntExtra("nilai",100)


        if (nilai >=80){
            ket="A"
        }
        else if (nilai >=60){
            ket="B"
        }
        else if (nilai >=40){
            ket="C"
        }
        else if (nilai >=20){
            ket="D"
        }
        else {
            ket="E"
        }

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NIM      : " + nim+"\nNama   :" + nama+"\nNilai      :" +nilai+"\nKeterangan :"+ ket

    }
}