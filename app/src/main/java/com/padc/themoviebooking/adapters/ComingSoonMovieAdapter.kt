package com.padc.themoviebooking.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.ComingSoonMovieViewHolderDelegate
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import com.padc.themoviebooking.viewholders.ComingSoonMovieViewHolder
import com.padc.themoviebooking.viewholders.NowShowingMovieViewHolder

class ComingSoonMovieAdapter(private val mDelegate: ComingSoonMovieViewHolderDelegate): RecyclerView.Adapter<ComingSoonMovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComingSoonMovieViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_holder_coming_soon_movie,parent,false)
        return ComingSoonMovieViewHolder(view,mDelegate)
    }

    override fun onBindViewHolder(holder: ComingSoonMovieViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}