package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class OwnerStripeAccountDetails (

  @SerializedName("ownerStripeAccountDetail" ) var ownerStripeAccountDetail : OwnerStripeAccountDetail? = OwnerStripeAccountDetail()

)