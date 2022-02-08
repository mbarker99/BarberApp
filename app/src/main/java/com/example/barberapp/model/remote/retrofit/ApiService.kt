package com.example.barberapp.model.remote.retrofit

import com.example.barberapp.model.response.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("Content-type:application/json")
    @POST
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<LoginResponse>

}