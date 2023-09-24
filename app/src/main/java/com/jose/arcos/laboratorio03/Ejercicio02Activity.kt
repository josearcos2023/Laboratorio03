package com.jose.arcos.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Ejercicio02Activity : AppCompatActivity() {

    private lateinit var btnSave:Button

    private lateinit var edtName: EditText
    private lateinit var edtLastName: EditText
    private lateinit var edtEmail: EditText

    private lateinit var tvName: TextView
    private lateinit var tvLastName: TextView
    private lateinit var tvEmail: TextView

    private lateinit var lnResult: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)
        initializeWidgets()
        saveInformation()
    }

    private fun initializeWidgets() {
        btnSave = findViewById<Button>(R.id.btnSave)

        edtName = findViewById<EditText>(R.id.edtName)
        edtLastName = findViewById<EditText>(R.id.edtLastName)
        edtEmail = findViewById<EditText>(R.id.edtEmail)

        tvName = findViewById<TextView>(R.id.tvName)
        tvLastName = findViewById<TextView>(R.id.tvLastName)
        tvEmail = findViewById<TextView>(R.id.tvEmail)

        lnResult = findViewById<LinearLayout>(R.id.lnResult)
    }

    private fun saveInformation() {
        btnSave.setOnClickListener {
            setInformation(
                edtName.text.toString(),
                edtLastName.text.toString(),
                edtEmail.text.toString()
            )
            clearForm()
        }
    }

    private fun setInformation(name: String,
                               lastName: String,
                               email: String) {
        tvName.text = "Nombre: $name"
        tvLastName.text = "Apellido: $lastName"
        tvEmail.text = "Correo: $email"
        lnResult.visibility = View.VISIBLE
    }

    private fun clearForm() {
        edtName.text.clear()
        edtLastName.text.clear()
        edtEmail.text.clear()
    }
}