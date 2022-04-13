package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Location (

  @SerializedName("id"              ) var id            : String? = null,
  @SerializedName("venue_name"      ) var venueName     : String? = null,
  @SerializedName("address_line1"   ) var addressLine1  : String? = null,
  @SerializedName("address_line2"   ) var addressLine2  : String? = null,
  @SerializedName("city"            ) var city          : String? = null,
  @SerializedName("state"           ) var state         : String? = null,
  @SerializedName("country"         ) var country       : String? = null,
  @SerializedName("zip_code"        ) var zipCode       : String? = null,
  @SerializedName("google_place_id" ) var googlePlaceId : String? = null,
  @SerializedName("latitude"        ) var latitude      : String? = null,
  @SerializedName("longitude"       ) var longitude     : String? = null,
  @SerializedName("more_details"    ) var moreDetails   : String? = null,
  @SerializedName("map_url"         ) var mapUrl        : String? = null,
  @SerializedName("uts"             ) var uts           : Int?    = null

)