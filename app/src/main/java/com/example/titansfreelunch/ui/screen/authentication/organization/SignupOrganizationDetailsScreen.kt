package com.example.titansfreelunch.ui.screen.authentication.organization


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.titansfreelunch.viewModel.signup.OrganizationSignUpViewModel
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupOrganizationDetailsScreen(
    modifier: Modifier = Modifier,
    viewModel : OrganizationSignUpViewModel = hiltViewModel()
) {

    val _email by viewModel.email.collectAsState(
        initial = ""
    )

    val _password by viewModel.password.collectAsState(
        initial = ""
    )

    val _firstName by viewModel.firstName.collectAsState(
        initial = ""
    )

    val _lastName by viewModel.lastName.collectAsState(
        initial = ""
    )

    val _phoneNumber by viewModel.phoneNumber.collectAsState(
        initial = ""
    )


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

     OutlinedTextField(
            value = _firstName,
            onValueChange = { newValue ->
                viewModel.firstName.value = newValue
            },
            placeholder = {
                Text(text = "Enter first name")
            }
     )

    OutlinedTextField(
        value = _lastName,
        onValueChange = { newValue ->
            viewModel.lastName.value = newValue
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

            fontSize = 16.sp,
            textAlign = TextAlign.Start
        )

        OutlinedTextField(
            value = _email,
            onValueChange = { newValue ->
                viewModel.email.value = newValue
            },
            placeholder = {
                Text(text = "Enter email address")
            },
        )
    OutlinedTextField(
        value = _password,
        onValueChange = { newValue ->
            viewModel.email.value = newValue
        },
        placeholder = {
            Text(text = "Enter phone number")
        },
    )
    OutlinedTextField(
        value = _phoneNumber,
        onValueChange = { newValue ->
            viewModel.email.value = newValue
        },
        placeholder = {
            Text(text = "Enter password")
        },
        )

        Button(
            colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
            onClick = {
                viewModel.saveDetails()
            },
            modifier = Modifier
                .padding(top = 60.dp)
                .fillMaxWidth(0.9f)
        ){
            Text(text = "Sign Up")
        }

    }
}

@Preview(showBackground = true)

@Composable
fun SignupOrganizationDetailsScreenPreview() {
//    SignupOrganizationDetailsScreen(onOrganizationDetailsSubmit = {})
    SignupOrganizationDetailsScreen(
        viewModel = hiltViewModel()
    )
}












//
//@Composable
//fun SignupOrganizationDetailsScreen(
//    onFirstNameChange: () -> Unit,
//    onPasswordChange: () -> Unit,
//    onLastNameChange: () -> Unit,
//    onEmailAddressChange: () -> Unit,
//    onPhoneNumberChange: () -> Unit,
//    uiState: SignupOrganizationUiState,
//    modifier: Modifier = Modifier,
//    onOrganizationDetailsSubmit: () -> Unit,
//    onOrganizationSignupButtonClicked: () -> Unit
//) {
//    Column(
//        modifier = modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Sign Up",
//            fontSize = 30.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(20.dp)
//        )
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .fillMaxSize()
//                .background(color = Color(214, 218, 225))
//        ) {
//            Text(
//                text = "To create an organization, we first have to\n sign you up.",
//                fontSize = 20.sp,
//                modifier = Modifier
//                    .padding(bottom = 20.dp)
//                    .padding(top = 20.dp)
//                    .padding(5.dp)
//                    .fillMaxWidth(),
//                textAlign = TextAlign.Center
//            )
//            Text(
//                text = "First Name",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .fillMaxWidth(0.9f)
//                    .padding(bottom = 5.dp),
//                fontSize = 16.sp,
//                textAlign = TextAlign.Start
//            )
//            OutlinedTextField(
//                value = uiState.firstName,
//                onValueChange = { onFirstNameChange },
//                placeholder = {
//                    Text(text = "Enter first name")
//                },
//                modifier = Modifier
//                    .padding(bottom = 10.dp)
//                    .fillMaxWidth(0.9f)
//            )
//            Text(
//                text = "Last Name",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .fillMaxWidth(0.9f)
//                    .padding(bottom = 5.dp),
//                fontSize = 16.sp,
//                textAlign = TextAlign.Start
//            )
//            OutlinedTextField(
//                value = uiState.lastName,
//                onValueChange = { onLastNameChange },
//                placeholder = {
//                    Text(text = "Enter last name")
//                },
//                modifier = Modifier
//                    .padding(bottom = 10.dp)
//                    .fillMaxWidth(0.9f)
//            )
//            Text(
//                text = "Email Address",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .fillMaxWidth(0.9f)
//                    .padding(bottom = 5.dp),
//                fontSize = 16.sp,
//                textAlign = TextAlign.Start
//            )
//            OutlinedTextField(
//                value = uiState.emailAddress,
//                onValueChange = { onEmailAddressChange },
//                placeholder = {
//                    Text(text = "Enter email address")
//                },
//                modifier = Modifier
//                    .padding(bottom = 10.dp)
//                    .fillMaxWidth(0.9f)
//            )
//            Text(
//                text = "Phone Number",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .fillMaxWidth(0.9f)
//                    .padding(bottom = 5.dp),
//                fontSize = 16.sp,
//                textAlign = TextAlign.Start
//            )
//            OutlinedTextField(
//                value = uiState.phoneNumber,
//                onValueChange = { onPhoneNumberChange },
//                placeholder = {
//                    Text(text = "Enter phone number")
//                },
//                modifier = Modifier
//                    .padding(bottom = 10.dp)
//                    .fillMaxWidth(0.9f)
//            )
//            Text(
//                text = "Set Password",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier
//                    .fillMaxWidth(0.9f)
//                    .padding(bottom = 5.dp),
//                fontSize = 16.sp,
//                textAlign = TextAlign.Start
//            )
//            OutlinedTextField(
//                value = uiState.password,
//                onValueChange = { onPasswordChange },
//                placeholder = {
//                    Text(text = "Enter password")
//                },
//                modifier = Modifier
//                    .padding(bottom = 10.dp)
//                    .fillMaxWidth(0.9f)
//            )
//            Button(
//                colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
//                onClick = { onOrganizationSignupButtonClicked() },
//                modifier = Modifier
//                    .padding(top = 60.dp)
//                    .fillMaxWidth(0.9f),
//            ) {
//                Text(
//                    text = "Sign Up",
//                    color = Color.White,
//                    fontSize = 18.sp
//                )
//            }
//        }
//
//    }
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun SignupOrganizationDetailsScreenPreview() {
//    SignupOrganizationDetailsScreen(
//        onOrganizationDetailsSubmit = {},
//        onOrganizationSignupButtonClicked = {},
//        onFirstNameChange = {},
//        onPasswordChange = {},
//        onLastNameChange = {},
//        onEmailAddressChange = {},
//        onPhoneNumberChange = {},
//        uiState = SignupOrganizationUiState(
//            firstName = "",
//            lastName = "",
//            emailAddress = "",
//            phoneNumber = "",
//            password = "",
//        )
//    )
//}
//
