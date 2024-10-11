package com.example.ec_1_daa_l_aguilar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularMayor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcularmayor_main)

        val numero1EditText = findViewById<EditText>(R.id.numero1)
        val numero2EditText = findViewById<EditText>(R.id.numero2)
        val numero3EditText = findViewById<EditText>(R.id.numero3)
        val numero4EditText = findViewById<EditText>(R.id.numero4)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)

        calcularButton.setOnClickListener {
            // Obtiene los valores de los campos de texto
            val num1 = numero1EditText.text.toString().toIntOrNull() ?: 0
            val num2 = numero2EditText.text.toString().toIntOrNull() ?: 0
            val num3 = numero3EditText.text.toString().toIntOrNull() ?: 0
            val num4 = numero4EditText.text.toString().toIntOrNull() ?: 0

            // Calcula el mayor número
            val mayor = maxOf(num1, num2, num3, num4)

            // Muestra el resultado
            resultadoTextView.text = "El número mayor es: $mayor"
        }
    }
}
