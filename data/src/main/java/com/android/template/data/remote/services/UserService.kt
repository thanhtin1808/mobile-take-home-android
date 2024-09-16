package com.android.template.data.remote.services

internal interface UserService {
    suspend fun getUserList(): Any
}