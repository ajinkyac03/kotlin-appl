package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Users (

  @SerializedName("userExtendedDetail" ) var userExtendedDetail : UserExtendedDetail? = UserExtendedDetail()


)