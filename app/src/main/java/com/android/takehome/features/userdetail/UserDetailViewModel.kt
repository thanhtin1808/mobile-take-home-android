package com.android.takehome.features.userdetail

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.toRoute
import com.android.takehome.compose.uistate.viewmodel.UiStateViewModel
import com.android.takehome.domain.models.tasks.UserDetailModel
import com.android.takehome.domain.models.tasks.UserModel
import com.android.takehome.domain.usecases.users.GetTaskUseCase
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
    private val getTaskUseCase: GetTaskUseCase,
) : UiStateViewModel<UserDetailUiState, UserDetailEvent>(UserDetailUiState()) {
    private val destination by lazy { savedStateHandle.toRoute<UserDetailDestination>() }

    init {
        val userName = destination.userName
        updateUiState {
            copy(
                userDetail = UserDetailModel(
                    userModel = UserModel(name = userName),
                    isVisibleLocation = true,
                    location = "Vietnam",
                    followers = 0,
                    following = 0,
                )
            )
        }
    }

//    private fun getTask(taskId: String) {
//        getTaskUseCase(taskId).collectSafe(
//            context = dispatcherProvider.io,
//            hasLoading = true,
//            onError = ::showError,
//        ) { task ->
//            updateUiState { copy(task = task) }
//        }
//    }
}