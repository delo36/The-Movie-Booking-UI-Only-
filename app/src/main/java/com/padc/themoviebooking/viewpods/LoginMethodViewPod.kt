package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.GetStartedActivity
import com.padc.themoviebooking.activities.HomeScreenActivity
import com.padc.themoviebooking.adapters.ComingSoonMovieAdapter
import com.padc.themoviebooking.delegates.ComingSoonMovieViewHolderDelegate
import com.padc.themoviebooking.delegates.LoginMethodDelegate
import kotlinx.android.synthetic.main.view_pod_coming_soon_movie_list.view.*
import kotlinx.android.synthetic.main.view_pod_login_method.view.*

class LoginMethodViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mLoginMethodDelegate: LoginMethodDelegate

    fun setDelegate(delegate: LoginMethodDelegate){
        this.mLoginMethodDelegate  = delegate
    }

    override fun onFinishInflate() {

        btnConfirm.setOnClickListener(){
            mLoginMethodDelegate.onTapConfirm()
        }

        super.onFinishInflate()
    }



}