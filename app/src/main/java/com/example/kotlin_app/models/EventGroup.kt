package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventGroup (

  @SerializedName("id"                           ) var id                       : Int?    = null,
  @SerializedName("name"                         ) var name                     : String? = null,
  @SerializedName("event_group_detail_id"        ) var eventGroupDetailId       : Int?    = null,
  @SerializedName("uts"                          ) var uts                      : Int?    = null,
  @SerializedName("review_needed_for_live_class" ) var reviewNeededForLiveClass : Int?    = null
)