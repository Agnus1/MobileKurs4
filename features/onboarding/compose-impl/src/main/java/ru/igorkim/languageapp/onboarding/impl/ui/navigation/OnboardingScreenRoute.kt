package ru.igorkim.languageapp.onboarding.impl.ui.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import ru.igorkim.languageapp.core.navigation.compose_impl.Route
import ru.igorkim.languageapp.onboarding.api.ui.navigation.ONBOARDING_SCREEN_ROUTE_PATH
import ru.igorkim.languageapp.onboarding.impl.di.OnboardingComponent
import ru.igorkim.languageapp.onboarding.impl.ui.screens.onboarding.OnboardingScreen

object OnboardingScreenRoute : Route.Screen(
    path = ONBOARDING_SCREEN_ROUTE_PATH
) {
    @Composable
    override fun AnimatedContentScope.Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        OnboardingScreen(
            viewModel = viewModel(
                factory = OnboardingComponent.onboardingViewModelFactory
            )
        )
    }
}
