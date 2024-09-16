package com.android.template.features.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.template.features.userdetail.TaskDetailScreen
import com.android.template.features.userdetail.models.UserDetailDestination
import com.android.template.features.users.UserListScreen
import com.android.template.features.users.models.UserListDestination

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
    }
}