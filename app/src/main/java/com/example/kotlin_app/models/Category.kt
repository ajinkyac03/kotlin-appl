package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Category (

  @SerializedName("id"   ) var id   : Int?    = null,
  @SerializedName("name" ) var name : String? = null,
  @SerializedName("uts"  ) var uts  : Int?    = null

)