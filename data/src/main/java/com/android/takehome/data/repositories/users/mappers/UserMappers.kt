package com.android.takehome.data.repositories.users.mappers

import com.android.takehome.data.remote.models.responses.users.UserDetailResponse
import com.android.takehome.data.remote.models.responses.users.UserResponse
import com.android.takehome.domain.models.tasks.UserDetailModel
import com.android.takehome.domain.models.tasks.UserModel
import com.android.takehome.domain.utils.orZero

internal fun UserResponse.toUserModel() = UserModel(
    id = id.orZero(),
    avatar = avatarUrl.orEmpty(),
    name = login.orEmpty(),
    landingPageUrl = htmlUrl.orEmpty()
)

internal fun UserDetailResponse.toUserDetailModel() = UserDetailModel(
    userModel = UserModel(
        id = id.orZero(),
        avatar = avatarUrl.orEmpty(),
        name = login.orEmpty()
    ),
    isVisibleLocation = true,
    blogUrl = blog.orEmpty(),
    location = location.orEmpty(),
    followers = followers.orZero(),
    following = following.orZero(),
)

internal fun List<UserResponse>.toUserList() = map { response -> response.toUserModel() }