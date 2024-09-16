package com.android.template.domain.usecases.users

import com.android.template.domain.repositories.users.UserRepository
import javax.inject.Inject

class GetUserListUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {

    suspend operator fun invoke() = userRepository.getUserList()
}
