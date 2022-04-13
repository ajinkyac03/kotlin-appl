package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Texts (

  @SerializedName("text") var text: Text?   = Text()

)