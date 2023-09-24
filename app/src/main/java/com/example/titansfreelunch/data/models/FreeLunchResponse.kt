package com.example.titansfreelunch.data.models

import com.example.titansfreelunch.data.model.User
import com.example.titansfreelunch.data.models.apimodel.SignupData
import com.squareup.moshi.Json

data class FreeLunchResponse(
    val message: String,
    val statusCode: Int,
    val data: User
)


