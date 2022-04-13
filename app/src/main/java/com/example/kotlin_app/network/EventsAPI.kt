package com.example.kotlin_app.network

import com.example.kotlin_app.models.EventsList
import retrofit2.http.GET

interface EventsAPI {

    @GET("/api/v2/events/")
    suspend fun getEventsList(): EventsList


}