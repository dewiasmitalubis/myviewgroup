package com.myta.viewlatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Dunia Makanan"

        val btnSatePadang: Button = findViewById(R.id.btn_sate_padang)
        btnSatePadang.setOnClickListener(this)

        val btnPizza: Button = findViewById(R.id.btn_move_pizza)
        btnPizza.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_sate_padang -> {
                val satePadangIntent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(satePadangIntent)
            }
            R.id.btn_move_pizza -> {
                val pizzaIntent = Intent(this@MainActivity, Pizza::class.java)
                startActivity(pizzaIntent
                )
            }
        }

    }
}