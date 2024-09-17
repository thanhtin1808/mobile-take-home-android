package com.android.takehome.domain.usecases.preferences

import com.android.takehome.domain.repositories.preferences.PreferencesRepository
import javax.inject.Inject

class SetFirstRunUseCase @Inject constructor(
    private val preferencesRepository: PreferencesRepository,
) {

    suspend operator fun invoke(isFirstRun: Boolean) = preferencesRepository.setFirstRun(isFirstRun)
}