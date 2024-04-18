package ru.igorkim.languageapp.auth.impl.ui.navigation

import ru.igorkim.languageapp.auth.api.ui.navigation.AUTH_GRAPH_ROUTE_PATH
import ru.igorkim.languageapp.auth.impl.ui.navigation.recovery.RecoveryFlowRoute
import ru.igorkim.languageapp.auth.impl.ui.navigation.sign_in.SIGN_IN_SCREEN_ROUTE_PATH
import ru.igorkim.languageapp.auth.impl.ui.navigation.sign_in.SignInScreenRoute
import ru.igorkim.languageapp.auth.impl.ui.navigation.sign_up.SignUpFlowRoute
import ru.igorkim.languageapp.core.navigation.compose_impl.Route
import ru.igorkim.languageapp.core.navigation.compose_impl.route

object AuthGraphRoute : Route.Graph(
    path = AUTH_GRAPH_ROUTE_PATH,
    startDestination = SIGN_IN_SCREEN_ROUTE_PATH,
    builder = {
        route(SignInScreenRoute)
        route(SignUpFlowRoute)
        route(RecoveryFlowRoute)
    }
)
