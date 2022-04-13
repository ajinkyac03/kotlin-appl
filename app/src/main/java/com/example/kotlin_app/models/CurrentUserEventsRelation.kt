package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class CurrentUserEventsRelation (

  @SerializedName("event"   ) var event: Event? = Event(),


)