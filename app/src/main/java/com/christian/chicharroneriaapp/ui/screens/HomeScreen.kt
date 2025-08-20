package com.christian.chicharroneriaapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.christian.chicharroneriaapp.data.UserPrefs
import com.christian.chicharroneriaapp.navigation.Route
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavController) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val prefs = remember { UserPrefs(context) }
    val scope = remember { CoroutineScope(Dispatchers.IO) }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("🏠 Home — Catálogo vendrá aquí")
            Spacer(Modifier.height(16.dp))
            Button(onClick = {
                scope.launch { prefs.setAuthToken(null) }
                navController.navigate(Route.Login.path) {
                    popUpTo(Route.Home.path) { inclusive = true }
                }
            }) { Text("Cerrar sesión") }
        }
    }
}
