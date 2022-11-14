package com.padc.themoviebooking.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.themoviebooking.data.vos.CinemaVO
import com.padc.themoviebooking.data.vos.UserVO

data class CinemaListResponse(
    @SerializedName("code")
    val code: Int?,

    @SerializedName("data")
    val data: List<CinemaVO>?,

    @SerializedName("message")
    val message: String?,


)