package com.example.titansfreelunch.data.models

import com.example.titansfreelunch.data.model.User

data class FreeLunchResponse(
    val message: String,
    val statusCode: Int,
    val data: User
)
