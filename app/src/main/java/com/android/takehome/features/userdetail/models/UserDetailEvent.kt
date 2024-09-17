package com.android.takehome.features.userdetail.models

internal sealed class UserDetailEvent {
    data object onBack : UserDetailEvent()
}