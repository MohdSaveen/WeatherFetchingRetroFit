package com.example.weatherfetchingretrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("/forecast.json")
     suspend fun getUserDetails(@Query("key") key:String,
                       @Query("q") q:String,
                       @Query("days") days: Int,
                       @Query("aqi") aqi : String,
                       @Query("alerts") alerts:String
    ) : Response<ResponseDTO>


}