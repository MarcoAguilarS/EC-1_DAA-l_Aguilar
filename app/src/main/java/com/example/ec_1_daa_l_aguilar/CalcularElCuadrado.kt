package com.example.ec_1_daa_l_aguilar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularElCuadrado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcularelcuadrado)

        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val volverButton = findViewById<Button>(R.id.volverButton)

        calcularButton.setOnClickListener {
            // Calcula el cuadrado y la mitad de los números entre 15 y 70
            val numeros = (15..70).toList()
            val resultados = StringBuilder()

            for (numero in numeros) {
                val cuadrado = numero * numero
                val mitad = numero / 2
                resultados.append("Número: $numero, Cuadrado: $cuadrado, Mitad: $mitad\n")
            }

            // Muestra los resultados en el TextView
            resultadoTextView.text = resultados.toString()
        }

        volverButton.setOnClickListener {
            // Regresa a CalcularMayor
            val intent = Intent(this, CalcularMayor::class.java)
            startActivity(intent)
            finish() // Opcional, para cerrar CalcularElCuadrado
        }
    }
}
