package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class NextPagePayload (

  @SerializedName("pagination_identifier" ) var paginationIdentifier : String? = null

)