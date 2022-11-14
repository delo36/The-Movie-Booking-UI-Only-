package com.padc.themoviebooking.data.models

import com.padc.themoviebooking.data.vos.MovieVO
import com.padc.themoviebooking.data.vos.UserVO
import com.padc.themoviebooking.network.responses.MovieListResponse
import com.padc.themoviebooking.network.responses.TokenResponse

interface MovieBookingModel {
    fun registerWithEmail(
        name : String,
        phone:String,
        email: String,
        password:String,
        onSuccess: (massage:String) -> Unit,
        onFailure: (String) -> Unit
    )

    fun loginWithEmail(
        email: String,
        password:String,
        onSuccess: (massage:String) -> Unit,
        onFailure: (String) -> Unit
    )

  /*  fun getProfile(
        token:String,
        onSuccess: (TokenResponse)-> Unit,
        onFailure: (String) -> Unit
    )

    fun getMovieListByStatus(
        status:String,
        onSuccess: (List<MovieListResponse>)-> Unit,
        onFailure: (String) -> Unit
    )

    fun getMovieDetail(
        movieId : String,
        onSuccess: (MovieVO)-> Unit,
        onFailure: (String) -> Unit
    )*/
}