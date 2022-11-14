package com.padc.themoviebooking.data.vos

import com.google.gson.annotations.SerializedName

data class TimeSlotVO (

    @SerializedName("cinema_timeslot_id")
    val cinemaTimeSlotId: Int?,

    @SerializedName("start_time")
    val startTime: String?,

)