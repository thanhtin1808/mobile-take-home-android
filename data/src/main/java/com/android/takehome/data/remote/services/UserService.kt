package com.android.takehome.data.remote.services

import com.android.takehome.data.remote.models.responses.users.UserResponse
import retrofit2.http.GET

internal interface UserService {
    @GET("/users?per_page=20&since=1")
    suspend fun getUserList(): List<UserResponse>
}