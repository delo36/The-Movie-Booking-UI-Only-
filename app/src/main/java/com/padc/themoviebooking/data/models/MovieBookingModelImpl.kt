package com.padc.themoviebooking.data.models

import com.padc.themoviebooking.data.vos.UserVO
import com.padc.themoviebooking.network.dataagents.MovieDataAgent
import com.padc.themoviebooking.network.dataagents.RetrofitDataAgentImpl

object MovieBookingModelImpl : MovieBookingModel {
    var mToken : String? = null
    private val mMovieDataAgent: MovieDataAgent = RetrofitDataAgentImpl
    override fun registerWithEmail(
        name: String,
        phone: String,
        email: String,
        password: String,
        onSuccess: (message: String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieDataAgent.registerWithEmail(
            name = name,
            phone = phone,
            email = email,
            password = password,
            onSuccess = {
                paraseData,message ->

                val token = paraseData.first
                val userVO = paraseData.second

                this.mToken =  "Bearer "+token

                onSuccess(message)

            },
            onFailure = onFailure
        )
    }

    override fun loginWithEmail(
        email: String,
        password: String,
        onSuccess: (massage: String) -> Unit,
        onFailure: (String) -> Unit
    ) {

        mMovieDataAgent.loginWithEmail(
            email = email,
            password = password,
            onSuccess = {
                    paraseData,message ->

                val token = paraseData.first
                val userVO = paraseData.second

                this.mToken =  "Bearer "+token

                onSuccess(message)

            },
            onFailure = onFailure
        )
    }


}