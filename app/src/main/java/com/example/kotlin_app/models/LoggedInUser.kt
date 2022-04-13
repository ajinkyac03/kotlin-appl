package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class LoggedInUser (

    @SerializedName("id"               ) var id            : String? = null,

)