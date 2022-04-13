package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventStates (

  @SerializedName("event"   ) var event: Event? = Event(),

)