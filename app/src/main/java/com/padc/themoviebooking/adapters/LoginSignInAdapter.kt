package com.padc.themoviebooking.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padc.themoviebooking.delegates.LoginMethodDelegate
import com.padc.themoviebooking.fragments.LoginFragment
import com.padc.themoviebooking.fragments.SignInFragment

class LoginSignInAdapter(fragmentActivity: FragmentActivity,private val mDelegate:LoginMethodDelegate):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
       return 2
    }

    override fun createFragment(position: Int): Fragment {
       return when(position){
           0 -> {
               LoginFragment(mDelegate)
           }else ->{
               SignInFragment(mDelegate)
           }
       }
    }
}