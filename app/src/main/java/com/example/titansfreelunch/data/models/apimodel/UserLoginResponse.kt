package com.example.titansfreelunch.data.models.apimodel

import com.squareup.moshi.Json

data class UserLoginResponse(
    @Json(name="message") val message: String,
    @Json(name="statusCode") val statusCode: Int,
    @Json(name="data") val data: UserLoginData,
)

data class UserLoginData(
    @Json(name="access_token") val accessToken: String,
    @Json(name="email") val email: String,
    @Json(name="id") val id: Int,
    @Json(name="isAdmin") val isAdmin: Int,
    @Json(name="org_id") val orgId: Int?,
)
