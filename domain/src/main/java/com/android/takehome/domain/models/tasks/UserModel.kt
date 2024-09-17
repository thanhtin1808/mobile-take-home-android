package com.android.takehome.domain.models.tasks

data class UserModel(
    val id: Int = 0,
    val avatar: String = "",
    val name: String = "",
    val landingPageUrl: String = "",
)

data class UserDetailModel(
    val userModel: UserModel = UserModel(),
    val isVisibleLocation: Boolean = false,
    val location: String = "Vietnam",
    val blogUrl: String = "https://blog.abc",
    val followers: Int = 0,
    val following: Int = 0,
)