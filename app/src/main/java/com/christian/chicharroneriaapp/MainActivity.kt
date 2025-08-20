package com.christian.chicharroneriaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.christian.chicharroneriaapp.navigation.Route
import com.christian.chicharroneriaapp.ui.screens.HomeScreen
import com.christian.chicharroneriaapp.ui.screens.LoginScreen
import com.christian.chicharroneriaapp.ui.screens.OnboardingScreen
import com.christian.chicharroneriaapp.ui.screens.Register
import com.christian.chicharroneriaapp.ui.screens.SplashScreen
import com.christian.chicharroneriaapp.ui.theme.ChicharroneriaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChicharroneriaAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Route.Splash.path
                    ) {
                        composable(Route.Splash.path) {
                            SplashScreen(navController)
                        }
                        composable(Route.Onboarding.path) {
                            OnboardingScreen(navController)
                        }
                        composable(Route.Login.path) {
                            LoginScreen(navController)
                        }
                        composable(Route.Home.path) {
                            HomeScreen(navController)
                        }

                        composable("register") { Register(navController) }
                    }
                }
            }
        }
    }
}
