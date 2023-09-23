package com.example.titansfreelunch.viewModel.profile

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.titansfreelunch.ui.screen.login.CreateProfileUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor() : ViewModel() {
    private val _uiState: MutableState<CreateProfileUiState> = mutableStateOf(
        CreateProfileUiState(
            fullName = "",
            password = "",
            confirmPassword = ""
        )
    )

    val uiState: State<CreateProfileUiState> = _uiState

    fun updateFullName(newFullName: String) {
        _uiState.value = _uiState.value.copy(
            fullName = newFullName
        )
    }

    fun updateConfirmPassword(newConfirmPassword: String) {
        _uiState.value = _uiState.value.copy(
            confirmPassword = newConfirmPassword
        )
    }

    fun updatePassword(newPassword: String) {
        _uiState.value = _uiState.value.copy(
            password = newPassword
        )
    }

    fun onFinish() {

    }
}