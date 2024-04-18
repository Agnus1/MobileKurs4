package ru.igorkim.languageapp.di

import org.koin.dsl.module
import ru.igorkim.languageapp.core.navigation.api.Router
import ru.igorkim.languageapp.core.navigation.compose_impl.ComposeRouter

val composeNavigationModule = module {
    single<ComposeRouter> { ComposeRouter() }
    single<Router> { get<ComposeRouter>() }
}
