package com.android.takehome.features.userdetail.models

import com.android.takehome.domain.models.tasks.UserModel

internal data class UserDetailUiState(
    val user: UserModel = UserModel(),
)