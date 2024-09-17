package com.android.takehome.features.users.models

import com.android.takehome.domain.models.users.UserModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

internal data class UserListUiState(
    val users: PersistentList<UserModel> = persistentListOf(),
)