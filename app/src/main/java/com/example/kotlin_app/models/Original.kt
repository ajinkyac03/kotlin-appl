package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Original (

  @SerializedName("height" ) var height : Int?    = null,
  @SerializedName("width"  ) var width  : Int?    = null,
  @SerializedName("url"    ) var url    : String? = null

)