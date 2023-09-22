package com.example.titansfreelunch.ui.screen.login


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.titansfreelunch.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateProfile(
    modifier: Modifier = Modifier,
    onDetailsSubmit: () -> Unit
) {
    val padlockIcon = Icons.Default.Lock
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column{
            Text(
                text = "Create Profile",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, bottom = 20.dp),
                textAlign = TextAlign.Center,
            )
            Column(
                modifier = Modifier.fillMaxWidth() ,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Card(
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                        .size(110.dp),
                    shape = RoundedCornerShape(50),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(208, 213, 221)
                    ),

                    ){
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Icon(
                            painter = painterResource(
                                id = R.drawable.camera_icon
                            ),
                            contentDescription = "",
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }
                Text(
                    text = "Full Name",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(bottom = 5.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { onDetailsSubmit },
                    placeholder = {
                        Text(text = "Enter your full name")
                    },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
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
                    onValueChange = { onDetailsSubmit },
                    placeholder = {
                        Text(text = "Enter password")
                    },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth(0.9f)
                )
                Text(
                    text = "Confirm Password",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(bottom = 5.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { onDetailsSubmit },
                    placeholder = {
                        Text(text = "Re-enter password")
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                )
            }
        }
        Button(
            colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth(0.9f),
        ) {
            Text(
                text = "Finish",
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CreateProfilePreview() {
    CreateProfile(onDetailsSubmit = {})
}