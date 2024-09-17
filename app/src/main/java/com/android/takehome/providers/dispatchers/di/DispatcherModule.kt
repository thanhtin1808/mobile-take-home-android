package com.android.takehome.providers.dispatchers.di

import com.android.takehome.providers.dispatchers.DispatcherProvider
import com.android.takehome.providers.dispatchers.DispatcherProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface DispatcherModule {

    @Binds
    @Singleton
    fun bindDispatcherProvider(impl: DispatcherProviderImpl): DispatcherProvider
}