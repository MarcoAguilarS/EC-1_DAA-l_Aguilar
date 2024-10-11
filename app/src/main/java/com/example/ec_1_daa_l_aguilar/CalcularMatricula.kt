package com.example.ec_1_daa_l_aguilar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularMatricula : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcular_matricula)

        // Referencias a los elementos de la UI
        val materiasEditText = findViewById<EditText>(R.id.materiasEditText)
        val calcularButton = findViewById<Button>(R.id.calcularButton)
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)

        calcularButton.setOnClickListener {
            // Obtiene el número de materias
            val numeroMaterias = materiasEditText.text.toString().toIntOrNull() ?: 0

            // Costo por materia
            val costoPorMateria = 520
            var totalMatricula = numeroMaterias * costoPorMateria

            // Aplica descuento si hay más de 5 materias
            if (numeroMaterias > 5) {
                totalMatricula = (totalMatricula * 0.90).toInt() // Aplica un 10% de descuento
            }

            // Muestra el resultado
            resultadoTextView.text = "Total de matrícula: S/ $totalMatricula"
        }
    }
}
