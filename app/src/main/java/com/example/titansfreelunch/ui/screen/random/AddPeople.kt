package com.example.titansfreelunch.ui.screen.random


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddPeople(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(214, 218, 225))
            .fillMaxSize(),

        ) {
        Column {
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Add people/groups",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 16.sp
            )
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(1.dp, Color(214, 218, 225))
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(214, 218, 225)),
                    modifier = Modifier.padding(5.dp)
                ) {
                    Row {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color(18, 183, 106)
                            ),
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "p",
                                    color = Color.White,
                                    modifier = Modifier.padding(bottom = 3.dp),
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "phillipbassey123@gmail.com",
                            modifier = Modifier.padding(end = 6.dp)
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(214, 218, 225)),
                    modifier = Modifier.padding(5.dp)
                ) {
                    Row {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color(18, 183, 106)
                            ),
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "p",
                                    color = Color.White,
                                    modifier = Modifier.padding(bottom = 3.dp),
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "phillipbassey123@gmail.com",
                            modifier = Modifier.padding(end = 6.dp)
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(214, 218, 225)),
                    modifier = Modifier.padding(5.dp)
                ) {
                    Row {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color(18, 183, 106)
                            ),
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "p",
                                    color = Color.White,
                                    modifier = Modifier.padding(bottom = 3.dp),
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "phillipbassey123@gmail.com",
                            modifier = Modifier.padding(end = 6.dp)
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(214, 218, 225)),
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .padding(5.dp)
                ) {
                    Row {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color(18, 183, 106)
                            ),
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "p",
                                    color = Color.White,
                                    modifier = Modifier.padding(bottom = 3.dp),
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "phillipbassey123@gmail.com",
                            modifier = Modifier.padding(end = 6.dp)
                        )
                    }
                }
            }
        }
        Button(
            colors = ButtonDefaults.outlinedButtonColors(Color(6, 59, 39)),
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth(0.9f),
        ) {
            Text(
                text = "Add People",
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddPeoplePreview() {
    AddPeople()
}

