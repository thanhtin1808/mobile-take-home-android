package com.android.takehome.features.users

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.toRoute
import com.android.takehome.compose.uistate.viewmodel.UiStateViewModel
import com.android.takehome.features.users.models.WebViewDestination
import com.android.takehome.features.users.models.WebViewEvent
import com.android.takehome.features.users.models.WebViewUiState
import com.android.takehome.providers.dispatchers.DispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class WebViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val dispatcherProvider: DispatcherProvider,
) : UiStateViewModel<WebViewUiState, WebViewEvent>(WebViewUiState()) {
    private val destination by lazy { savedStateHandle.toRoute<WebViewDestination>() }

    init {
        val url = destination.url
        updateUiState { copy(url = url) }
    }

}