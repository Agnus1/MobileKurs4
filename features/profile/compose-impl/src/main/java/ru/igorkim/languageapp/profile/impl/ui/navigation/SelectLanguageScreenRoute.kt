package ru.igorkim.languageapp.profile.impl.ui.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import ru.igorkim.languageapp.core.navigation.compose_impl.Route
import ru.igorkim.languageapp.profile.api.ui.navigation.SELECT_LANGUAGE_SCREEN_ROUTE_PATH
import ru.igorkim.languageapp.profile.api.ui.navigation.SelectLanguageScreenArguments
import ru.igorkim.languageapp.profile.impl.di.ProfileComponent
import ru.igorkim.languageapp.profile.impl.ui.screens.select_language.SelectLanguageScreen

object SelectLanguageScreenRoute : Route.Screen(
    path = SELECT_LANGUAGE_SCREEN_ROUTE_PATH,
    namedNavArguments = listOf(
        navArgument(SelectLanguageScreenArguments.CAN_GO_BACK) {
            type = NavType.BoolType
        }
    )
) {
    @Composable
    override fun AnimatedContentScope.Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        SelectLanguageScreen(
            viewModel = viewModel(
                factory = ProfileComponent.getSelectLanguageViewModelFactory(
                    canGoBack = navBackStackEntry.arguments?.getBoolean(
                        SelectLanguageScreenArguments.CAN_GO_BACK
                    ) ?: false
                )
            )
        )
    }
}
