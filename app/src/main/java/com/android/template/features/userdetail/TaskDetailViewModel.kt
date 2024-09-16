package com.android.template.features.userdetail

import androidx.lifecycle.SavedStateHandle
import com.android.template.compose.uistate.models.EmptyEvent
import com.android.template.compose.uistate.viewmodel.UiStateViewModel
import com.android.template.domain.usecases.users.GetTaskUseCase
import com.android.template.features.userdetail.models.UserDetailUiState
import com.android.template.providers.dispatchers.DispatcherProvider
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