package com.android.template.features.userdetail.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.template.domain.models.tasks.UserModel

@Composable
internal fun UserDetailContent(user: UserModel, modifier: Modifier = Modifier) {
    Text(
        text = user.name,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        style = MaterialTheme.typography.bodyLarge,
    )
}

@Preview
@Composable
internal fun TaskDetailContentPreview() {
    UserDetailContent(
        user = UserModel()
    )
}