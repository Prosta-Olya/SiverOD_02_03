package com.example.siverod_02_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Calculation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}