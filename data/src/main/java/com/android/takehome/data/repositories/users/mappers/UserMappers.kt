package com.android.takehome.data.repositories.users.mappers

import com.android.takehome.data.remote.models.responses.users.UserResponse
import com.android.takehome.domain.models.tasks.UserModel
import com.android.takehome.domain.utils.orZero

internal fun UserResponse.toUserModel() = UserModel(
    id = id.orZero(),
    avatar = avatarUrl.orEmpty(),
    name = login.orEmpty(),
    landingPageUrl = htmlUrl.orEmpty()
)

internal fun List<UserResponse>.toUserList() = map { response -> response.toUserModel() }