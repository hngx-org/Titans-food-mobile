package com.example.titansfreelunch.data.models

import com.squareup.moshi.Json

data class ResponseClass (
    val status_code: Int,
    val status: String,
    val message: String,
    val data: SignUpModel,
)
data class SignUpModel (
    @Json(name = "fist_name") val first_name: String,
    @Json(name = "last_name") val last_name: String,
    @Json(name = "email") val email: String,
    @Json(name = "password_hash") val password_hash: String,
    @Json(name = "phone_number") val phone_number : String
)
