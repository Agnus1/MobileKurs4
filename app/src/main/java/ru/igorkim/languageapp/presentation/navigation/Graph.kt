package ru.igorkim.languageapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import ru.igorkim.languageapp.audition.word_practice.impl.ui.navigation.AuditionScreenRoute
import ru.igorkim.languageapp.auth.impl.ui.navigation.AuthGraphRoute
import ru.igorkim.languageapp.core.design.navigation.NavigationTransitions
import ru.igorkim.languageapp.core.navigation.compose_impl.NavGraphBuilder
import ru.igorkim.languageapp.core.navigation.compose_impl.NavHost
import ru.igorkim.languageapp.core.navigation.compose_impl.route
import ru.igorkim.languageapp.exercises.guess_animal.impl.ui.navigation.GuessAnimalScreenRoute
import ru.igorkim.languageapp.exercises.word_practice.impl.ui.navigation.WordPracticeScreenRoute
import ru.igorkim.languageapp.features.splash.impl.ui.navigation.SplashScreenRoute
import ru.igorkim.languageapp.main.impl.ui.navigation.MainScreenRoute
import ru.igorkim.languageapp.onboarding.impl.ui.navigation.OnboardingScreenRoute
import ru.igorkim.languageapp.profile.impl.ui.navigation.ProfileGraphRoute
import ru.igorkim.languageapp.profile.impl.ui.navigation.SelectLanguageScreenRoute

private fun NavGraphBuilder.buildGraph() {
    route(SplashScreenRoute)
    route(OnboardingScreenRoute)
    route(AuthGraphRoute)
    route(SelectLanguageScreenRoute)
    route(MainScreenRoute)
    route(ProfileGraphRoute)
    route(GuessAnimalScreenRoute)
    route(WordPracticeScreenRoute)
    route(AuditionScreenRoute)
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = SplashScreenRoute,
        enterTransition = NavigationTransitions.enter,
        exitTransition = NavigationTransitions.exit,
        popEnterTransition = NavigationTransitions.popEnter,
        popExitTransition = NavigationTransitions.popExit,
        builder = NavGraphBuilder::buildGraph,
        modifier = modifier,
    )
}
