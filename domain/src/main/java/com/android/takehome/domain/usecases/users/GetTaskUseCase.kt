package com.android.takehome.domain.usecases.users

import com.android.takehome.domain.models.tasks.UserModel
import com.android.takehome.domain.repositories.users.UserRepository
import javax.inject.Inject

class GetTaskUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {

    operator suspend fun invoke(userName: String): UserModel = userRepository.getUserDetail(userName)
}