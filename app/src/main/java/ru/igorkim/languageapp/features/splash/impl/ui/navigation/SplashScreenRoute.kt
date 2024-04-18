package ru.igorkim.languageapp.features.splash.impl.ui.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import ru.igorkim.languageapp.core.navigation.compose_impl.Route
import ru.igorkim.languageapp.features.splash.api.navigation.SPLASH_SCREEN_ROUTE_PATH
import ru.igorkim.languageapp.features.splash.impl.ui.SplashScreen

object SplashScreenRoute : Route.Screen(
    path = SPLASH_SCREEN_ROUTE_PATH
) {
    @Composable
    override fun AnimatedContentScope.Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        SplashScreen()
    }
}
