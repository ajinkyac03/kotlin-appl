package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Text (

  @SerializedName("id"   ) var id   : String? = null,
  @SerializedName("text" ) var text : String? = null,
  @SerializedName("uts"  ) var uts  : Int?    = null

)