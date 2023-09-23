package com.example.titansfreelunch.data.models.apimodel

data class SignupModel(
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String
)

data class ResponseClass(val message : String, val statusCode : Int)
