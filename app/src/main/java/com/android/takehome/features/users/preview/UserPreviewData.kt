package com.android.takehome.features.users.preview

import com.android.takehome.domain.models.users.UserModel


internal val previewUserList = MutableList(8) {
    index ->
    UserModel(
        id = index,
        avatar = "",
        name = "David $index",
        landingPageUrl = "https://www.linkedin.com/"
    )
}