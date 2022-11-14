package com.padc.themoviebooking.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import com.padc.themoviebooking.delegates.WeekendViewHolderDelegate
import com.padc.themoviebooking.viewholders.NowShowingMovieViewHolder
import com.padc.themoviebooking.viewholders.WeekendViewHolder

class WeekendAdapter(private val mDelegate: WeekendViewHolderDelegate): RecyclerView.Adapter<WeekendViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekendViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_holder_weekend,parent,false)
        return WeekendViewHolder(view,mDelegate)
    }

    override fun onBindViewHolder(holder: WeekendViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 7
    }
}