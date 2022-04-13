package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Locations (

  @SerializedName("location"  ) var location: Location  = Location()

)