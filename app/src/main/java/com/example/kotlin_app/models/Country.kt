package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Country (

  @SerializedName("id"               ) var id            : String? = null,
  @SerializedName("alpha_2_iso_code" ) var alpha2IsoCode : String? = null,
  @SerializedName("name"             ) var name          : String? = null,
  @SerializedName("uts"              ) var uts           : Int?    = null

)