package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class UserExtendedDetail (

  @SerializedName("id"                                     ) var id                               : Int? = null,
  @SerializedName("uts"                                    ) var uts                              : Int? = null,
  @SerializedName("has_hidden_test_event_card"             ) var hasHiddenTestEventCard           : Int? = null,
  @SerializedName("has_hidden_book_a_demo_card"            ) var hasHiddenBookADemoCard           : Int? = null,
  @SerializedName("has_hidden_get_started_on_moxie_card"   ) var hasHiddenGetStartedOnMoxieCard   : Int? = null,
  @SerializedName("has_hidden_attendee_waiver_card"        ) var hasHiddenAttendeeWaiverCard      : Int? = null,
  @SerializedName("has_hidden_invite_user_card"            ) var hasHiddenInviteUserCard          : Int? = null,
  @SerializedName("has_hidden_invite_now_team_member_card" ) var hasHiddenInviteNowTeamMemberCard : Int? = null,
  @SerializedName("is_my_instructors_list_present"         ) var isMyInstructorsListPresent       : Int? = null,
  @SerializedName("user_message_setting_id"                ) var userMessageSettingId             : Int? = null,
  @SerializedName("current_user_user_message_relation_id"  ) var currentUserUserMessageRelationId : Int? = null,
  @SerializedName("current_user_user_relation_id"          ) var currentUserUserRelationId        : Int? = null,
  @SerializedName("message_centre_user_id"                 ) var messageCentreUserId              : Int? = null,
  @SerializedName("has_gallery_images"                     ) var hasGalleryImages                 : Int? = null

)