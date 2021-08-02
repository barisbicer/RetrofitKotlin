package com.example.retrofitkotlin3.service

import com.example.retrofitkotlin3.model.FlightModel
import retrofit2.Call
import retrofit2.http.GET

interface FlightAPI {


    @GET("barisbicer/flightTestJSON/main/flightTest.json")



    fun getData(): Call<List<FlightModel>>
}

