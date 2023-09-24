package com.example.titansfreelunch.data.retrofit

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class MyInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val response =  chain.request()
            .newBuilder()
            .addHeader("Content-Type", "application/json")
            .addHeader( "Accept", "application/json")
            .build()
        return chain.proceed(response)
    }
}