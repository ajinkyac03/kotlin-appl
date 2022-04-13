package com.example.kotlin_app.models

import com.google.gson.annotations.SerializedName


data class Event (

    @SerializedName("id"                                                  ) var id                                            : String?   = null,
    @SerializedName("owner_user_id"                                       ) var ownerUserId                                   : String?   = null,
    @SerializedName("instructor_user_id"                                  ) var instructorUserId                              : String?   = null,
    @SerializedName("event_group_id"                                      ) var eventGroupId                                  : String?   = null,
    @SerializedName("location_id"                                         ) var locationId                                    : String?   = null,
    @SerializedName("event_group_cover_image_id"                          ) var eventGroupCoverImageId                        : String?   = null,
    @SerializedName("kind"                                                ) var kind                                          : String?   = null,
    @SerializedName("event_stats_for_instructor_id"                       ) var eventStatsForInstructorId                     : String?   = null,
    @SerializedName("event_meta_id"                                       ) var eventMetaId                                   : String?   = null,
    @SerializedName("event_fee_detail_id"                                 ) var eventFeeDetailId                              : String?   = null,
    @SerializedName("event_recurring_detail_id"                           ) var eventRecurringDetailId                        : String?   = null,
    @SerializedName("status"                                              ) var status                                        : String?   = null,
    @SerializedName("cancellation_reason"                                 ) var cancellationReason                            : String?   = null,
    @SerializedName("total_attended"                                      ) var totalAttended                                 : Int?      = null,
    @SerializedName("previous_start_timestamp"                            ) var previousStartTimestamp                        : String?   = null,
    @SerializedName("start_timestamp"                                     ) var startTimestamp                                : Int?      = null,
    @SerializedName("warmup_start_timestamp"                              ) var warmupStartTimestamp                          : Int?      = null,
    @SerializedName("end_timestamp"                                       ) var endTimestamp                                  : Int?      = null,
    @SerializedName("current_user_event_relation_id"                      ) var currentUserEventRelationId                    : String?   = null,
    @SerializedName("current_individual_user_event_relation_id"           ) var currentIndividualUserEventRelationId          : String?   = null,
    @SerializedName("instructor_only_event_stat_id"                       ) var instructorOnlyEventStatId                     : String?   = null,
    @SerializedName("event_state_id"                                      ) var eventStateId                                  : Int?      = null,
    @SerializedName("event_meeting_association_id"                        ) var eventMeetingAssociationId                     : Int?      = null,
    @SerializedName("current_user_recording_allowed_action_id"            ) var currentUserRecordingAllowedActionId           : Int?      = null,
    @SerializedName("current_individual_user_recording_allowed_action_id" ) var currentIndividualUserRecordingAllowedActionId : Int?      = null,
    @SerializedName("current_user_event_rating_id"                        ) var currentUserEventRatingId                      : Int?      = null,
    @SerializedName("event_inventory_id"                                  ) var eventInventoryId                              : Int?      = null,
    @SerializedName("has_recording"                                       ) var hasRecording                                  : Int?      = null,
    @SerializedName("is_recording_visible"                                ) var isRecordingVisible                            : Int?      = null,
    @SerializedName("uts"                                                 ) var uts                                           : Int?      = null,
    @SerializedName("event_rating_id"                                     ) var eventRatingId                                 : String?   = null,
    @SerializedName("event_collection_id"                                 ) var eventCollectionId                             : String?   = null,
    @SerializedName("created_at"                                          ) var createdAt                                     : Int?      = null,
    @SerializedName("is_hidden_from_schedule"                             ) var isHiddenFromSchedule                          : Int?      = null,
    @SerializedName("cannot_be_reserved_with_bundle"                      ) var cannotBeReservedWithBundle                    : Int?      = null,
    @SerializedName("is_vod"                                              ) var isVod                                         : Int?      = null,
    @SerializedName("is_recording_being_processed"                        ) var isRecordingBeingProcessed                     : Int?      = null,
    @SerializedName("is_recording_featured"                               ) var isRecordingFeatured                           : Int?      = null,
    @SerializedName("recording_video_id"                                  ) var recordingVideoId                              : String?   = null,
    @SerializedName("recording_video_source"                              ) var recordingVideoSource                          : String?   = null,
    @SerializedName("supports_marketplace"                                ) var supportsMarketplace                           : Int?      = null,
    @SerializedName("event_purchase_upsell_challenge_id"                  ) var eventPurchaseUpsellChallengeId                : Int?      = null,
    @SerializedName("event_purchase_upsell_subscription_id"               ) var eventPurchaseUpsellSubscriptionId             : Int?      = null,
    @SerializedName("vod_unlock_upsell_package_id"                        ) var vodUnlockUpsellPackageId                      : Int?      = null,
    @SerializedName("vod_unlock_upsell_subscription_id"                   ) var vodUnlockUpsellSubscriptionId                 : Int?      = null,
    @SerializedName("vod_unlock_upsell_challenge_id"                      ) var vodUnlockUpsellChallengeId                    : Int?      = null,
    @SerializedName("is_promotional"                                      ) var isPromotional                                 : Int?      = null


)