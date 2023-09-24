package com.example.titansfreelunch.viewModel.login

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.titansfreelunch.data.api.ApiClient
import com.example.titansfreelunch.data.models.Login
import com.example.titansfreelunch.ui.hi_login.HiLoginUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {
    private val _uiState: MutableState<HiLoginUiState> = mutableStateOf(
        HiLoginUiState(
            emailAddress = "",
            password = ""
        )
    )

    val uiState: State<HiLoginUiState> = _uiState

    fun updatePassword(newPassword: String) {
        _uiState.value = _uiState.value.copy(
            password = newPassword
        )
    }

    fun updateEmailAddress(newEmailAddress: String) {
        _uiState.value = _uiState.value.copy(
            emailAddress = newEmailAddress
        )
    }

    private val _loginUiState = MutableStateFlow(HiLoginUiState())
    val loginUiState = _loginUiState

    fun updateUserInput(userInput: HiLoginUiState) {
        _loginUiState.value = userInput
    }
    fun loginUser() {
        viewModelScope.launch {
            try{
                val login = Login(
                    email= loginUiState.value.emailAddress,
                    password = loginUiState.value.password
                )
                val loginResponse = ApiClient.retrofitService.login(login)
                Log.d("login", "Response: $loginResponse")
            } catch (e: Exception) {
                Log.e("error", "error is: $e")
            }
        }
    }
}