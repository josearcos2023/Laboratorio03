package com.jose.arcos.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class Ejercicio01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        val tvTitle = findViewById<TextView>(R.id.tvTitle)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        val lnButtons=findViewById<LinearLayout>(R.id.lnButtons)

        tvTitle.text="Laboratorio 03"

        btn1.setOnClickListener {
            Toast.makeText(this, "Click BTN1", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "Click btn2", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            if (tvTitle.visibility == View.GONE) {
                btn3.text = "Desaparecer TITLE"
                tvTitle.visibility = View.VISIBLE
                lnButtons.visibility=View.VISIBLE
            } else {
                btn3.text = "Aparecer TITLE"
                tvTitle.visibility = View.GONE
            }
        }
    }
}

