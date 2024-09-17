package com.android.takehome.features.users

import com.android.takehome.compose.uistate.viewmodel.UiStateViewModel
import com.android.takehome.domain.models.users.UserModel
import com.android.takehome.domain.usecases.preferences.IsFirstRunUseCase
import com.android.takehome.domain.usecases.preferences.SetFirstRunUseCase
import com.android.takehome.domain.usecases.users.GetUserListUseCase
import com.android.takehome.domain.utils.orTrue
import com.android.takehome.features.users.models.UserListEvent
import com.android.takehome.features.users.models.UserListUiState
import com.android.takehome.providers.dispatchers.DispatcherProvider
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
        checkFirstRun()
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

    fun openUserDetail(user: UserModel) {
        sendEvent(UserListEvent.OpenUserDetail(user.name))
    }

    fun onBackPress() {
        sendEvent(UserListEvent.onBackPress)
    }

    fun openUserLandingPage(user: UserModel) {
        sendEvent(UserListEvent.OpenUserLandingPage(user.landingPageUrl))
    }
}