package ru.igorkim.languageapp.auth.impl.domain

import ru.igorkim.languageapp.auth.api.domain.AuthSignOutUseCase
import ru.igorkim.languageapp.auth.api.domain.AuthRepository
import ru.igorkim.languageapp.core.profiles.api.domain.ProfilesRepository

internal class AuthSignOutUseCaseImpl(
    private val authRepository: AuthRepository,
    private val profilesRepository: ProfilesRepository,
) : AuthSignOutUseCase {
    override suspend fun invoke() {
        profilesRepository.clearCachedUserProfile()
        authRepository.signOut()
    }
}
