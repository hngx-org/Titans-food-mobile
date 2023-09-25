package com.example.titansfreelunch.ui.screen.authentication.organization


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.titansfreelunch.viewModel.signup.OrganizationSignUpViewModel


@Composable
fun SignupOrganizationDetailsScreen(
    modifier: Modifier = Modifier,
    navController : NavHostController
) {
    var uiState by remember { mutableStateOf(SignupOrganizationUiState()) }
    val viewModel : OrganizationSignUpViewModel = hiltViewModel()

    val navigateNextToScreen by viewModel.navigateToNextScreen.collectAsState()
    if (navigateNextToScreen) {
        navController.navigate("OrganizationDetailsScreen")
        // Reset the trigger to prevent repeated navigation
        viewModel.resetNavigation()
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign Up",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(214, 218, 225))
        ) {
            Text(
                text = "To create an organization, we first have to\n sign you up.",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .padding(top = 20.dp)
                    .padding(5.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "First Name",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = uiState.firstName,
                onValueChange = { newValue ->
                    uiState = uiState.copy(firstName = newValue)
                },
                placeholder = {
                    Text(text = "Enter first name")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Last Name",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = uiState.lastName,
                onValueChange = { newValue ->
                    uiState = uiState.copy(lastName = newValue)
                },
                placeholder = {
                    Text(text = "Enter last name")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Email Address",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = uiState.emailAddress,
                onValueChange = { newValue ->
                    uiState = uiState.copy(emailAddress = newValue)
                },
                placeholder = {
                    Text(text = "Enter email address")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Phone Number",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = uiState.phoneNumber,
                onValueChange = { newValue ->
                    uiState = uiState.copy(phoneNumber = newValue)
                },
                placeholder = {
                    Text(text = "Enter phone number")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Set Password",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = uiState.password,
                onValueChange = { newValue ->
                    uiState = uiState.copy(password = newValue)
                },
                placeholder = {
                    Text(text = "Enter password")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Button(
                colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
                onClick = {
                    viewModel.saveOrganizationDetails(uiState = uiState)
                },
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth(0.9f),
            ) {
                Text(
                    text = "Sign Up",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }

    }
}



//@Composable
//fun SignUpOrgDetailScreen(navController: NavHostController) {
//    val viewModel : OrganizationSignUpViewModel = hiltViewModel()
//
//    viewModel.uiState.collectAsState().value.let { state ->
//        when(state) {
//            is UiState.Idle -> {
//                SignupOrganizationDetailsScreen(
//                    viewModel = viewModel
//                )
//            }
//            is UiState.Success -> {
//                if (UiState.Success == true)
//                navController.navigate("Staff")
//            }
//            is UiState.Error -> {
////                ErrorSnackBar(
////                    snackbarHostState = snackbarHostState,
////                    message = state.errorMessage
////                )
//            }
//        }
//    }
//
//
//}
