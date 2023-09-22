package com.example.titansfreelunch.ui.screen.sendlunch

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.titansfreelunch.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectMemberScreen(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = {
                Text(
                    text = "Send Lunch",
                    maxLines = 1
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.background,
            ),
            actions = {
                FilledIconButton(
                    onClick = { /*TODO*/ },
                    colors = IconButtonDefaults.filledIconButtonColors(
                        containerColor = Color.LightGray
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        modifier = Modifier
                            .size(30.dp)
                            .padding(5.dp),
                        tint = Color.Black
                    )
                }
            }
        )
        Divider(
            color = Color(230, 235, 233),
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .width(70.dp)
                        .height(70.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(6, 59, 39)
                    )
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.tick_circle),
                            contentDescription = "",
                            modifier = Modifier.size(40.dp)
                        )
                    }

                }
                Text(
                    text = "Select a Member",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Divider(
                color = Color(207, 255, 146),
                modifier = Modifier
                    .height(5.dp)
                    .width(80.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .width(70.dp)
                        .height(70.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(207, 255, 146)
                    )
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text(
                            text ="2",
                            fontWeight = FontWeight.Bold,
                            fontSize = 26.sp
                        )
                    }

                }
                Text(
                    text = "Send Lunch",
                    fontSize = 20.sp
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Personal message (Only Gege will see this)",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            OutlinedTextField(
                value = text,
                onValueChange = {},
                singleLine = false,
                placeholder = {
                    Text("Add a personal message...")
                },
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .height(120.dp)
                    .fillMaxWidth(0.9f)
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "Send lunch",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 15.dp)
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Card(
                    modifier = Modifier
                        .width(175.dp)
                        .height(120.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(234, 236, 240)
                    )
                ) {
                    Text(text = "Single")
                    Image(
                        painter = painterResource(id = R.drawable.bread),
                        contentDescription = "bread",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier
                        .width(175.dp)
                        .height(120.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(234, 236, 240)
                    )
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                    Text(text = "Double")
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ){

                            Image(
                                painter = painterResource(id = R.drawable.bread),
                                contentDescription = "bread",
                                modifier = Modifier.size(50.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.bread),
                                contentDescription = "bread",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SelectMemberScreenPreview() {
    SelectMemberScreen()
}