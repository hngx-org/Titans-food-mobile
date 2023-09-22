package com.example.titansfreelunch.ui.screen.authentication.staff

data class SignupStaffUiState(
    val firstName: String,
    val lastName: String,
    val emailAddress: String,
    val phoneNumber: String,
    val inviteCode: String,
    val password: String
)
