package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Timezone (

  @SerializedName("zone" ) var zone : String? = null

)