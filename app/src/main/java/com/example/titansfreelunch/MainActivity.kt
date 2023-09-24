package com.example.titansfreelunch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.example.titansfreelunch.navigation.FreeLunchNavHost
import com.example.titansfreelunch.ui.hi_login.HiLoginUiState
import com.example.titansfreelunch.ui.hi_login.Hi_Login
import com.example.titansfreelunch.ui.screen.authentication.SignupScreen
import com.example.titansfreelunch.ui.screen.authentication.SignupScreenViewModel
import com.example.titansfreelunch.ui.screen.authentication.organization.SetupOrganizationScreen
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationDetailsScreen
import com.example.titansfreelunch.ui.theme.TitansFreeLunchTheme
import com.example.titansfreelunch.viewModel.login.LoginViewModel
import com.example.titansfreelunch.viewModel.signup.OrganizationSignUpViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TitansFreeLunchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
//                    app entry comes here
                    FreeLunchNavHost(navController)
//                    val viewModel: OrganizationSignUpViewModel = hiltViewModel()
//                    Hi_Login(
//                    onLoginClick = {},
//                        viewModel = viewModel
//                    )

//                    SignupOrganizationDetailsScreen(
//                        onOrganizationSignupButtonClicked = {  },
//                        signUpViewModel = viewModel
//                    )
                }
            }
        }
    }
}

