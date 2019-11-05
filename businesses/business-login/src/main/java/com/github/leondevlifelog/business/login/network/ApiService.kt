package com.github.leondevlifelog.business.login.network

import okhttp3.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/")
    suspend fun getTest(): Response
}