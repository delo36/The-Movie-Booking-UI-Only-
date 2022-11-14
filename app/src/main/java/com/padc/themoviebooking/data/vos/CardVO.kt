package com.padc.themoviebooking.data.vos

import com.google.gson.annotations.SerializedName

data class CardVO(
    @SerializedName("id")
    val id: Int?,

    @SerializedName("card_holder")
    val cardHolder: String?,

    @SerializedName("card_number")
    val cardNumber: String?,

    @SerializedName("card_type")
    val cardType: String?,

    @SerializedName("image")
    val image: String?,

    @SerializedName("amount")
    val amount: String?,
)