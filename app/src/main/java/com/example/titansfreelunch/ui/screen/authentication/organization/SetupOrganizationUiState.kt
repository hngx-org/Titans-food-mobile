package com.example.titansfreelunch.ui.screen.authentication.organization

data class SetupOrganizationUiState(
    val organizationName: String = "",
    val lunchPrice: String = "",
    val successState : Boolean = false
)
