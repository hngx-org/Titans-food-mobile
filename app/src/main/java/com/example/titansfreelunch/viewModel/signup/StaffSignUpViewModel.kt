package com.example.titansfreelunch.viewModel.signup

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.titansfreelunch.ui.screen.authentication.staff.SignupStaffUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StaffSignUpViewModel @Inject constructor() : ViewModel() {
    private var _uiState: MutableState<SignupStaffUiState> = mutableStateOf(
        SignupStaffUiState(
            firstName = "",
            lastName = "",
            emailAddress = "",
            phoneNumber = "",
            password = "",
            inviteCode = ""
        )
    )

    val uiState: State<SignupStaffUiState> = _uiState

    fun updateFirstName(newFirstName: String) {
        _uiState.value = _uiState.value.copy(
            firstName = newFirstName
        )
    }

    fun updateLastName(newLastName: String) {
        _uiState.value = _uiState.value.copy(
            lastName = newLastName
        )
    }

    fun updateEmailAddress(newEmailAddress: String) {
        _uiState.value = _uiState.value.copy(
            emailAddress = newEmailAddress
        )
    }

    fun updatePhoneNumber(newPhoneNumber: String) {
        _uiState.value = _uiState.value.copy(
            phoneNumber = newPhoneNumber
        )
    }

    fun updatePassword(newPassword: String) {
        _uiState.value = _uiState.value.copy(
            password = newPassword
        )
    }

    fun updateInviteCode(newInviteCode: String) {
        _uiState.value = _uiState.value.copy(
            inviteCode = newInviteCode
        )
    }

    fun signup() {

    }
}