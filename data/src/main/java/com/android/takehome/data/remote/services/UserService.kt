package com.android.takehome.data.remote.services

import com.android.takehome.data.remote.models.responses.users.UserDetailResponse
import com.android.takehome.data.remote.models.responses.users.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface UserService {
    @GET("/users")
    suspend fun getUserList(@Query("per_page") perPage: Int = 20, @Query("since") page: Int = 1): List<UserResponse>
    @GET("/users/{login_username}")
    suspend fun getUserDetail(@Path("login_username") loginUsername: String): UserDetailResponse
}