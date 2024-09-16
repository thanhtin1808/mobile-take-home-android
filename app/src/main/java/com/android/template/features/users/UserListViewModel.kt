package com.android.template.features.users

import com.android.template.compose.uistate.viewmodel.UiStateViewModel
import com.android.template.domain.models.tasks.UserModel
import com.android.template.domain.usecases.preferences.IsFirstRunUseCase
import com.android.template.domain.usecases.preferences.SetFirstRunUseCase
import com.android.template.domain.usecases.users.GetUserListUseCase
import com.android.template.domain.utils.orTrue
import com.android.template.features.users.models.UserListEvent
import com.android.template.features.users.models.UserListUiState
import com.android.template.providers.dispatchers.DispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.firstOrNull
import javax.inject.Inject

@HiltViewModel
internal class UserListViewModel @Inject constructor(
    private val dispatcherProvider: DispatcherProvider,
    private val getUserListUseCase: GetUserListUseCase,
    private val isFirstRunUseCase: IsFirstRunUseCase,
    private val setFirstRunUseCase: SetFirstRunUseCase,
) : UiStateViewModel<UserListUiState, UserListEvent>(UserListUiState()) {

    init {
        getUserList()
//        checkFirstRun()
    }

    private fun checkFirstRun() {
        launchSafe {
            val isFirstRun = isFirstRunUseCase().firstOrNull().orTrue()
            if (isFirstRun) {
                setFirstRunUseCase(false)
                sendEvent(UserListEvent.FirstRun)
            }
        }
    }

    private fun getUserList() {
        launchSafe (
            context = dispatcherProvider.io,
            hasLoading = true,
            onError = ::showError,
        ) {
            val userList = getUserListUseCase()
            updateUiState { copy(users = userList.toPersistentList()) }
        }
    }

    fun createTask() {
        launchSafe(
            context = dispatcherProvider.io,
            hasLoading = true,
            onError = ::showError,
        ) {
        }
    }

    fun openTaskDetail(user: UserModel) {
        sendEvent(UserListEvent.OpenUserDetail(user.name))
    }
}