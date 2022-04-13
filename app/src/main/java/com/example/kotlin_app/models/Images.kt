package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("image"   ) var image: Image?  = Image()

)