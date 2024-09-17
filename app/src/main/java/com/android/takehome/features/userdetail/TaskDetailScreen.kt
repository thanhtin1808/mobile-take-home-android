package com.android.takehome.features.userdetail

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.android.takehome.compose.components.uistate.UiStateScreen
import com.android.takehome.features.userdetail.components.UserDetailContent
import com.android.takehome.features.userdetail.components.TaskDetailTopBar

@Composable
internal fun TaskDetailScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: TaskDetailViewModel = hiltViewModel(),
) {
    UiStateScreen(viewModel = viewModel) { uiState ->
        Scaffold(
            modifier = modifier,
            topBar = { TaskDetailTopBar(onBackClick = navController::navigateUp) },
        ) { innerPadding ->
            UserDetailContent(
                user = uiState.user,
                modifier = modifier.padding(innerPadding),
            )
        }
    }
}