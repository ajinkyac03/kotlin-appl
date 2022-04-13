package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class EventMeta (

  @SerializedName("id"                             ) var id                         : String? = null,
  @SerializedName("name"                           ) var name                       : String? = null,
  @SerializedName("permalink"                      ) var permalink                  : String? = null,
  @SerializedName("description_text_id"            ) var descriptionTextId          : String? = null,
  @SerializedName("level"                          ) var level                      : String? = null,
  @SerializedName("intensity"                      ) var intensity                  : String? = null,
  @SerializedName("equipment_text_id"              ) var equipmentTextId            : String? = null,
  @SerializedName("duration"                       ) var duration                   : Int?    = null,
  @SerializedName("capacity"                       ) var capacity                   : Int?    = null,
  @SerializedName("instagram_username"             ) var instagramUsername          : String? = null,
  @SerializedName("is_hidden_from_schedule"        ) var isHiddenFromSchedule       : Int?    = null,
  @SerializedName("cannot_be_reserved_with_bundle" ) var cannotBeReservedWithBundle : Int?    = null,
  @SerializedName("uts"                            ) var uts                        : Int?    = null

)