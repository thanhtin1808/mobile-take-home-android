package com.android.takehome.domain.usecases.users

import com.android.takehome.domain.repositories.users.UserRepository
import javax.inject.Inject

class GetUserListUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {

    suspend operator fun invoke() = userRepository.getUserList()
}
