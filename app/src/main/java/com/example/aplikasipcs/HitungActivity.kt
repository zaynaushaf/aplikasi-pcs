package com.example.aplikasipcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val btnProsesJumlah = findViewById(R.id.btnProses) as Button
        val txt_Hasil = findViewById(R.id.txtHasil) as TextView
        val var1 = findViewById(R.id.Variabel1) as EditText
        val var2 = findViewById(R.id.Variabel2) as EditText

        btnProsesJumlah.setOnClickListener {
            val var1:Int = var1.text.toString().toInt()
            val var2:Int = var2.text.toString().toInt()

            val hasil:Int = var1+var2

            txt_Hasil.text = hasil.toString()
        }
    }
}