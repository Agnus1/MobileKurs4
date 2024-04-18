package ru.igorkim.languageapp.core.di

import org.koin.dsl.module
import ru.igorkim.languageapp.core.AppLogger
import ru.igorkim.languageapp.core.AppLoggerAndroid

val androidLoggerModule = module {
    single<AppLogger> { AppLoggerAndroid() }
}
