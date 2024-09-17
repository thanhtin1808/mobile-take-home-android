package com.android.takehome.data.remote.services

import com.android.takehome.data.remote.models.responses.users.UserDetailResponse
import com.android.takehome.data.remote.models.responses.users.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

internal interface UserService {
    @GET("/users?per_page=20&since=1")
    suspend fun getUserList(): List<UserResponse>
    @GET("/users/{login_username}")
    suspend fun getUserDetail(@Path("login_username") loginUsername: String): UserDetailResponse
}