package com.example.titansfreelunch.ui.screen.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.titansfreelunch.R
import com.example.titansfreelunch.ui.theme.TitansFreeLunchTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onEditClick: () -> Unit,
    onRedeemClick: () -> Unit,
    onLogoutClick: () -> Unit,
    modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Settings",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(0xFFCFFF92),
                    titleContentColor = Color(0xFF063B27)
                )
            )
        }
    ) { innerPadding ->
        Box(
            modifier = modifier
                .background(Color(0xFFF2F4F7))
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Box(
                modifier = modifier
                    .align(Alignment.TopCenter)
                    .background(Color(0xFFCFFF92))
                    .fillMaxWidth()
                    .height(150.dp)
            )

            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SettingsCard(
                    onEditClick = onEditClick,
                    onRedeemClick = onRedeemClick
                )

                Column(modifier = Modifier.clip(RoundedCornerShape(20))) {
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.brush),
                            contentDescription = "Appearance"
                        )
                        Text(
                            text = "Appearance",
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = null
                        )
                    }
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.global),
                            contentDescription = "Language and Region"
                        )
                        Text(
                            text = "Language & Region",
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = null
                        )
                    }
                }
                Column(modifier = Modifier.clip(RoundedCornerShape(20))) {
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.message_question),
                            contentDescription = "Help and support"
                        )
                        Text(
                            text = "Help & Support",
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = null
                        )
                    }
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.info_circle),
                            contentDescription = "About"
                        )
                        Text(
                            text = "About",
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_right),
                            contentDescription = null
                        )
                    }
                }
                Button(
                    onClick = onLogoutClick,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Red
                    )) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        Text(text = "Logout",
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.logout),
                            contentDescription = "Logout"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SettingsCard(
    onEditClick: () -> Unit,
    onRedeemClick: () -> Unit,
    modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        contentColor = Color.White,
        shape = RoundedCornerShape(8)
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .matchParentSize()
            )
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.default_user),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(width = 4.dp, color = Color.White, shape = CircleShape)
                    )
                    Text(
                        text = "Philip Bassey",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedButton(
                        onClick = onEditClick,
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                    ) {
                        Text(text = "Edit")
                    }
                }
                Divider(color = Color(0xFF1F4F3D))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .clip(RoundedCornerShape(20))
                        .background(Color(0x99386252))
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                            text = "Lunch Balance",
                            style = MaterialTheme.typography.labelLarge.copy(
                                color = Color(0xFF9BB1A9),
                                fontWeight = FontWeight.Light
                            )
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "\uD83E\uDD6A",
                                style = MaterialTheme.typography.titleMedium
                            )
                            Text(
                                text = "10",
                                style = MaterialTheme.typography.titleLarge.copy(
                                    color = Color(0xFFCFFF92)
                                )
                            )
                        }
                    }
                    Button(
                        onClick = onRedeemClick,
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF063B27),
                            containerColor = Color(0xFFCFFF92)
                        )
                    ) {
                        Text(text = "Redeem Lunch")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsCardPreview() {
    TitansFreeLunchTheme {
        SettingsCard(
            onEditClick = {},
            onRedeemClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    TitansFreeLunchTheme {
        SettingsScreen(
            onEditClick = {},
            onRedeemClick = {},
            onLogoutClick = {}
        )
    }
}