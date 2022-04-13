package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventRatings (

  @SerializedName("eventFeeDetail"   ) var eventFeeDetail: EventFeeDetail   = EventFeeDetail()


)