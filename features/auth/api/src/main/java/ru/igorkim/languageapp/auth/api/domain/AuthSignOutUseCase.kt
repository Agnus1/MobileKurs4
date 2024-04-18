package ru.igorkim.languageapp.auth.api.domain

interface AuthSignOutUseCase {
    suspend operator fun invoke()
}
