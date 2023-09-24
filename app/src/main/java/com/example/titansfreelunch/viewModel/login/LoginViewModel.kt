package com.example.titansfreelunch.viewModel.login

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.titansfreelunch.ui.hi_login.HiLoginUiState
import dagger.hilt.android.lifecycle.HiltViewModel
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
}