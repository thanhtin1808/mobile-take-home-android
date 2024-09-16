package com.android.template.data.repositories.di

import com.android.template.data.repositories.preferences.PreferencesRepositoryImpl
import com.android.template.data.repositories.tasks.UserRepositoryImpl
import com.android.template.domain.repositories.preferences.PreferencesRepository
import com.android.template.domain.repositories.users.UserRepository
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