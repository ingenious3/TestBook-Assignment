package com.example.testbook.network

import com.example.testbook.data.model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("popular-courses")
    fun getCourses(@Query("isPremium") isPremium: Boolean,
                   @Query("includeIndividual") includeIndividual: Boolean): Call<Response>
}