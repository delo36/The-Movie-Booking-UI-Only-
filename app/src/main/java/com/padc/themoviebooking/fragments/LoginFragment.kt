package com.padc.themoviebooking.fragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.padc.themoviebooking.R
import com.padc.themoviebooking.activities.GetStartedActivity
import com.padc.themoviebooking.delegates.LoginMethodDelegate
import com.padc.themoviebooking.viewpods.LoginMethodViewPod
import kotlinx.android.synthetic.main.activity_get_started.*
import kotlinx.android.synthetic.main.activity_login_fragment.*

class LoginFragment(mDelegate: LoginMethodDelegate) : Fragment(){

    lateinit var mDelegate: LoginMethodDelegate
    private lateinit var loginMethodViewPod: LoginMethodViewPod

    override fun onAttach(context: Context) {
        mDelegate = context as LoginMethodDelegate
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_login_fragment, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        loginMethodViewPod = vpLogInButton as LoginMethodViewPod
        loginMethodViewPod.setDelegate(mDelegate)
        super.onViewCreated(view, savedInstanceState)
    }



}