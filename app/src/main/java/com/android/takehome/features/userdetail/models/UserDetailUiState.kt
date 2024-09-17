package com.android.takehome.features.userdetail.models

import com.android.takehome.domain.models.users.UserDetailModel

internal data class UserDetailUiState(
    val userDetail: UserDetailModel = UserDetailModel(),
)