package com.example.titansfreelunch.ui.hi_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.titansfreelunch.R
import com.example.titansfreelunch.ui.theme.TitansFreeLunchTheme
import com.example.titansfreelunch.viewModel.login.LoginViewModel

@Composable
fun Hi_Login(
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel()
) {
   val loginUiState by viewModel.loginUiState.collectAsState()
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.login_screen_name),
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(16.dp)
        )
        Column(
            modifier = Modifier
                .background(Color(0xFFF2F4F7))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.box_name),
                    style = MaterialTheme.typography.bodyLarge,
                )
                OutlinedTextField(
                    value = loginUiState.emailAddress,
                    onValueChange = {
                                    viewModel.updateUserInput(loginUiState.copy(emailAddress = it))
                    },
                    placeholder = {
                        Text(text = stringResource(id = R.string.hint_email))
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.password),
                    style = MaterialTheme.typography.bodyLarge,
                )
                OutlinedTextField(
                    value = loginUiState.password,
                    onValueChange = {
                                    viewModel.updateUserInput(loginUiState.copy(password = it))
                                    },
                    placeholder = {
                        Text(text = stringResource(id = R.string.hint_password))
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = {
                    onLoginClick()
//                    viewModel.loginUser()
                          },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF063B27),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Text(text = stringResource(id = R.string.login))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHiLogin() {
    TitansFreeLunchTheme {
        Hi_Login(
            onLoginClick = {},
            viewModel = LoginViewModel()
        )
    }
}
