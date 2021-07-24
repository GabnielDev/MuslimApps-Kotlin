package com.example.muslimappskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButton()

    }

    fun mainButton() {
        val btnQuran: CardView = findViewById(R.id.btnQuran)
        val btnAsmaul: CardView = findViewById(R.id.btnAsmaul)
        val btnTahlil: CardView = findViewById(R.id.btnTahlil)

        btnQuran.setOnClickListener {
            startActivity(Intent(this, QuranActivity::class.java))
        }
        btnAsmaul.setOnClickListener {
            startActivity(Intent(this, AsmaulActivity::class.java))
        }
        btnTahlil.setOnClickListener {
            startActivity(Intent(this, TahlilActivity::class.java))
        }
    }
}