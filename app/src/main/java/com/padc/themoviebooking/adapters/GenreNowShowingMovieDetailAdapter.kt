package com.padc.themoviebooking.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.GenreNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.viewholders.GenreMovieDetailViewHolderNowShowing

class GenreNowShowingMovieDetailAdapter(private val mDelegate: GenreNowShowingMovieDetailViewHolderDelegate): RecyclerView.Adapter<GenreMovieDetailViewHolderNowShowing>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreMovieDetailViewHolderNowShowing {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_holder_genre_coming_soon_movie_detail,parent,false)
        return GenreMovieDetailViewHolderNowShowing(view,mDelegate)
    }

    override fun onBindViewHolder(holder: GenreMovieDetailViewHolderNowShowing, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}