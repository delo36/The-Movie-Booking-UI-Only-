package com.padc.themoviebooking.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.viewholders.GenreMovieDetailViewHolderComingSoon

class GenreComingSoonMovieDetailAdapter(private val mDelegate: GenreComingSoonMovieDetailViewHolderDelegate): RecyclerView.Adapter<GenreMovieDetailViewHolderComingSoon>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreMovieDetailViewHolderComingSoon {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.view_holder_genre_coming_soon_movie_detail,parent,false)
        return GenreMovieDetailViewHolderComingSoon(view,mDelegate)
    }

    override fun onBindViewHolder(holder: GenreMovieDetailViewHolderComingSoon, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}