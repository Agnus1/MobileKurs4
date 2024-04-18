package ru.igorkim.languageapp.auth.impl.ui.navigation.recovery

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import ru.igorkim.languageapp.auth.impl.ui.screens.recovery.RecoveryFlowViewModel
import ru.igorkim.languageapp.auth.impl.ui.screens.recovery.check_email.RecoveryCheckEmailScreen
import ru.igorkim.languageapp.core.navigation.compose_impl.Route

internal class RecoveryCheckEmailScreenRoute(
    private val recoveryViewModelProvider: () -> RecoveryFlowViewModel,
) : Route.Screen(
    path = RECOVERY_CHECK_EMAIL_SCREEN_ROUTE_PATH
) {
    @Composable
    override fun AnimatedContentScope.Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        RecoveryCheckEmailScreen(viewModel = recoveryViewModelProvider())
    }
}

internal const val RECOVERY_CHECK_EMAIL_SCREEN_ROUTE_PATH = "recovery_check_email"
