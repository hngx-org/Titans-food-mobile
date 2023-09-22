package com.example.titansfreelunch.viewModel.signup

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.titansfreelunch.data.models.apiModels.SignupModel
import com.example.titansfreelunch.repository.FreeLunchRepository
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

    var errorMessage : String? = ""

    fun saveDetails() {
        viewModelScope.launch {
            val request = SignupModel(firstName.value,
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