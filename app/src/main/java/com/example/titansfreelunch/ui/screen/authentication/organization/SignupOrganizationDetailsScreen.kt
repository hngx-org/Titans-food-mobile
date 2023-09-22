package com.example.titansfreelunch.ui.screen.authentication.organization


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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.titansfreelunch.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupOrganizationDetailsScreen(
    modifier: Modifier = Modifier,
    onOrganizationDetailsSubmit: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign Up",
            text = stringResource(R.string.sign_up),
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
                value = "",
                onValueChange = { onOrganizationDetailsSubmit },
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
                value = "",
                onValueChange = { onOrganizationDetailsSubmit },
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
                value = "",
                onValueChange = { onOrganizationDetailsSubmit },
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
                value = "",
                onValueChange = { onOrganizationDetailsSubmit },
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
                value = "",
                onValueChange = { onOrganizationDetailsSubmit },
                placeholder = {
                    Text(text = "Enter password")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Button(
                colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
                onClick = { /*TODO*/ },
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

@Preview(showBackground = true)
@Composable
fun SignupOrganizationDetailsScreenPreview() {
    SignupOrganizationDetailsScreen(onOrganizationDetailsSubmit = {})
}