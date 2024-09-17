package com.android.takehome.domain.repositories.users

import com.android.takehome.domain.models.tasks.UserModel

interface UserRepository {

    suspend fun getUserList(): List<UserModel>

    suspend fun getUserDetail(userName: String): UserModel
}