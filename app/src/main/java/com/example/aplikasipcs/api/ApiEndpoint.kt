package com.example.aplikasipcs.api

import com.example.aplikasipcs.response.login.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiEndpoint {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ) : Call<LoginResponse>
}