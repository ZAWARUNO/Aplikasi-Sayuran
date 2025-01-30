package com.example.aplikasisayuran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnBack: ImageView = findViewById(R.id.btnBack)

        val gambarSayur: ImageView = findViewById(R.id.gambarSayur)
        val namaSayur: TextView = findViewById(R.id.namaSayur)
        val deskripsiSsyur: TextView = findViewById(R.id.deskripsiSayur)

        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val idGambar = intent.getIntExtra("idGambar", 0)

        btnBack.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
        gambarSayur.setImageResource(idGambar)
        namaSayur.text = nama
        deskripsiSsyur.text = deskripsi
    }
}