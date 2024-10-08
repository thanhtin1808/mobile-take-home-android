package com.android.takehome.domain.usecases.users

import com.android.takehome.domain.models.users.UserDetailModel
import com.android.takehome.domain.repositories.users.UserRepository
import javax.inject.Inject

class GetUserDetailUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {

    operator suspend fun invoke(userName: String): UserDetailModel = userRepository.getUserDetail(userName)
}