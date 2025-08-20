package com.tu.paquete.ui.preview

import android.content.res.Configuration
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/** Header con ola arriba (curva en el borde inferior) */
@Composable
private fun WaveHeader(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF002233), // fondo oscuro (como tu captura)
    waveColor: Color = Color(0xFF0066FF)        // azul de la ola
) {
    Canvas(modifier = modifier) {
        // Fondo del header
        drawRect(color = backgroundColor, size = size)

        val w = size.width
        val h = size.height

        // Altura donde se dibuja la línea ondulada (parte inferior del header)
        val waveY = h * 0.65f
        val crest = waveY + h * 0.10f  // cresta (arriba/abajo)
        val trough = waveY - h * 0.06f // valle

        val path = Path().apply {
            // Arriba
            moveTo(0f, 0f)
            lineTo(w, 0f)

            // Borde inferior con curvas de izquierda a derecha
            lineTo(w, waveY)
            quadraticTo(w * 0.85f, crest, w * 0.70f, waveY)
            quadraticTo(w * 0.55f, trough, w * 0.40f, waveY)
            quadraticTo(w * 0.25f, crest, w * 0.12f, waveY)
            lineTo(0f, waveY)

            // Cerrar hacia arriba (rellena la franja)
            lineTo(0f, 0f)
            close()
        }

        drawIntoCanvas {
            drawPath(path = path, color = waveColor)
        }
    }
}

/** Pantalla de ejemplo con el header ondulado y un panel */
@Composable
fun WavePreviewScreen() {
    val bg = Color(0xFF002233)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(bg)
    ) {
        // Header (fondo tipo Haikei)
        WaveHeader(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            backgroundColor = bg,
            waveColor = Color(0xFF0066FF)
        )


    }
}

/* ------- PREVIEWS ------- */



@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Wave Header (Dark)"
)
@Composable
fun Preview_WavePreviewScreen_Dark() {
    WavePreviewScreen()
}
