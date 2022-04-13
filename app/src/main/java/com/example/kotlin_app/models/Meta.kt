package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Meta (

  @SerializedName("next_page_payload" ) var nextPagePayload : NextPagePayload? = NextPagePayload()

)