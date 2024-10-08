package com.android.takehome.features.users

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.android.takehome.R
import com.android.takehome.compose.components.uistate.UiStateScreen
import com.android.takehome.features.userdetail.models.UserDetailDestination
import com.android.takehome.features.users.components.UserList
import com.android.takehome.features.users.components.UserTopBar
import com.android.takehome.features.users.models.UserListEvent
import com.android.takehome.features.users.models.WebViewDestination

@Composable
internal fun UserListScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: UserListViewModel = hiltViewModel(),
) {
    val context = LocalContext.current
    BackHandler {
        val activity = (context as? Activity)
        activity?.finish()
    }
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
        Column (
            modifier = modifier
                .fillMaxSize()
                .background(White),
        ) {
            UserTopBar(
                title = stringResource(R.string.user_list_home_top_bar_title),
                onBackClick = viewModel::onBackPress,
            )
            UserList(
                users = uiState.users,
                onUserLandingPageClick = viewModel::openUserLandingPage,
                onUserClick = viewModel::openUserDetail,
                onLoadMore = { viewModel.loadMore() },
            )
        }
    }
}

private fun handleEvent(
    event: UserListEvent,
    context: Context,
    navController: NavController,
) {
    when (event) {
        is UserListEvent.FirstRun -> {
            Toast.makeText(context, R.string.first_run_message, Toast.LENGTH_SHORT).show()
        }

        is UserListEvent.onBackPress -> {
            val activity = (context as? Activity)
            activity?.finish()
        }

        is UserListEvent.OpenUserDetail -> {
            navController.navigate(UserDetailDestination(userName = event.userName))
        }

        is UserListEvent.OpenUserLandingPage -> {
            navController.navigate(WebViewDestination(url = event.url))
        }
    }
}

