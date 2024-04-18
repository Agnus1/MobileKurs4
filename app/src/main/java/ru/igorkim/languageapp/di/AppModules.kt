package ru.igorkim.languageapp.di

import ru.igorkim.languageapp.audition.word_practice.impl.di.auditionModule
import ru.igorkim.languageapp.auth.impl.di.authModule
import ru.igorkim.languageapp.core.coroutines.dispatchers.di.dispatchersModule
import ru.igorkim.languageapp.core.coroutines.scopes.di.coroutineScopesModule
import ru.igorkim.languageapp.core.data.http_client.di.httpClientModule
import ru.igorkim.languageapp.core.data.serialization.di.serializationModule
import ru.igorkim.languageapp.core.data.supabase.di.supabaseModule
import ru.igorkim.languageapp.core.di.androidLoggerModule
import ru.igorkim.languageapp.core.env.di.androidEnvironmentConfigModule
import ru.igorkim.languageapp.core.profiles.impl.di.profilesModule
import ru.igorkim.languageapp.exercises.guess_animal.impl.di.guessAnimalModule
import ru.igorkim.languageapp.exercises.word_practice.impl.di.wordPracticeModule
import ru.igorkim.languageapp.main.impl.di.mainModule
import ru.igorkim.languageapp.onboarding.impl.di.onboardingModule
import ru.igorkim.languageapp.profile.impl.di.profileModule

val appModules = listOf(
    appModule,
    coilModule,
    dispatchersModule,
    coroutineScopesModule,
    httpClientModule,
    serializationModule,
    supabaseModule,
    composeNavigationModule,
    profilesModule,
    androidLoggerModule,
    androidEnvironmentConfigModule,
    onboardingModule,
    authModule,
    mainModule,
    profileModule,
    guessAnimalModule,
    wordPracticeModule,
    auditionModule,
)
