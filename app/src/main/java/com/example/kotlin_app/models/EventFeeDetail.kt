package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventFeeDetail (

  @SerializedName("id"            ) var id           : String? = null,
  @SerializedName("fee_amount"    ) var feeAmount    : String? = null,
  @SerializedName("ticket_amount" ) var ticketAmount : Int?    = null,
  @SerializedName("uts"           ) var uts          : Int?    = null

)