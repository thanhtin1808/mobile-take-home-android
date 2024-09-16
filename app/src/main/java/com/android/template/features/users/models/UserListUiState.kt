package com.android.template.features.users.models

import com.android.template.domain.models.tasks.UserModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

internal data class UserListUiState(
    val users: PersistentList<UserModel> = persistentListOf(),
)