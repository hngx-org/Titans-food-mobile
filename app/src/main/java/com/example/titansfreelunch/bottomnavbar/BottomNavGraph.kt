package com.example.titansfreelunch.bottomnavbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.titansfreelunch.home_screen.Home

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            Home()
        }
        composable(route = BottomBarScreen.Home.route){
            Home()
        }
        composable(route = BottomBarScreen.People.route){
            Home()
        }
        composable(route = BottomBarScreen.Ranking.route){
            Home()
        }
        composable(route = BottomBarScreen.Settings.route){
            Home()
        }
    }
}