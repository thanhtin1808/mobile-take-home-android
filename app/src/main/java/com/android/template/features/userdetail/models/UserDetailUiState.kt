package com.android.template.features.userdetail.models

import com.android.template.domain.models.tasks.UserModel

internal data class UserDetailUiState(
    val user: UserModel = UserModel(),
)