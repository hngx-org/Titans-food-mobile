package com.example.titansfreelunch.data.api

import com.example.titansfreelunch.data.model.Lunch
import com.example.titansfreelunch.data.model.Organization
import com.example.titansfreelunch.data.model.OrganizationInvite
import com.example.titansfreelunch.data.model.Withdrawal
import com.example.titansfreelunch.data.model.Login
import com.example.titansfreelunch.data.model.OrganizationLunchWallet
import com.example.titansfreelunch.data.model.Signup
import com.example.titansfreelunch.data.model.StaffSignup
import com.example.titansfreelunch.data.models.FreeLunchResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {

    // Authentication
    @POST(" ")
    suspend fun login(@Body request: Login): FreeLunchResponse

    @POST(" ")
    suspend fun signup(@Body request: Signup): FreeLunchResponse

    @PUT("")
    suspend fun createOrganization(
        @Header("Authorization") authToken: String,
        @Body request: Organization
    ): FreeLunchResponse

    @POST(" ")
    suspend fun staffSignup(@Body request: StaffSignup): FreeLunchResponse

    @POST(" ")
    suspend fun createOrganizationInvite(@Body request: OrganizationInvite): FreeLunchResponse

    @PATCH(" ")
    suspend fun updateWalletBalance(
        @Header("Authorization") authorization: String,
        @Body request: OrganizationLunchWallet
    ): FreeLunchResponse

    @PATCH(" ")
    suspend fun updateLunchPrice(
        @Header("Authorization") authorization: String,
        @Body request: Organization
    ): FreeLunchResponse

    // User
    @GET(" ")
    suspend fun getUser(): FreeLunchResponse

    @GET(" ")
    suspend fun getAllUsers(): FreeLunchResponse

    @GET(" ")
    suspend fun searchUser(): FreeLunchResponse

    // Lunch
    @POST(" ")
    suspend fun sendLunch(@Body request: Lunch): FreeLunchResponse

    @GET(" ")
    suspend fun getLunch(): FreeLunchResponse

    @GET(" ")
    suspend fun getAllLunches(): FreeLunchResponse

    // Redeeming Lunch
    @POST
    suspend fun redeemLunch(@Body request: Lunch): FreeLunchResponse

    // Withdrawal Request
    @POST(" ")
    suspend fun withdrawRequest(@Body request: Withdrawal): FreeLunchResponse
}
