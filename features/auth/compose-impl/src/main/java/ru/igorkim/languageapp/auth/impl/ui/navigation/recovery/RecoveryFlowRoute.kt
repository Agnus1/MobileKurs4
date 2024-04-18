package ru.igorkim.languageapp.auth.impl.ui.navigation.recovery

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import ru.igorkim.languageapp.auth.impl.di.AuthComponent
import ru.igorkim.languageapp.auth.impl.ui.screens.recovery.RecoveryFlow
import ru.igorkim.languageapp.core.navigation.compose_impl.Route

internal object RecoveryFlowRoute : Route.Screen(
    path = RECOVERY_FLOW_ROUTE_PATH
) {
    @Composable
    override fun AnimatedContentScope.Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        RecoveryFlow(
            viewModel = viewModel(
                factory = AuthComponent.recoveryViewModelFactory
            )
        )
    }
}

internal const val RECOVERY_FLOW_ROUTE_PATH = "recovery"
