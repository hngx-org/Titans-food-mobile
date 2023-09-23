package com.example.titansfreelunch.bottomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route:String,
    val title:String,
    val Icon: ImageVector,
    val unSelectedIcon:ImageVector
){
    object Home:BottomBarScreen(
        route = "timeline",
        title = "Timeline",
        Icon = Icons.Filled.Home,
        unSelectedIcon = Icons.Default.Home,
    )
    object People:BottomBarScreen(
        route = "people",
        title = "People",
        Icon = Icons.Filled.Group,
        unSelectedIcon = Icons.Default.Group
    )

    object Ranking:BottomBarScreen(
        route = "ranking",
        title = "Ranking",
        Icon = Icons.Filled.BarChart,
        unSelectedIcon = Icons.Default.BarChart

    )
    object Settings:BottomBarScreen(
        route = "settings",
        title = "Settings",
        Icon = Icons.Default.Settings,
        unSelectedIcon = Icons.Default.Settings
    )
}
