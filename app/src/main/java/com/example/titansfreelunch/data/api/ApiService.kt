package com.example.titansfreelunch.data.api

import com.example.titansfreelunch.data.model.Lunch
import com.example.titansfreelunch.data.model.Organization
import com.example.titansfreelunch.data.model.OrganizationInvite
import com.example.titansfreelunch.data.model.Withdrawal
import com.example.titansfreelunch.data.models.Login
import com.example.titansfreelunch.data.model.OrganizationLunchWallet
import com.example.titansfreelunch.data.models.apiModels.SignupModel
import com.example.titansfreelunch.data.models.StaffSignup
import com.example.titansfreelunch.data.models.FreeLunchResponse
import com.example.titansfreelunch.data.models.apiModels.ResponseClass
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {

    // User Authentication
    @POST("api/v1/auth/user/signup")
    suspend fun signup(request: SignupModel): Response<ResponseClass>

    @POST("api/auth/user/signin")
    @Headers("Content-type: application/json, Accept: application/json")
    suspend fun login(@Body request: Login): FreeLunchResponse

    // For Organizations

    @POST("api/organization/invite")
    @Headers("Content-type: application/json, Accept: application/json")
    suspend fun createOrganizationInvite(@Body request: OrganizationInvite): FreeLunchResponse

    @PUT("api/organization/create")
    @Headers("Content-type: application/json, Accept: application/json")
    suspend fun createOrganization(
        authToken: String,
        @Body request: Organization
    ): FreeLunchResponse




//    @GET("api/organization")
//    @Headers("Content-type: application/json, Accept: application/json")
//    suspend fun listOrganizations(
//        authToken: String,
//        request : OrganizationList
//    )

    // Todo - To be continued

    // For Staff

    @POST(" ")
    suspend fun staffSignup(@Body request: StaffSignup): FreeLunchResponse



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
