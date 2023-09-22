package com.example.titansfreelunch.ui.screen.authentication.organization

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
fun SetupOrganizationScreen(
    modifier: Modifier = Modifier,
    onOrganizationSetupDetailsSubmit: () -> Unit
) {
    var popupControl by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.setup_organization),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(15.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(214, 218, 225)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column {
                Text(
                    text = stringResource(R.string.organization_name),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(0.9f)
                        .padding(bottom = 5.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { onOrganizationSetupDetailsSubmit },
                    placeholder = {
                        Text(text = stringResource(R.string.enter_organization_name))
                    },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth(0.9f)
                )
                Text(
                    text = stringResource(R.string.lunch_prize),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(bottom = 5.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = { onOrganizationSetupDetailsSubmit },
                    placeholder = {
                        Text(text = stringResource(R.string.set_lunch_price))
                    },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .fillMaxWidth(0.9f)
                )
            }
            Button(
                colors = ButtonDefaults.outlinedButtonColors( Color(6, 59, 39)),
                onClick = { popupControl = true },
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .fillMaxWidth(0.9f),
            ) {
                Text(
                    text = stringResource(R.string.create_organization),
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
    if (popupControl) {
        OrganizationSetupSuccessfulPopup()
    }
}

@Composable
fun OrganizationSetupSuccessfulPopup(modifier: Modifier = Modifier) {
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
                    text = stringResource(R.string.organization_created),
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = stringResource(R.string.popup_text),
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
                        text = stringResource(R.string.proceed),
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SetupOrganizationScreenPreview() {
    SetupOrganizationScreen(
        onOrganizationSetupDetailsSubmit = {}
    )
}