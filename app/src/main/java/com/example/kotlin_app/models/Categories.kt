package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Categories (

  @SerializedName("category"  ) var category  : Category?  = Category()

)