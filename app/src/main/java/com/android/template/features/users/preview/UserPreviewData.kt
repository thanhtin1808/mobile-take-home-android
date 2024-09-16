package com.android.template.features.users.preview

import com.android.template.domain.models.tasks.UserModel


internal val previewUserList = MutableList(8) {
    index ->
    UserModel(
        id = index,
        avatar = "",
        name = "David $index",
        landingPageUrl = "https://www.linkedin.com/"
    )
}