package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventInventories (

  @SerializedName("event"   ) var event: Event? = Event(),

  )