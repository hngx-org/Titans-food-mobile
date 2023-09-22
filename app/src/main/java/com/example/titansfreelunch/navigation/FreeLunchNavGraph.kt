package com.example.titansfreelunch.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.titansfreelunch.ui.screen.authentication.SignupScreen
import com.example.titansfreelunch.ui.screen.authentication.organization.SelectedOrganizationSignup
import com.example.titansfreelunch.ui.screen.authentication.organization.SetupOrganizationScreen
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationDetailsScreen
import com.example.titansfreelunch.ui.screen.authentication.staff.AddBankDetailsScreen
import com.example.titansfreelunch.ui.screen.authentication.staff.SelectedStaffSignup
import com.example.titansfreelunch.ui.screen.authentication.staff.SignupStaffDetailsScreen
import com.example.titansfreelunch.ui.screen.random.AddPeople



//host the free lunch navigation graph
@Composable
fun FreeLunchNavHost(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Start",
        modifier = modifier
    ) {
        composable(route = "Start"){
            SignupScreen(
                onSignupAsOrganizationClicked = { navController.navigate("Organization") },
                onSignupAsStaffClicked = { navController.navigate("Staff") }
            )
        }
        composable(route = "Staff") {
            SelectedStaffSignup(
                onNextStaffButtonClicked = { navController.navigate("StaffSignup") }
            )
        }
        composable(route = "Organization") {
            SelectedOrganizationSignup(
                onNextOrganizationButtonClicked = {  navController.navigate("OrganizationSignup") }
            )
        }
        composable(route = "StaffSignup") {
            SignupStaffDetailsScreen(
                onStaffDetailsSubmit = {},
                submitStaffSignupDetails = { navController.navigate("AddStaffBankDetails") }
            )
        }
        composable(route = "OrganizationSignup") {
            SignupOrganizationDetailsScreen(
                onOrganizationDetailsSubmit = {},
                onOrganizationSignupButtonClicked = { navController.navigate("OrganizationDetailsScreen") }
            )
        }
        composable(route = "OrganizationDetailsScreen") {
            SetupOrganizationScreen(
                onOrganizationSetupDetailsSubmit = {},
                onOrganizationSetupDone = { navController.navigate("OrganizationAddPeople") }
            )
        }
        composable(route = "AddStaffBankDetails") {
            AddBankDetailsScreen(
                onAddStaffBankDetailsDone = {},
                goToHomeButtonClicked = { navController.navigate("Homepage") }
            )
        }
        composable(route = "OrganizationAddPeople") {
            AddPeople()
        }
        composable(route = "Homepage") {

        }
    }

}