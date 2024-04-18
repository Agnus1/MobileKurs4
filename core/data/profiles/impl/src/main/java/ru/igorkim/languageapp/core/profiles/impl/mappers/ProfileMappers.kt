package ru.igorkim.languageapp.core.profiles.impl.mappers

import ru.igorkim.languageapp.core.profiles.api.domain.Profile
import ru.igorkim.languageapp.core.profiles.impl.data.ProfileData

internal fun ProfileData.toDomain() = Profile(
    id = id,
    firstName = firstName,
    lastName = lastName,
    email = email,
    totalScore = totalScore,
    avatarUrl = avatarUrl
)

internal fun Profile.toData() = ProfileData(
    id = id,
    firstName = firstName,
    lastName = lastName,
    email = email,
    totalScore = totalScore,
    avatarUrl = avatarUrl
)
