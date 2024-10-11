package com.example.ec_1_daa_l_aguilar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularUtilidades : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcular_utilidades)


        val salarioEditText = findViewById<EditText>(R.id.salarioEditText)
        val anosEditText = findViewById<EditText>(R.id.anosEditText)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)


        calcularButton.setOnClickListener {

            val salario = salarioEditText.text.toString().toDoubleOrNull() ?: 0.0
            val anosTrabajados = anosEditText.text.toString().toIntOrNull() ?: 0


            val porcentajeUtilidad: Double = when {
                anosTrabajados < 1 -> 0.05
                anosTrabajados in 1..1 -> 0.07
                anosTrabajados in 2..4 -> 0.10
                anosTrabajados in 5..9 -> 0.15
                else -> 0.20
            }


            val utilidades = salario * porcentajeUtilidad


            resultadoTextView.text = "Utilidades: S/ %.2f".format(utilidades)
        }
    }
}
