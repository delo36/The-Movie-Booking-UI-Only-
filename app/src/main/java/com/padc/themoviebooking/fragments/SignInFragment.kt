package com.padc.themoviebooking.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.LoginMethodDelegate
import com.padc.themoviebooking.viewpods.LoginMethodViewPod
import kotlinx.android.synthetic.main.activity_login_fragment.*

class SignInFragment(mDelegate: LoginMethodDelegate) : Fragment(){

    lateinit var mDelegate: LoginMethodDelegate
    private lateinit var signInMethodViewPod: LoginMethodViewPod

    override fun onAttach(context: Context) {
        mDelegate = context as LoginMethodDelegate
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_sign_in_fragment, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupViewPodWithDelegate()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setupViewPodWithDelegate() {
        signInMethodViewPod = vpLogInButton as LoginMethodViewPod
        signInMethodViewPod.setDelegate(mDelegate)
    }

}