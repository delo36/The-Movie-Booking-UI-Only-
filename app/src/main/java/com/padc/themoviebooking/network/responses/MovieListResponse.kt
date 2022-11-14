package com.padc.themoviebooking.network.responses

import com.google.gson.annotations.SerializedName

import com.padc.themoviebooking.data.vos.DateVO
import com.padc.themoviebooking.data.vos.MovieVO

data class MovieListResponse(
    @SerializedName("page")
    val page: Int?,

    @SerializedName("dates")
    val dates: DateVO?,

    @SerializedName("results")
    val results: List<MovieVO>?
)