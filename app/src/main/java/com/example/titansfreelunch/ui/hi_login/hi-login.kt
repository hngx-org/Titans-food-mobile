package com.example.titansfreelunch.ui.hi_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.titansfreelunch.R
import com.example.titansfreelunch.ui.theme.buttonColor
import com.example.titansfreelunch.ui.theme.headerColor
import com.example.titansfreelunch.ui.theme.loginColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Hi_Login(){
    Card(colors = CardDefaults.cardColors(
        containerColor = Color.White),
        modifier = Modifier
            .padding(25.dp)

    ){
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(id = R.string.login_screen_name),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = headerColor,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .background(loginColor)
                .fillMaxSize()) {
                Text(
                    text = stringResource(id = R.string.box_name),
                    color = headerColor,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(10.dp),
                )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedTextField(
                    value = stringResource(id = R.string.hint_email),
                    onValueChange = {},
                    Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(id = R.string.password),
                color = headerColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp),
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedTextField(
                    value = stringResource(id = R.string.hint_email),
                    onValueChange = {},
                    Modifier
                        .padding(10.dp)
                        .fillMaxWidth())
            }
            Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonColor
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ){
                    Text(
                        text = stringResource(id = R.string.login),
                        fontWeight = FontWeight.Bold

                    )
                }
        }
    }

}

@Preview
@Composable
fun PreviewHiLogin(){
    Hi_Login()
}
