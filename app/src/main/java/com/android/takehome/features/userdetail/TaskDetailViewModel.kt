package com.android.takehome.features.userdetail

import androidx.lifecycle.SavedStateHandle
import com.android.takehome.compose.uistate.models.EmptyEvent
import com.android.takehome.compose.uistate.viewmodel.UiStateViewModel
import com.android.takehome.domain.usecases.users.GetTaskUseCase
import com.android.takehome.features.userdetail.models.UserDetailUiState
import com.android.takehome.providers.dispatchers.DispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class TaskDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val dispatcherProvider: DispatcherProvider,
    private val getTaskUseCase: GetTaskUseCase,
) : UiStateViewModel<UserDetailUiState, EmptyEvent>(UserDetailUiState()) {

    init {
    }
}