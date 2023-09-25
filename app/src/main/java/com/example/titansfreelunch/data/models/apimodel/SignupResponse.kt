package com.example.titansfreelunch.data.models.apimodel

import com.squareup.moshi.Json

data class SignupResponse(
    @Json(name="status_code") val statusCode: Int,
    @Json(name="status") val status: String,
    @Json(name="message") val message: String,
    @Json(name="data") val data: SignupData,
)

data class SignupData(
    @Json(name="id") val id: Int,
    @Json(name="first_name") val firstName: String,
    @Json(name="last_name") val lastName: String,
    @Json(name="email") val email: String,
    @Json(name="is_admin") val isAdmin: Int,
    @Json(name="updated_at") val updateAt: String,
    @Json(name = "created_at") val createdAt: String
)
