package com.android.takehome.compose.uistate.models

data class ErrorState(
    val throwable: Throwable? = null,
) {
    fun hasError() = throwable != null
}