package ru.igorkim.languageapp.di

import android.app.Application
import org.koin.dsl.module
import ru.igorkim.languageapp.LanguageApplication

val appModule = module {
    single<Application> { LanguageApplication.instance }
}
