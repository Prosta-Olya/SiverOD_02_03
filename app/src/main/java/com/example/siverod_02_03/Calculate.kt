package com.example.siverod_02_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Calculate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
    }

    fun back(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        setIntent(intent)
    }
    fun click(view: View) {
        val intent = Intent(this, Calculation::class.java)
        setIntent(intent)
    }
}