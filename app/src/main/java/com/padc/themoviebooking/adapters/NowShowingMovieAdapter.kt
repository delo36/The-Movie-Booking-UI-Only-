package com.padc.themoviebooking.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import com.padc.themoviebooking.viewholders.NowShowingMovieViewHolder

class NowShowingMovieAdapter(private val mDelegate: NowShowingMovieViewHolderDelegate): RecyclerView.Adapter<NowShowingMovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowShowingMovieViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_holder_now_showing_movie,parent,false)
        return NowShowingMovieViewHolder(view,mDelegate)
    }

    override fun onBindViewHolder(holder: NowShowingMovieViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}