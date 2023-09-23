package com.example.titansfreelunch.repository

import com.example.titansfreelunch.data.api.ApiService
import com.example.titansfreelunch.data.model.Login
import com.example.titansfreelunch.data.model.Lunch
import com.example.titansfreelunch.data.model.Organization
import com.example.titansfreelunch.data.model.OrganizationInvite
import com.example.titansfreelunch.data.model.OrganizationLunchWallet
import com.example.titansfreelunch.data.model.Signup
import com.example.titansfreelunch.data.model.StaffSignup
import com.example.titansfreelunch.data.model.Withdrawal
import com.example.titansfreelunch.data.models.FreeLunchResponse
import javax.inject.Inject

class FreeLunchRepository @Inject constructor(private val apiService: ApiService) {

    // Authentication
    suspend fun login(request: Login): FreeLunchResponse {
        return apiService.login(request)
    }

    suspend fun signup(request: Signup): FreeLunchResponse {
        return apiService.signup(request)
    }

    suspend fun createOrganization(authToken: String, request: Organization): FreeLunchResponse {
        return apiService.createOrganization(authToken, request)
    }

    suspend fun staffSignup(request: StaffSignup): FreeLunchResponse {
        return apiService.staffSignup(request)
    }

    suspend fun createOrganizationInvite(request: OrganizationInvite): FreeLunchResponse {
        return apiService.createOrganizationInvite(request)
    }

    suspend fun updateWalletBalance(authorization: String, request: OrganizationLunchWallet): FreeLunchResponse {
        return apiService.updateWalletBalance(authorization, request)
    }

    suspend fun updateLunchPrice(authorization: String, request: Organization): FreeLunchResponse {
        return apiService.updateLunchPrice(authorization, request)
    }

    // User
    suspend fun getUser(): FreeLunchResponse {
        return apiService.getUser()
    }

    suspend fun getAllUsers(): FreeLunchResponse {
        return apiService.getAllUsers()
    }

    suspend fun searchUser(): FreeLunchResponse {
        return apiService.searchUser()
    }

    // Lunch
    suspend fun sendLunch(request: Lunch): FreeLunchResponse {
        return apiService.sendLunch(request)
    }

    suspend fun getLunch(): FreeLunchResponse {
        return apiService.getLunch()
    }

    suspend fun getAllLunches(): FreeLunchResponse {
        return apiService.getAllLunches()
    }

    // Redeeming Lunch
    suspend fun redeemLunch(request: Lunch): FreeLunchResponse {
        return apiService.redeemLunch(request)
    }

    // Withdrawal Request
    suspend fun withdrawRequest(request: Withdrawal): FreeLunchResponse {
        return apiService.withdrawRequest(request)
    }
}
