package com.padc.themoviebooking.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.themoviebooking.data.vos.UserVO

data class TokenResponse(
    @SerializedName("code")
    val code: Int?,

    @SerializedName("data")
    val data: UserVO?,

    @SerializedName("message")
    val message: String?,

    @SerializedName("token")
    val token: String?
)