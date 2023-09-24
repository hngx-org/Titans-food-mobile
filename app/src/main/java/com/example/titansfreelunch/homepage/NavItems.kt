package com.example.titansfreelunch.homepage

import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val route: String
)
