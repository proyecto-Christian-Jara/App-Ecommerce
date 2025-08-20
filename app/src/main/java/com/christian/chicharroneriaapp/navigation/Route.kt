package com.christian.chicharroneriaapp.navigation

sealed class Route(val path: String) {
    object Splash : Route("splash")
    object Onboarding : Route("onboarding")
    object Login : Route("login")
    object Home : Route("home")
}
