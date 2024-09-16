package com.android.template.features.users.models

internal sealed class UserListEvent {

    data object FirstRun : UserListEvent()

    data class OpenUserDetail(val userName: String) : UserListEvent()
}