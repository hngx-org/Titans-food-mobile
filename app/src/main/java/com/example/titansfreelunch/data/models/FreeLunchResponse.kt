package com.example.titansfreelunch.data.models.model

import com.example.titansfreelunch.data.models.User

data class FreeLunchResponse(
    val message: String,
    val statusCode: Int,
    val data: User
)
