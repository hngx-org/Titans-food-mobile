package com.example.titansfreelunch.data.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object ApiClient {
    private const val BASE_URL = "https://titans-food-backend.onrender.com"


    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()


    //shows in the log, to know the response
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(MyInterceptor())
        .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(okHttpClient)
        .build()

    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}