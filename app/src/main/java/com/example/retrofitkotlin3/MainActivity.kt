package com.example.retrofitkotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofitkotlin3.model.FlightModel
import com.example.retrofitkotlin3.service.FlightAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val BASE_URL="https://raw.githubusercontent.com/"
    private var flightModels : ArrayList<FlightModel>? =null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
    }

    private fun loadData() {

        val retrofit=Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val  service =retrofit.create(FlightAPI::class.java)

        val call=service.getData()
        call.enqueue(object : Callback<List<FlightModel>>{
            override fun onResponse(call: Call<List<FlightModel>>, response: Response<List<FlightModel>>) {

             if(response.isSuccessful){
                 response.body()?.let {
                     flightModels=ArrayList(it)
                     for (flightModel : FlightModel in flightModels!!){
                         println("Gel_Ad:"+flightModel.rkgelcag)
                     }
                 }
             }


            }

            override fun onFailure(call: Call<List<FlightModel>>, t: Throwable) {
                t.printStackTrace()
            }

        })




    }

}