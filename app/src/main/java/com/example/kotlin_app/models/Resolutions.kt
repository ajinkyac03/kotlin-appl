package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Resolutions (

  @SerializedName("original" ) var original : Original? = Original()

)