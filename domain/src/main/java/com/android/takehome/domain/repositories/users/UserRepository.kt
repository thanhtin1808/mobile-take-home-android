package com.android.takehome.domain.repositories.users

import com.android.takehome.domain.models.users.UserDetailModel
import com.android.takehome.domain.models.users.UserModel

interface UserRepository {

    suspend fun getUserList(page: Int, pageSize: Int): List<UserModel>

    suspend fun getUserDetail(userName: String): UserDetailModel
}