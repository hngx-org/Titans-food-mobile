package com.example.titansfreelunch.ui.screen.authentication.staff

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.window.Popup
import com.example.titansfreelunch.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddBankDetailsScreen(
    modifier: Modifier = Modifier,
    onAddStaffBankDetailsDone: () -> Unit
) {
    var staffSetupIsSuccessful by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.add_bank_details),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(15.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(214, 218, 225))
        ) {
            Text(
                text = "Bank Name",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 20.dp)
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onAddStaffBankDetailsDone },
                placeholder = {
                    Text(text = "Select Bank")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Bank Number",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onAddStaffBankDetailsDone },
                placeholder = {
                    Text(text = "Enter bank number")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Bank Code",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onAddStaffBankDetailsDone },
                placeholder = {
                    Text(text = "Enter bank code")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Currency",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onAddStaffBankDetailsDone },
                placeholder = {
                    Text(text = "Select currency")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Currency Code",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onAddStaffBankDetailsDone },
                placeholder = {
                    Text(text = "Select currency code")
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .fillMaxWidth(0.9f)
            )
            Text(
                text = "Bank Region",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(bottom = 5.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            OutlinedTextField(
                value = "",
                onValueChange = { onAddStaffBankDetailsDone },
                placeholder = {
                    Text(text = "Enter bank region")
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
                    text = stringResource(id = R.string.sign_up),
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
    if (staffSetupIsSuccessful){
        StaffSetupSuccessfulPopup()
    }
}




@Composable
fun StaffSetupSuccessfulPopup(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Popup(
            alignment = Alignment.Center
        ){
            Column(

                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .width(350.dp)
                    .height(300.dp)
                    .background(Color(255, 255, 255))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.success),
                    contentDescription = stringResource(R.string.success),
                    modifier = Modifier
                        .padding(25.dp)
                        .size(70.dp)
                )
                Text(
                    text = stringResource(R.string.account_created),
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = stringResource(R.string.staff_popup_text),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    border = BorderStroke(1.dp, Color(146, 169, 160)),
                    modifier = Modifier.fillMaxWidth(0.9f)
                ) {
                    Text(
                        text = stringResource(R.string.go_to_home),
                        color = Color.Black
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AddBankDetailsScreenPreview() {
    AddBankDetailsScreen(
        onAddStaffBankDetailsDone = {}
    )
}