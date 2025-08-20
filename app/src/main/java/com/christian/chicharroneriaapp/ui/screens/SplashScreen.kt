package com.christian.chicharroneriaapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.christian.chicharroneriaapp.data.UserPrefs
import com.christian.chicharroneriaapp.navigation.Route
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first

@Composable
fun SplashScreen(navController: NavController) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val prefs = remember { UserPrefs(context) }

    LaunchedEffect(Unit) {
        // Simula un pequeño tiempo de splash
        delay(600)

        val seen = prefs.hasSeenOnboarding.first()
        val token = prefs.authToken.first()

        when {
            !seen -> navController.navigate(Route.Onboarding.path) {
                popUpTo(Route.Splash.path) { inclusive = true }
            }
            token.isNullOrBlank() -> navController.navigate(Route.Login.path) {
                popUpTo(Route.Splash.path) { inclusive = true }
            }
            else -> navController.navigate(Route.Home.path) {
                popUpTo(Route.Splash.path) { inclusive = true }
            }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Chicharronería", textAlign = TextAlign.Center)
            Spacer(Modifier.height(12.dp))
            CircularProgressIndicator()
        }
    }
}
