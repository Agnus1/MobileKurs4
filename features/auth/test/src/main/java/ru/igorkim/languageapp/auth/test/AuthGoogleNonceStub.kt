package ru.igorkim.languageapp.auth.test

import ru.igorkim.languageapp.auth.api.domain.google.AuthGoogleNonce
import ru.igorkim.languageapp.auth.api.domain.google.AuthGoogleNonceProvider

object AuthGoogleNonceProviderStub : AuthGoogleNonceProvider {
    override suspend fun provideNonce() = AuthGoogleNonce("", "")
}
