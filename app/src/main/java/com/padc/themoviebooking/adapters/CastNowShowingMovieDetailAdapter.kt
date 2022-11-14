package com.padc.themoviebooking.adapters

import com.padc.themoviebooking.delegates.CastComingSoonMovieDetailViewHolderDelegate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.CastNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.viewholders.CastMovieDetailViewHolderComingSoon
import com.padc.themoviebooking.viewholders.CastMovieDetailViewHolderNowShowing
import com.padc.themoviebooking.viewholders.GenreMovieDetailViewHolderComingSoon

class CastNowShowingMovieDetailAdapter(private val mDelegate: CastNowShowingMovieDetailViewHolderDelegate): RecyclerView.Adapter<CastMovieDetailViewHolderNowShowing>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastMovieDetailViewHolderNowShowing {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cast_coming_soon_movie_detail,parent,false)
        return CastMovieDetailViewHolderNowShowing(view,mDelegate)
    }

    override fun onBindViewHolder(holder: CastMovieDetailViewHolderNowShowing, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}