package com.example.titansfreelunch.data.models

data class JsonToKotlinMain (
    val message: String,
    val statusCode: Short,
    val data: LoginModel,
)

data class LoginModel(
    val email: String,
    val password: String
)

