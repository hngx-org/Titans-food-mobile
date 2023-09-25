package com.example.titansfreelunch.viewModel.signup

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.titansfreelunch.data.models.SignUpModel
import com.example.titansfreelunch.repository.FreeLunchRepository
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "OrganizationSignUpViewModel"

@HiltViewModel
class OrganizationSignUpViewModel @Inject constructor(
    private val repository: FreeLunchRepository
) : ViewModel() {

    private val _navigateToNextScreen = MutableStateFlow(false)
    val navigateToNextScreen : StateFlow<Boolean> = _navigateToNextScreen

    fun navigateToNextScreen() {
        _navigateToNextScreen.value = true
    }
    fun resetNavigation() {
        _navigateToNextScreen.value = false
    }

    fun saveOrganizationDetails(uiState: SignupOrganizationUiState) {
        viewModelScope.launch {
            flow {
                val request = SignUpModel(
                    uiState.firstName,
                    uiState.lastName,
                    uiState.emailAddress,
                    uiState.phoneNumber,
                    uiState.password
                )
                val response = repository.signup(request)
                emit(response)
            }.collectLatest { response ->
                // Hopefully this works
                if (response.isSuccessful) {
                    navigateToNextScreen()
                    Log.i(TAG, "This was called under isSuccessful")
                } else {

                    Log.i(TAG, "This was called under else")
                }
                Log.i(TAG, "Response is ${response.body()?.status_code}")
            }
        }
    }
}