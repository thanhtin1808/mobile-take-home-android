package com.android.takehome.domain.usecases.preferences

import com.android.takehome.domain.repositories.preferences.PreferencesRepository
import javax.inject.Inject

class IsFirstRunUseCase @Inject constructor(
    private val preferencesRepository: PreferencesRepository,
) {

    operator fun invoke() = preferencesRepository.isFirstRun()
}