package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Image (

  @SerializedName("id"          ) var id          : Int?         = null,
  @SerializedName("resolutions" ) var resolutions : Resolutions? = Resolutions(),
  @SerializedName("status"      ) var status      : String?      = null,
  @SerializedName("uts"         ) var uts         : Int?         = null

)