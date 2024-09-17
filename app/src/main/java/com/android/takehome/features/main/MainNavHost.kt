package com.android.takehome.features.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.takehome.features.userdetail.TaskDetailScreen
import com.android.takehome.features.userdetail.models.UserDetailDestination
import com.android.takehome.features.users.UserListScreen
import com.android.takehome.features.users.components.WebViewScreen
import com.android.takehome.features.users.models.UserListDestination
import com.android.takehome.features.users.models.WebViewDestination

@Composable
internal fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = UserListDestination,
        modifier = modifier,
    ) {
        composable<UserListDestination> {
            UserListScreen(
                navController = navController,
            )
        }

        composable<UserDetailDestination> {
            TaskDetailScreen(
                navController = navController,
            )
        }
        composable<WebViewDestination>{
            WebViewScreen(
                navController = navController,
            )
        }
    }
}