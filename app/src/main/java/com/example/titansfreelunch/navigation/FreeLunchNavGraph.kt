package com.example.titansfreelunch.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
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
import com.example.titansfreelunch.viewModel.signup.OrganizationSignUpViewModel
import com.example.titansfreelunch.viewModel.signup.SetupOrganizationViewModel
import com.example.titansfreelunch.viewModel.signup.StaffSignUpViewModel


enum class SignupScreens() {
    Start,
    SignupAsStaff,
    SignupAsOrganization
}

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
        composable(route = "Start") {
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
                onNextOrganizationButtonClicked = { navController.navigate("OrganizationSignup") }
            )
        }
        composable(route = "StaffSignup") {
            val viewModel: StaffSignUpViewModel = hiltViewModel()

            SignupStaffDetailsScreen(
                uiState = viewModel.uiState.value,
                onFirstNameChange = viewModel::updateFirstName,
                onLastNameChange = viewModel::updateLastName,
                onEmailAddressChange = viewModel::updateEmailAddress,
                onPhoneNumberChange = viewModel::updatePhoneNumber,
                onInviteCodeChange = viewModel::updateInviteCode,
                onPasswordChange = viewModel::updatePassword,
                onSignupClick = {
                    viewModel.signup()
                    navController.navigate("AddStaffBankDetails")
                }
            )
        }
        composable(route = "OrganizationSignup") {
            val viewModel: OrganizationSignUpViewModel = hiltViewModel()

            SignupOrganizationDetailsScreen(
                uiState = viewModel.uiState.value,
                onFirstNameChange = viewModel::updateFirstName,
                onLastNameChange = viewModel::updateLastName,
                onEmailAddressChange = viewModel::updateEmailAddress,
                onPhoneNumberChange = viewModel::updatePhoneNumber,
                onPasswordChange = viewModel::updatePassword,
                onSignupClick = {
                    viewModel.signUp()
                    navController.navigate("OrganizationDetailsScreen")
                }
            )
        }
        composable(route = "OrganizationDetailsScreen") {
            val viewModel: SetupOrganizationViewModel = hiltViewModel()

            SetupOrganizationScreen(
                uiState = viewModel.uiState.value,
                onOrganizationNameChange = viewModel::updateOrganizationName,
                onLunchPriceChange = viewModel::updateLunchPrice,
                onCreateOrganizationClick = { }
            )
        }
        composable(route = "AddStaffBankDetails") {
            AddBankDetailsScreen(
                onAddStaffBankDetailsDone = {}
            )
        }
    }

}