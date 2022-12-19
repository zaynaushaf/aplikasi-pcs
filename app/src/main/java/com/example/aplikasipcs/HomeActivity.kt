package com.example.aplikasipcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.math.E

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance button
        val buttonActivity:Button = findViewById(R.id.btnActivity)
        val buttonHitung:Button = findViewById(R.id.btnHitung)

        buttonActivity.setOnClickListener {
            val intent = Intent(this, HitungActivity::class.java)
            startActivity(intent)

        }
    }
}