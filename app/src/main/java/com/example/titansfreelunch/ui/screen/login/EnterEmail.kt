package com.example.titansfreelunch.ui.screen.login


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EnterEmail(
    emailAddress: String,
    onEmailAddressChange: (String) -> Unit,
    onContinueClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Text(
                text = "Welcome",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 6.dp, bottom = 20.dp)
            )
            Text(
                text = "Enter email address to continue",
                fontSize = 18.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            Text(
                text = "Email Address",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 16.sp
            )
            OutlinedTextField(
                value = emailAddress,
                onValueChange = onEmailAddressChange,
                placeholder = {
                    Text(text = "Enter email address")
                },
                modifier = Modifier.fillMaxWidth(0.9f)
            )
        }
        Button(
            colors = ButtonDefaults.outlinedButtonColors(Color(6, 59, 39)),
            onClick = onContinueClick,
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth(0.9f),
        ) {
            Text(
                text = "Continue",
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EnterEmailPreview() {
    EnterEmail(
        emailAddress = "",
        onEmailAddressChange = {},
        onContinueClick = {}
    )
}