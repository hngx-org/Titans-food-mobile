package com.example.titansfreelunch.bottomnavbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.titansfreelunch.home_screen.Home

@Composable
fun BottomNavigation() {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Settings,
        BottomBarScreen.Ranking,
        BottomBarScreen.People
    )
    NavigationBar {
        screens.forEach{screen ->
            AddItem(screen = screen)
        }
    }
}
@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen
){
    NavigationBarItem(
        selected = true, 
        onClick = {  },
        icon = { 
            Image(
                imageVector = screen.Icon, 
                contentDescription = screen.title )
        },
        alwaysShowLabel = true
        )
}
 

@Preview
@Composable
fun PreviewBottomNavBar(){
    Home()
}