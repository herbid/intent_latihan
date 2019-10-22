package com.example.inputdataintentpraktek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.Nim)
        val nama = findViewById<EditText>(R.id.Nama)
        val nilai  = findViewById<EditText>(R.id.Nilai)

        val saveBtn = findViewById<Button>(R.id.save)

        //handle button click
        saveBtn.setOnClickListener {

            val nimV = nim.text.toString()
            val namav = nama.text.toString()
            val nilaiV:Int = Integer.parseInt(nilai.text.toString())





            val intent = Intent(this@MainActivity, activity_second::class.java)
            intent.putExtra("nim", nimV)
            intent.putExtra("nama", namav)
            intent.putExtra("nilai", nilaiV)
          //  intent.putExtra("keterangan", keterangan)
            startActivity(intent)

        }

    }
}
