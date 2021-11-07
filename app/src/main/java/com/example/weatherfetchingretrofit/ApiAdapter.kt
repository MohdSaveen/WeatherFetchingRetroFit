package com.example.weatherfetchingretrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiAdapter {

    val apiServices: ApiServices = Retrofit.Builder()
            .baseUrl("http://api.weatherapi.com/v1/")
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiServices::class.java)

}