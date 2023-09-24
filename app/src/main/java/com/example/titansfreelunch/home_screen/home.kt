package com.example.titansfreelunch.home_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.titansfreelunch.R
import com.example.titansfreelunch.bottomnavbar.BottomNavigation
import com.example.titansfreelunch.ui.theme.cardColor
import com.example.titansfreelunch.ui.theme.homeColor
import com.example.titansfreelunch.ui.theme.timeCard

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    Column(modifier = Modifier.background(Color.LightGray)) {
        TopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.home),
                    maxLines = 1
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = homeColor,
            ),
            actions = {
                Icon(
                    painter = painterResource(id = R.drawable.profile_picture),
                    contentDescription = "Close",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(5.dp),
                )
            }
        )
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.LightGray)
            .fillMaxWidth()
            .fillMaxHeight()) {
            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(1.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(left = 16.dp, right = 16.dp, bottom = 2.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Text(text = stringResource(id = R.string.you_got))

                        Text(text = stringResource(id = R.string.time))
                    }

                    Card(
                        modifier = Modifier
                            .absolutePadding(left = 20.dp, right = 20.dp)
                            .wrapContentWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = cardColor
                        )
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 8.dp)

                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.profile_picture2),
                                contentDescription = "",
                                modifier = Modifier.size(40.dp)
                            )
                            Text(
                                text = "Henry Min Jao"
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(10.dp)
                        ) {
                            Text(
                                text = stringResource(id = R.string.full_text),
                                maxLines = 3,
                                textAlign = TextAlign.Justify
                            )
                        }

                    }
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Column {
                            Text(text = stringResource(id = R.string.you))
                            Text(
                                text = stringResource(id = R.string.bread)
                            )
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .align(Alignment.CenterVertically),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = timeCard
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.redeem),
                                color = homeColor
                            )

                        }
                    }
                }

                Card(
                    modifier = Modifier.absolutePadding(
                        left = 16.dp,
                        right = 16.dp,
                        bottom = 5.dp
                    )
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Column {
                            Text(text = stringResource(id = R.string.sent))
                            Text(text = stringResource(id = R.string.henny))
                        }

                        Column {
                            Text(text = stringResource(id = R.string.time))
                            Text(text = stringResource(id = R.string.bread))

                        }
                    }
                }

                Card(
                    modifier = Modifier.absolutePadding(
                        left = 16.dp,
                        right = 16.dp,
                        bottom = 5.dp
                    )
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Column {
                            Text(text = stringResource(id = R.string.sent))
                            Text(text = stringResource(id = R.string.henny))
                        }

                        Column {
                            Text(text = stringResource(id = R.string.time))
                            Text(text = stringResource(id = R.string.bread))

                        }
                    }
                }

                Card(
                    modifier = Modifier.absolutePadding(left = 16.dp, right = 16.dp, bottom = 5.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Column {
                            Text(text = stringResource(id = R.string.sent))
                            Text(text = stringResource(id = R.string.henny))
                        }

                        Column {
                            Text(text = stringResource(id = R.string.time))
                            Text(text = stringResource(id = R.string.bread))
                        }
                    }
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .absolutePadding(left = 16.dp, right = 16.dp, bottom = 2.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.you_got),
                    modifier = Modifier.absolutePadding(top = 5.dp))

                Text(text = stringResource(id = R.string.time),
                    modifier = Modifier.absolutePadding(top = 5.dp)
                    )
            }

            Card(
                modifier = Modifier
                    .absolutePadding(left = 20.dp, right = 20.dp)
                    .wrapContentWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = cardColor
                )
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp)

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.profile_picture2),
                        contentDescription = "",
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        text = "Henry Min Jao"
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.full_text),
                        maxLines = 3,
                        textAlign = TextAlign.Justify
                    )
                }

            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Column {
                    Text(text = stringResource(id = R.string.you))
                    Text(
                        text = stringResource(id = R.string.bread)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .align(Alignment.CenterVertically),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = timeCard
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.redeem),
                        color = homeColor
                    )

                }
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(220.dp),
            contentAlignment = Alignment.Center
        ) {

            BottomNavigation()
        }

    }
    FloatingActionButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .clip(CircleShape)
            .size(55.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.send) ,
            contentDescription = "FAB")

    }



}


@Preview
@Composable
fun PreviewHomeScreen(){
      Home()
}

