package com.padc.themoviebooking.network.dataagents

import com.padc.themoviebooking.data.vos.MovieVO
import com.padc.themoviebooking.data.vos.UserVO
import com.padc.themoviebooking.network.responses.MovieListResponse
import com.padc.themoviebooking.network.responses.TheMovieBookingApi
import com.padc.themoviebooking.network.responses.TokenResponse
import com.padc.themoviebooking.util.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitDataAgentImpl : MovieDataAgent {
    private var mMovieBookingApi: TheMovieBookingApi? = null

    init {
        val mOkHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(mOkHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        mMovieBookingApi = retrofit.create(TheMovieBookingApi::class.java)

    }

    override fun registerWithEmail(
        name: String,
        phone: String,
        email: String,
        password: String,
        onSuccess: (Pair<String, UserVO>, massage:String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieBookingApi?.registerWithEmail(
            name = name,
            phone = phone,
            email = email,
            password = password
        )
            ?.enqueue(object : Callback<TokenResponse> {
                override fun onResponse(
                    call: Call<TokenResponse>,
                    response: Response<TokenResponse>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.data?.let {
                            onSuccess(Pair(response.body()?.token ?: "", it),response.body()?.message ?: "")
                        }
                    } else {
                        onFailure(response.message())
                    }
                }

                override fun onFailure(call: Call<TokenResponse>, t: Throwable) {
                    onFailure(t.message?:"")
                }
            })
    }

    override fun loginWithEmail(
        email: String,
        password: String,
        onSuccess: (Pair<String,UserVO>,massage:String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieBookingApi?.loginWithEmail(
            email = email,
            password = password
        )
            ?.enqueue(object : Callback<TokenResponse> {
                override fun onResponse(
                    call: Call<TokenResponse>,
                    response: Response<TokenResponse>
                ) {
                    if (response.isSuccessful) {
                        if(response.body()?.code == 200){
                            response.body()?.data?.let {
                                onSuccess(Pair(response.body()?.token ?: "", it),response.body()?.message ?: "")
                            }
                        }
                    } else {
                        onFailure(response.message())
                    }
                }

                override fun onFailure(call: Call<TokenResponse>, t: Throwable) {
                    onFailure(t.message?:"")
                }
            })
    }

    override fun getProfile(
        token: String,
        onSuccess: (TokenResponse) -> Unit,
        onFailure: (String) -> Unit
    ) {

        mMovieBookingApi?.getProfile(
            token = token,
        )
            ?.enqueue(object : Callback<TokenResponse> {
                override fun onResponse(
                    call: Call<TokenResponse>,
                    response: Response<TokenResponse>
                ) {
                    if (response.isSuccessful) {
                        if(response.body()?.code == 200){
                            response.body()?.let(onSuccess)
                        }
                    } else {
                        onFailure(response.message())
                    }
                }

                override fun onFailure(call: Call<TokenResponse>, t: Throwable) {
                    onFailure(t.message?:"")
                }
            })
    }

    override fun getMovieListByStatus(
        status: String,
        onSuccess: (List<MovieListResponse>) -> Unit,
        onFailure: (String) -> Unit
    ) {

        mMovieBookingApi?.getMovieListByStatus(
            status = status,
        )
            ?.enqueue(object : Callback<MovieListResponse> {
                override fun onResponse(
                    call: Call<MovieListResponse>,
                    response: Response<MovieListResponse>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            onSuccess(listOf(it))
                        }
                    } else {
                        onFailure(response.message())
                    }
                }

                override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                    onFailure(t.message?:"")
                }
            })

    }

    override fun getMovieDetail(
        movieId: String,
        onSuccess: (MovieVO) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieBookingApi?.getMovieDetail(
            movieId = movieId,
        )
            ?.enqueue(object : Callback<MovieVO> {
                override fun onResponse(
                    call: Call<MovieVO>,
                    response: Response<MovieVO>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            onSuccess(it)
                        }
                    } else {
                        onFailure(response.message())
                    }
                }

                override fun onFailure(call: Call<MovieVO>, t: Throwable) {
                    onFailure(t.message?:"")
                }
            })
    }


}