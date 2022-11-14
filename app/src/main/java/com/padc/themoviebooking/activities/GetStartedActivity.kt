package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.google.android.material.tabs.TabLayout
import com.padc.themoviebooking.R
import com.padc.themoviebooking.adapters.LoginSignInAdapter
import com.padc.themoviebooking.delegates.LoginMethodDelegate
import com.padc.themoviebooking.dummy.dummyDataList
import com.padc.themoviebooking.fragments.LoginFragment
import com.padc.themoviebooking.fragments.SignInFragment
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStartedActivity : AppCompatActivity(), LoginMethodDelegate {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, GetStartedActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        setUpTabLayout()
        setupLoginViewPager()

    }

    private fun setupLoginViewPager() {
        val loginSignInAdapter = LoginSignInAdapter(this,this)
        viewPagerLogin.adapter = loginSignInAdapter
    }

    private fun setUpTabLayout() {
        dummyDataList.forEach {
            tabLayoutLoginMethod.newTab().apply {
                text = it
                tabLayoutLoginMethod.addTab(this)
            }
        }
    }



    override fun onTapConfirm() {
        startActivity(HomeScreenActivity.newIntent(this))
    }
}