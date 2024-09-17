package com.android.takehome.compose.uistate.mappers

import android.content.Context
import com.android.takehome.R
import com.android.takehome.domain.models.errors.ApiException
import com.android.takehome.domain.models.errors.NoConnectionException
import com.android.takehome.domain.models.errors.UnauthorizedException

fun Throwable?.toReadableMessage(context: Context): String {
    return when (this) {
        is NoConnectionException -> context.getString(R.string.error_message_no_internet_connection)
        is UnauthorizedException -> context.getString(R.string.error_message_unauthorized)
        is ApiException -> message
        else -> context.getString(R.string.error_message_generic)
    }
}