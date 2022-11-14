package com.padc.themoviebooking.data.vos

import com.google.gson.annotations.SerializedName

data class UserVO (
    @SerializedName("id")
    val id: Int?,

    @SerializedName("name")
    val name: String?,

    @SerializedName("email")
    val email: String?,

    @SerializedName("phone")
    val phone: String?,

    @SerializedName("google_id")
    val googleId: String?,

    @SerializedName("facebook_id")
    val facebookId: String?,

    @SerializedName("total_expense")
    val totalExpense: Int?,

    @SerializedName("profile_image")
    val profileImage: String?,

    @SerializedName("cards")
    val cards: List<CardVO>?
)