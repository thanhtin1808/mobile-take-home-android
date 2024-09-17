package com.android.takehome.features.userdetail.models

import com.android.takehome.domain.models.tasks.UserDetailModel

internal data class UserDetailUiState(
    val userDetail: UserDetailModel = UserDetailModel(),
)