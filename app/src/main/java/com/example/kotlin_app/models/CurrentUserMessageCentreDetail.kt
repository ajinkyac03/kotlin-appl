package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class CurrentUserMessageCentreDetail (

  @SerializedName("chat_service_api_key" ) var chatServiceApiKey : String? = null,
  @SerializedName("uts"                  ) var uts               : Int?    = null

)