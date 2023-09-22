package com.example.titansfreelunch.data.model

data class OrganizationInvite(
    val id: Int,
    val email: String,
    val token: String,
    val ttl: Int
)