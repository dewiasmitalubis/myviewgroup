package com.myta.viewlatihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Pizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
        supportActionBar?.title = "Pizza"
    }
}