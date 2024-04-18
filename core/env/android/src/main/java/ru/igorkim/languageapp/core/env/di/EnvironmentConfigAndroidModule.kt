package ru.igorkim.languageapp.core.env.di

import org.koin.dsl.module
import ru.igorkim.languageapp.core.env.EnvironmentConfig
import ru.igorkim.languageapp.core.env.EnvironmentConfigAndroid

val androidEnvironmentConfigModule = module {
    single<EnvironmentConfig> { EnvironmentConfigAndroid() }
}
