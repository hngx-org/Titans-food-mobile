package com.example.titansfreelunch.data.model

// Staff only
data class StaffSignup(
    val email: String,
    val password: String,
    val otpToken: String,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String
)
