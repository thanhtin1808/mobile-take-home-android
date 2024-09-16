package com.android.template.data.repositories.tasks

import com.android.template.data.remote.services.UserService
import com.android.template.domain.models.tasks.UserModel
import com.android.template.domain.repositories.users.UserRepository
import javax.inject.Inject

internal class UserRepositoryImpl @Inject constructor(
    private val userService: UserService,
) : UserRepository {

    override suspend fun getUserList(): List<UserModel> {
        return previewUserList
    }

    override suspend fun getUserDetail(userName: String): UserModel {
        return UserModel()
    }
}

internal val previewUserList = MutableList(6) { index ->
    UserModel(
        id = index,
        avatar = "",
        name = "David ${index +1}",
        landingPageUrl = "https://www.linkedin.com/"
    )
}