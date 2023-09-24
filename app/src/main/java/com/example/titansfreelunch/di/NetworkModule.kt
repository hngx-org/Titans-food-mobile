package com.example.titansfreelunch.di

import com.example.titansfreelunch.data.retrofit.ApiClient
import com.example.titansfreelunch.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return ApiClient.retrofitService
    }
}