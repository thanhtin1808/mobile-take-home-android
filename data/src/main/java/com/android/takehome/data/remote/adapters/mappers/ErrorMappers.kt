package com.android.takehome.data.remote.adapters.mappers

import com.android.takehome.data.remote.models.responses.errors.ErrorResponse
import com.android.takehome.domain.models.errors.ApiException
import com.android.takehome.domain.models.errors.UnauthorizedException
import com.android.takehome.domain.utils.orEmpty
import com.android.takehome.domain.utils.orZero
import com.google.gson.Gson
import retrofit2.Response
import timber.log.Timber
import java.net.HttpURLConnection

internal fun Response<*>.toThrowable(): Throwable {
    if (code() == HttpURLConnection.HTTP_UNAUTHORIZED) {
        return UnauthorizedException()
    }
    val jsonString = errorBody()?.string()
    val errorResponse = try {
        val gson = Gson()
        gson.fromJson(jsonString, ErrorResponse::class.java)
    } catch (exception: Exception) {
        Timber.e(exception, "Error parsing: \n$jsonString")
        return exception
    }
    return ApiException(
        code = errorResponse?.code.orZero(),
        message = errorResponse?.message.orEmpty(),
    )
}