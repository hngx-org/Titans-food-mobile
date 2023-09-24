package com.example.titansfreelunch.data.model

import java.sql.Date

data class Lunch(
    val id: Int,
    val senderId: Int,
    val receiverId: Int,
    val quantity: Int,
    val redeemed: Boolean,
    val createdAt: Date,
    val note: String
)
