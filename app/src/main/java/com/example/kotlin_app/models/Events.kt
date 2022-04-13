package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Events (

  @SerializedName("eventMap"   ) var eventMap: Map<Int,Event>? = null

)