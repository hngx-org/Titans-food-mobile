package com.example.titansfreelunch.ui.screen.homepage

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.titansfreelunch.ui.screen.settings.SettingsScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = BottomBarScreen.Timeline.route) {
        composable(route = BottomBarScreen.Timeline.route) {
            TimelineScreen()
        }
        composable(route = BottomBarScreen.People.route) {
            PeopleScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen(
                onEditClick = {  },
                onLogoutClick = {  },
                onRedeemClick = {  }
            )
        }
    }
}