package com.android.takehome.data.repositories.di

import com.android.takehome.data.repositories.preferences.PreferencesRepositoryImpl
import com.android.takehome.data.repositories.users.UserRepositoryImpl
import com.android.takehome.domain.repositories.preferences.PreferencesRepository
import com.android.takehome.domain.repositories.users.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface RepositoriesModule {

    @Binds
    fun bindUserRepository(impl: UserRepositoryImpl): UserRepository

    @Binds
    fun providePreferencesRepository(impl: PreferencesRepositoryImpl): PreferencesRepository
}