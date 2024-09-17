package com.android.takehome.features.userdetail

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.toRoute
import com.android.takehome.compose.uistate.viewmodel.UiStateViewModel
import com.android.takehome.domain.usecases.users.GetUserDetailUseCase
import com.android.takehome.features.userdetail.models.UserDetailDestination
import com.android.takehome.features.userdetail.models.UserDetailEvent
import com.android.takehome.features.userdetail.models.UserDetailUiState
import com.android.takehome.providers.dispatchers.DispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class UserDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val dispatcherProvider: DispatcherProvider,
    private val getUserDetailUseCase: GetUserDetailUseCase,
) : UiStateViewModel<UserDetailUiState, UserDetailEvent>(UserDetailUiState()) {
    private val destination by lazy { savedStateHandle.toRoute<UserDetailDestination>() }

    init {
        val userName = destination.userName
        getUserList(userName = userName)
    }

    private fun getUserList(userName: String) {
        launchSafe (
            context = dispatcherProvider.io,
            hasLoading = true,
            onError = ::showError,
        ) {
            val userDetail = getUserDetailUseCase(userName = userName)
            updateUiState { copy(userDetail = userDetail) }
        }
    }
}