package com.example.contadormarcadores

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contadormarcadores.ui.theme.ContadorMarcadoresTheme

class MainActivity : ComponentActivity() {
    var contadorLocal = 0
    var contadorVisitante = 0
    var contadorLocalPersonales = 0
    var contadorVisitantePersonales = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que este sea el nombre correcto del archivo XML

        val textViewMarcadorLocal = findViewById<TextView>(R.id.textViewMarcadorLocal)
        val textViewMarcadorVisitante = findViewById<TextView>(R.id.textViewMarcadorVisitante)
        val textViewPLocal = findViewById<TextView>(R.id.textViewPLocal)
        val testViewPVisitante = findViewById<TextView>(R.id.textViewPVisitante)

        // Asignar clics a los botones
        val Plus1Local = findViewById<Button>(R.id.buttonPlus1Local)
        val Plus2Local = findViewById<Button>(R.id.buttonPlus2Local)
        val Plus3Local = findViewById<Button>(R.id.buttonPlus3Local)
        val Minus1Local = findViewById<Button>(R.id.buttonMinus1Local)
        val Plus1PLocal2 = findViewById<Button>(R.id.buttonPlus1PLocal)
        val Minus1PLocal2 = findViewById<Button>(R.id.buttonMinus1PLocal)
        val ResetPersonalLocal = findViewById<Button>(R.id.ResetLocal)

        val Plus1Visitante = findViewById<Button>(R.id.buttonPlus1Visitante)
        val Plus2Visitante = findViewById<Button>(R.id.buttonPlus2Visitante)
        val Plus3Visitante = findViewById<Button>(R.id.buttonPlus3Visitante)
        val Minus1Visitante = findViewById<Button>(R.id.buttonMinus1Visitante)
        val Minus1PVisitante = findViewById<Button>(R.id.buttonMinus1PVisitante)
        val Plus1PVisitante = findViewById<Button>(R.id.buttonPlus1PVisitante)
        val ResetPersonalVisitante = findViewById<Button>(R.id.ResetVisitante)

        val ResetTotal = findViewById<Button>(R.id.ResetTotal)

        // Configurar clics de los botones
        Plus1Local.setOnClickListener {
            contadorLocal++
            textViewMarcadorLocal.text = contadorLocal.toString()
        }

        Plus2Local.setOnClickListener {
            contadorLocal += 2
            textViewMarcadorLocal.text = contadorLocal.toString()
        }
        Plus3Local.setOnClickListener {
            contadorLocal+=3
            textViewMarcadorLocal.setText(contadorLocal.toString())
        }
        Minus1Local.setOnClickListener {
            contadorLocal-=1
            textViewMarcadorLocal.setText(contadorLocal.toString())
        }
        Plus1PLocal2.setOnClickListener {
            contadorLocalPersonales+=1
            textViewPLocal.setText(contadorLocalPersonales.toString())
        }
        Minus1PLocal2.setOnClickListener {
            contadorLocalPersonales-=1
            textViewPLocal.setText(contadorLocalPersonales.toString())
        }
        //visitante
        Plus1Visitante.setOnClickListener {
            contadorVisitante++
            textViewMarcadorVisitante.setText(contadorVisitante.toString())
        }
        Plus2Visitante.setOnClickListener {
            contadorVisitante+=2
            textViewMarcadorVisitante.setText(contadorVisitante.toString())
        }
        Plus3Visitante.setOnClickListener {
            contadorVisitante+=3
            textViewMarcadorVisitante.setText(contadorVisitante.toString())
        }
        Minus1Visitante.setOnClickListener {
            contadorVisitante-=1
            textViewMarcadorVisitante.setText(contadorVisitante.toString())
        }
        Plus1PVisitante.setOnClickListener {
            contadorVisitantePersonales+=1
            testViewPVisitante.setText(contadorVisitantePersonales.toString())
        }
        Minus1PVisitante.setOnClickListener {
            contadorVisitantePersonales-=1
            testViewPVisitante.setText(contadorVisitantePersonales.toString())
        }

        ResetTotal.setOnClickListener {
            // Lógica para restablecer todo a cero
            contadorLocal = 0
            contadorVisitante = 0
            contadorLocalPersonales = 0
            contadorVisitantePersonales = 0

            // Actualizar los TextViews correspondientes
            textViewMarcadorLocal.text = contadorLocal.toString()
            textViewMarcadorVisitante.text = contadorVisitante.toString()
            textViewPLocal.text = contadorLocalPersonales.toString()
            testViewPVisitante.text = contadorVisitantePersonales.toString()
        }
        ResetPersonalLocal.setOnClickListener {
            contadorLocalPersonales = 0
            textViewPLocal.text = contadorLocalPersonales.toString()
        }
        ResetPersonalVisitante.setOnClickListener {
            contadorVisitantePersonales = 0
            testViewPVisitante.text = contadorVisitantePersonales.toString()
        }
    }
}