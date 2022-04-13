package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("switchable_team_user_ids"                          ) var switchableTeamUserIds                        : ArrayList<String>                             = arrayListOf(),
  @SerializedName("current_user"                                      ) var currentUser                                  : CurrentUser?                                  = CurrentUser(),
  @SerializedName("events"                                            ) var events                                       : Events?                                       = Events(),
  @SerializedName("event_states"                                      ) var eventStates                                  : EventStates?                                  = EventStates(),
  @SerializedName("event_metas"                                       ) var eventMetas                                   : EventMetas?                                   = EventMetas(),
  @SerializedName("locations"                                         ) var locations                                    : Locations?                                    = Locations(),
  @SerializedName("event_fee_details"                                 ) var eventFeeDetails                              : EventFeeDetails?                              = EventFeeDetails(),
  @SerializedName("current_user_events_relation"                      ) var currentUserEventsRelation                    : CurrentUserEventsRelation?                    = CurrentUserEventsRelation(),
  @SerializedName("event_inventories"                                 ) var eventInventories                             : EventInventories?                             = EventInventories(),
  @SerializedName("owner_stripe_account_details"                      ) var ownerStripeAccountDetails                    : OwnerStripeAccountDetails?                    = OwnerStripeAccountDetails(),
  @SerializedName("currencies"                                        ) var currencies                                   : Currencies?                                   = Currencies(),
  @SerializedName("countries"                                         ) var countries                                    : Countries?                                    = Countries(),
  @SerializedName("texts"                                             ) var texts                                        : Texts?                                        = Texts(),
  @SerializedName("users"                                             ) var users                                        : Users?                                        = Users(),
  @SerializedName("images"                                            ) var images                                       : Images?                                       = Images(),
  @SerializedName("meta"                                              ) var meta                                         : Meta?                                         = Meta(),
  @SerializedName("timezone"                                          ) var timezone                                     : Timezone?                                     = Timezone(),
  @SerializedName("event_ids"                                         ) var eventIds                                     : ArrayList<Int>                                = arrayListOf(),
  @SerializedName("logged_in_user"                                    ) var loggedInUser                                 : LoggedInUser?                                 = LoggedInUser(),
  @SerializedName("categories"                                        ) var categories                                   : Categories?                                   = Categories(),
  @SerializedName("event_ratings"                                     ) var eventRatings                                 : EventRatings?                                 = EventRatings(),
  @SerializedName("current_user_message_centre_detail"                ) var currentUserMessageCentreDetail               : CurrentUserMessageCentreDetail?               = CurrentUserMessageCentreDetail(),
  @SerializedName("event_groups"                                      ) var eventGroups                                  : EventGroups?                                  = EventGroups(),
  @SerializedName("event_group_details"                               ) var eventGroupDetails                            : EventGroupDetails?                            = EventGroupDetails(),
  @SerializedName("event_meetings"                                    ) var eventMeetings                                : EventMeetings?                                = EventMeetings(),
  @SerializedName("event_meeting_associations"                        ) var eventMeetingAssociations                     : EventMeetingAssociations?                     = EventMeetingAssociations(),
  @SerializedName("current_user_recording_allowed_actions"            ) var currentUserRecordingAllowedActions           : CurrentUserRecordingAllowedActions?           = CurrentUserRecordingAllowedActions(),
  @SerializedName("current_individual_user_recording_allowed_actions" ) var currentIndividualUserRecordingAllowedActions : CurrentIndividualUserRecordingAllowedActions? = CurrentIndividualUserRecordingAllowedActions(),
  @SerializedName("current_user_moxie_pass_summary"                   ) var currentUserMoxiePassSummary                  : CurrentUserMoxiePassSummary?                  = CurrentUserMoxiePassSummary(),
  @SerializedName("current_user_event_ratings"                        ) var currentUserEventRatings                      : CurrentUserEventRatings?                      = CurrentUserEventRatings(),
  @SerializedName("videos"                                            ) var videos                                       : Videos?                                       = Videos(),
  @SerializedName("video_view_meta"                                   ) var videoViewMeta                                : VideoViewMeta?                                = VideoViewMeta(),
  @SerializedName("user_extended_details"                             ) var userExtendedDetails                          : UserExtendedDetails?                          = UserExtendedDetails(),
  @SerializedName("video_signed_urls"                                 ) var videoSignedUrls                              : VideoSignedUrls?                              = VideoSignedUrls(),
  @SerializedName("external_videos_info"                              ) var externalVideosInfo                           : ExternalVideosInfo?                           = ExternalVideosInfo(),
  @SerializedName("video_preview_signed_urls"                         ) var videoPreviewSignedUrls                       : VideoPreviewSignedUrls?                       = VideoPreviewSignedUrls(),
  @SerializedName("event_group_category_associations"                 ) var eventGroupCategoryAssociations               : EventGroupCategoryAssociations?               = EventGroupCategoryAssociations(),
  @SerializedName("current_user_user_relations"                       ) var currentUserUserRelations                     : CurrentUserUserRelations?                     = CurrentUserUserRelations(),
  @SerializedName("result_type"                                       ) var resultType                                   : String?                                       = null,
  @SerializedName("result_type_lookup"                                ) var resultTypeLookup                             : String?                                       = null

)