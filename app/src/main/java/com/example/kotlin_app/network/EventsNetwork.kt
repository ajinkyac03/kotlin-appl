package com.example.kotlin_app.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object EventsNetwork{

    var gson = GsonBuilder()
        .setLenient()
        .create()

    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://stagingmoxie.xyz/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(EventsAPI::class.java)
    }
}