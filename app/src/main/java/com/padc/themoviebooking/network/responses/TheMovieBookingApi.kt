package com.padc.themoviebooking.network.responses

import com.padc.themoviebooking.data.vos.MovieVO
import com.padc.themoviebooking.util.*
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieBookingApi {

    @POST(API_REGISTER_WITH_EMAIL)
    @FormUrlEncoded
    fun registerWithEmail(
        @Field(PARAM_NAME) name:String,
        @Field(PARAM_EMAIL) email:String,
        @Field(PARAM_PHONE) phone:String,
        @Field(PARAM_PASSWORD) password:String,
    ): Call<TokenResponse>

    @POST(API_LOGIN_WITH_EMAIL)
    @FormUrlEncoded
    fun loginWithEmail(
        @Field(PARAM_EMAIL) email:String,
        @Field(PARAM_PASSWORD) password:String,
    ): Call<TokenResponse>

    @POST(API_GET_PROFILE)
    @FormUrlEncoded
    fun getProfile(
       @Header(PARAM_AUTHORIZATION) token : String,
    ): Call<TokenResponse>

    @POST(API_GET_MOVIE_LIST)
    @FormUrlEncoded
    fun getMovieListByStatus(
        @Query(PARAM_STATUS) status : String,
        @Query(PARAM_TAKE) take : Int = 10,

        ): Call<MovieListResponse>

    @GET("$API_GET_MOVIE_DETAILS/{movie_id}")
    fun getMovieDetail(
        @Path("movie_id") movieId:String,
        @Query(PARAM_API_KEY) apiKey: String = MOVIES_API_KEY,
        @Query(PARAM_PAGE) page: Int = 1,
    ): Call<MovieVO>

 /*   @POST(API_GET_CINEMA_LIST)
    @FormUrlEncoded
    fun getCinemaList(
        @Header(PARAM_AUTHORIZATION) token : String,
        @Query(PARAM_MOVIE_ID) movieId : String,
        @Query(PARAM_DATE) date : String,
    ): Call<CinemaListResponse>*/
}