package com.example.titansfreelunch.data.models.apimodel

import com.squareup.moshi.Json

data class SignupModel(
    @Json(name = "email") val email: String,
    @Json(name = "password") val password: String,
    @Json(name = "first_name") val firstName: String,
    @Json(name = "last_name")val lastName: String,
)

data class ResponseClass(val message : String, val statusCode : Int)
