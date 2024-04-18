package ru.igorkim.languageapp.di

import android.content.Intent
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject
import ru.igorkim.languageapp.core.navigation.compose_impl.ComposeRouter
import ru.igorkim.languageapp.presentation.AuthEventListenerViewModel
import ru.igorkim.languageapp.presentation.InitializationViewModel
import ru.igorkim.languageapp.presentation.ThemeViewModel

object AppComponent : KoinComponent {
    val router: ComposeRouter by inject()

    fun getInitializationViewModelFactory(intent: Intent) =
        viewModelFactory {
            initializer {
                InitializationViewModel(
                    onboardingRepository = get(),
                    authRepository = get(),
                    router = get(),
                    deepLinkRouters = getKoin().getAll(),
                    savedStateHandle = createSavedStateHandle(),
                    intent = intent,
                )
            }
        }

    fun getThemeViewModelFactory() =
        viewModelFactory {
            initializer {
                ThemeViewModel(
                    settingsRepository = get(),
                )
            }
        }

    fun getAuthEventListenerViewModelFactory() =
        viewModelFactory {
            initializer {
                AuthEventListenerViewModel(
                    authRepository = get(),
                    router = get(),
                )
            }
        }
}
