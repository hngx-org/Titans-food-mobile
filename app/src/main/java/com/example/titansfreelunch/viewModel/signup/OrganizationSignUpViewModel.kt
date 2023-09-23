package com.example.titansfreelunch.viewModel.signup

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.titansfreelunch.data.models.apimodel.SignupModel
import com.example.titansfreelunch.repository.FreeLunchRepository
import com.example.titansfreelunch.ui.screen.authentication.organization.SignupOrganizationUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


private const val TAG = "OrganizationSignUpViewModel"

@HiltViewModel
class OrganizationSignUpViewModel @Inject constructor(
    private val repository: FreeLunchRepository
) : ViewModel() {

    var firstName = MutableStateFlow("")
    var lastName = MutableStateFlow("")
    var email = MutableStateFlow("")
    var password = MutableStateFlow("")
    var phoneNumber = MutableStateFlow("")

    var sucessMessage = ""

    var errorMessage: String? = ""

    fun saveDetails() {
        viewModelScope.launch {
            val request = SignupModel(
                firstName.value,
                lastName.value,
                email.value, password.value, phoneNumber.value
            )

            val response = repository.signup(request)

            if (response.isSuccessful) {
                val responseBody = response.body()
                if (responseBody != null) {

                    val statusCode = responseBody.statusCode.toInt()

                    if (statusCode == 201) {

                        sucessMessage = responseBody.message

                        Log.d(TAG, "Response is $statusCode")
                    }
                }

            } else {
                // Handle the error
                val errorBody = response.errorBody()?.string()

                errorMessage = errorBody

                Log.d(TAG, "Response is $errorBody")
                // Parse and handle the error message
            }
        }
        Log.d(TAG, "Successful Response is $sucessMessage")

        Log.d(TAG, "Error Response is $errorMessage")
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