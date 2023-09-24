package com.example.titansfreelunch.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.titansfreelunch.ui.screen.authentication.SignupScreen
import com.example.titansfreelunch.ui.screen.authentication.organization.SelectedOrganizationSignup
import com.example.titansfreelunch.ui.screen.authentication.organization.SetupOrganizationScreen
import com.example.titansfreelunch.ui.screen.authentication.organization.SetupOrganizationUiState
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationDetailsScreen
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationUiState
import com.example.titansfreelunch.ui.screen.authentication.staff.AddBankDetailsScreen
import com.example.titansfreelunch.ui.screen.authentication.staff.SelectedStaffSignup
import com.example.titansfreelunch.ui.screen.authentication.staff.SignupStaffDetailsScreen
import com.example.titansfreelunch.ui.screen.authentication.staff.SignupStaffUiState
import com.example.titansfreelunch.ui.screen.random.AddPeople
import com.example.titansfreelunch.viewModel.signup.OrganizationSignUpViewModel


//host the free lunch navigation graph
@Composable
fun FreeLunchNavHost(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
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
                submitStaffSignupDetails = {
                    navController.navigate("AddStaffBankDetails")
                },
                onPhoneNumberChange = {},
                onPasswordChange = {},
                onLastNameChange = {},
                onFirstNameChange = {},
                onEmailAddressChange = {},
                onInviteCodeChange = {},
                onSignupClick = {},
                uiState = SignupStaffUiState(
                    firstName = "",
                    lastName = "",
                    emailAddress = "",
                    password = "",
                    phoneNumber = "",
                    inviteCode = ""
                )
            )
        }

        composable(route = "OrganizationSignup") {
            SignupOrganizationDetailsScreen(
                navController = navController
            )
        }
        composable(route = "OrganizationDetailsScreen") {
            SetupOrganizationScreen(
                onOrganizationSetupDetailsSubmit = {},
                onOrganizationSetupDone = {
                    navController.navigate("OrganizationAddPeople")
                },
                onOrganizationNameChange = {},
                onLunchPriceChange = {},
                onCreateOrganizationClick = {},
                uiState = SetupOrganizationUiState()
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

//SignupOrganizationDetailsScreen(
//onOrganizationDetailsSubmit = {},
//onOrganizationSignupButtonClicked = {
//    navController.navigate("OrganizationDetailsScreen")
//},
//onEmailAddressChange = {},
//onFirstNameChange = {},
//onLastNameChange = {},
//onPasswordChange = {},
//onPhoneNumberChange = {},
//uiState = SignupOrganizationUiState(),
//viewModel = hiltViewModel()
//)