package com.example.titansfreelunch.viewModel.signup

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.titansfreelunch.ui.screen.authentication.organization.SetupOrganizationUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SetupOrganizationViewModel @Inject constructor(): ViewModel() {
    private var _uiState: MutableState<SetupOrganizationUiState> =
        mutableStateOf(SetupOrganizationUiState())

    val uiState: State<SetupOrganizationUiState> = _uiState

    fun updateOrganizationName(newOrganizationName: String) {
        _uiState.value = _uiState.value.copy(
            organizationName = newOrganizationName
        )
    }

    fun updateLunchPrice(newLunchPrice: String) {
        _uiState.value = _uiState.value.copy(
            lunchPrice = newLunchPrice
        )
    }

    fun createOrganization() {

    }
}