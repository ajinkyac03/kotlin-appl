package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventGroupDetails (

  @SerializedName("eventFeeDetail"   ) var eventFeeDetail: EventFeeDetail   = EventFeeDetail()

)