package com.example.titansfreelunch.ui.screen.authentication.staff

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.titansfreelunch.R

@Composable
fun SignupStaffDetailsScreen(
    uiState: SignupStaffUiState,
    onFirstNameChange: (String) -> Unit,
    onLastNameChange: (String) -> Unit,
    onEmailAddressChange: (String) -> Unit,
    onPhoneNumberChange: (String) -> Unit,
    onInviteCodeChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onSignupClick: () -> Unit,
    modifier: Modifier = Modifier,
    onStaffDetailsSubmit: () -> Unit,
    submitStaffSignupDetails: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign Up.",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(5.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(214, 218, 225))
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(50))
                    .width(100.dp)
                    .height(100.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.camera_icon),
                        contentDescription = "Add Image",
                        modifier = Modifier
                            .size(70.dp)
                            .padding(bottom = 40.dp)
                    )
                    Text(
                        text = "Add Image",
                        modifier = Modifier.padding(top = 30.dp)
                    )
                }
            }
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
                onValueChange = onFirstNameChange,
                placeholder = {
                    Text(text = "Enter first name")
                },
                modifier = Modifier
                    .padding(bottom = 5.dp)
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
                onValueChange = onLastNameChange,
                placeholder = {
                    Text(text = "Enter last name")
                },
                modifier = Modifier
                    .padding(bottom = 5.dp)
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
                onValueChange = onEmailAddressChange,
                placeholder = {
                    Text(text = "Enter email address")
                },
                modifier = Modifier
                    .padding(bottom = 5.dp)
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
                onValueChange = onPhoneNumberChange,
                placeholder = {
                    Text(text = "Enter phone number")
                },
                modifier = Modifier
                    .padding(bottom = 5.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Enter invite code Number",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = uiState.inviteCode,
                onValueChange = onInviteCodeChange,
                placeholder = {
                    Text(text = "Enter invite code number")
                },
                modifier = Modifier
                    .padding(bottom = 5.dp)
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
                onValueChange = onPasswordChange,
                placeholder = {
                    Text(text = "Set password")
                },
                modifier = Modifier
                    .padding(bottom = 5.dp)
                    .fillMaxWidth(0.9f)
            )
            Button(
                colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
                onClick = { submitStaffSignupDetails() },
                modifier = Modifier.padding(top = 10.dp)
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

@Preview(showBackground = true)
@Composable
fun SignupStaffDetailsScreenPreview() {
    SignupStaffDetailsScreen(
        uiState= SignupStaffUiState(
            firstName = "",
            lastName = "",
            emailAddress = "",
            phoneNumber = "",
            password = "",
            inviteCode = ""
        ),
        onFirstNameChange = {},
    onLastNameChange = {},
    onEmailAddressChange ={},
    onPhoneNumberChange = {},
    onInviteCodeChange = {},
    onPasswordChange = {},
    onSignupClick = {},
    onStaffDetailsSubmit = {},
    submitStaffSignupDetails = {}
    )
}