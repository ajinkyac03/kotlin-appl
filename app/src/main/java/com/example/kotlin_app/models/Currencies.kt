package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Currencies (

  @SerializedName("country" ) var country: Country = Country()

)