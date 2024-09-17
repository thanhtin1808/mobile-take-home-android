package com.android.takehome.features.users.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.takehome.domain.models.tasks.UserModel
import com.android.takehome.features.users.preview.previewUserList

@Composable
internal fun UserList(
    users: List<UserModel>,
    modifier: Modifier = Modifier,
    onUserLandingPageClick: (UserModel) -> Unit = {},
    onUserClick: (UserModel) -> Unit = {},
) {
    LazyColumn(
        modifier = modifier
            .padding(top = 5.dp)
            .padding(horizontal = 16.dp)
    ) {
        items(users.size, key = { index -> users[index].id }) { index ->
            val user = users[index]
            Spacer(
                modifier = Modifier.height(3.dp),
            )
            UserItem(
                userModel = user,
                onUserLandingPageClick = { onUserLandingPageClick(user) },
                onUserClick = {onUserClick(user)}
            )
            Spacer(
                modifier = Modifier.height(5.dp),
            )
        }
    }
}

@Preview
@Composable
internal fun UserListPreview() {
    UserList(
        users = previewUserList
    )
}

