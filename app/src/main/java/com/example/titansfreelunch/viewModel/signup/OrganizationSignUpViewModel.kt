package com.example.titansfreelunch.viewModel.signup

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.titansfreelunch.data.models.OrganizationModel
import com.example.titansfreelunch.repository.FreeLunchRepository
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject


private const val TAG = "OrganizationSignUpViewModel"

@HiltViewModel
class OrganizationSignUpViewModel @Inject constructor(
    private val repository: FreeLunchRepository
) : ViewModel() {

    var successMessage = MutableStateFlow("")
    var errorMessage = MutableStateFlow("")
    var statusCheck = MutableStateFlow(false)

    fun saveOrganizationDetails(uiState: SignupOrganizationUiState) {
        viewModelScope.launch {
            flow {
                val request = OrganizationModel(
                    uiState.firstName,
                    uiState.lastName,
                    uiState.emailAddress,
                    uiState.phoneNumber,
                    uiState.password
                )
                val response = repository.signup(request)
                emit(response)
            }.collectLatest { response ->
                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        statusCheck.value = true
                        successMessage.value = responseBody.message
                    }
                } else {
                    val errorBody = response.errorBody()?.string()
                    statusCheck.value = false
                    errorMessage.value = errorBody !!
                }
            }
            Log.i(TAG, "Success message is $successMessage")
        }
    }
}



//@HiltViewModel
//class OrganizationSignUpViewModel @Inject constructor() : ViewModel() {
//    private var _uiState: MutableState<SignupOrganizationUiState> =
//        mutableStateOf(SignupOrganizationUiState())
//
//    val uiState: State<SignupOrganizationUiState> = _uiState
//
//
//    fun updateFirstName(newFirstName: String) {
//        _uiState.value = _uiState.value.copy(
//            firstName = newFirstName
//        )
//    }
//
//    fun updateLastName(newLastName: String) {
//        _uiState.value = _uiState.value.copy(
//            lastName = newLastName
//        )
//    }
//
//    fun updateEmailAddress(newEmailAddress: String) {
//        _uiState.value = _uiState.value.copy(
//            emailAddress = newEmailAddress
//        )
//    }
//
//    fun updatePhoneNumber(newPhoneNumber: String) {
//        _uiState.value = _uiState.value.copy(
//            phoneNumber = newPhoneNumber
//        )
//    }
//
//    fun updatePassword(newPassword: String) {
//        _uiState.value = _uiState.value.copy(
//            password = newPassword
//        )
//    }
//
//    fun signUp() {
//
//    }
//
//}