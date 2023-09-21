package com.example.titansfreelunch.ui.screen.login


import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerifyEmail(
    modifier: Modifier = Modifier,
    onVerifyEmailSubmit: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column{
            Text(
                text = "Verify Email",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 6.dp ,bottom = 20.dp)
            )

            Text(
                text = buildAnnotatedString{
                    append("To verify your email, we sent a code to\n philipbassey123@gmail.com.")
                    withStyle(
                        style = SpanStyle(color = Color(6, 59, 39))
                    ) {
                        append(" (Change)")
                    }
                },
                fontSize = 18.sp,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            Text(
                text = "Email Code",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 16.sp
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onVerifyEmailSubmit },
                placeholder = {
                    Text(text = "Enter code")
                },
                modifier = Modifier.fillMaxWidth(0.9f)
            )
        }
        Button(
            colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(bottom = 20.dp)
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
fun VerifyEmailPreview() {
    VerifyEmail(onVerifyEmailSubmit = {})
}