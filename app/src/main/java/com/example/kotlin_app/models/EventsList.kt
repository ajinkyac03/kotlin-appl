package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventsList (

  @SerializedName("success" ) var success : Boolean? = null,
  @SerializedName("data"    ) var data    : Data?    = Data()

)