package com.android.takehome.features.userdetail

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.android.takehome.R
import com.android.takehome.compose.components.uistate.UiStateScreen
import com.android.takehome.features.userdetail.components.UserDetailContent
import com.android.takehome.features.userdetail.models.UserDetailEvent
import com.android.takehome.features.users.components.UserTopBar

@Composable
internal fun UserDetailScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: UserDetailViewModel = hiltViewModel(),
) {
    val context = LocalContext.current
    UiStateScreen(
        viewModel = viewModel,
        onEvent = { event ->
            handleEvent(
                event = event,
                context = context,
                navController = navController,
            )
        },
    ) { uiState ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(White),
        ) {
            UserTopBar(
                title = stringResource(R.string.user_details_top_bar_title),
                onBackClick = { navController.navigateUp() },
            )
            UserDetailContent(
                userDetail = uiState.userDetail,
                modifier = modifier
                    .padding(top = 5.dp)
                    .padding(horizontal = 16.dp),
            )
        }
    }
}

private fun handleEvent(
    event: UserDetailEvent,
    context: Context,
    navController: NavController,
) {
    when (event) {
        is UserDetailEvent.onBack -> {
            navController.navigateUp()
        }
    }
}

