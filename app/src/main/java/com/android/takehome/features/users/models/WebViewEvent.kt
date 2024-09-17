package com.android.takehome.features.users.models

internal sealed class WebViewEvent {
    data object onBack : WebViewEvent()
}