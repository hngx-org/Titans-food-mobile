package com.example.titansfreelunch.data.model

data class User(
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val profilePicture: Int,
    val email: String,
    val phoneNumber: Int,
    val passwordHashcode: Int,
    val isAdmin: Boolean,
    val lunchCreditBalance: Int,
    val refreshToken: Int,
    val bankNumber: Int,
    val bankCode: Int,
    val bankName: String,
    val bankRegion: String,
    val currency: Int,
    val currencyCode: Int,
    val updatedAt: Int,
    val createdAt: Int
)
