package com.padc.themoviebooking.viewholders

import MovieTimeAdapter
import android.view.View
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.adapters.CinemaAdapter
import kotlinx.android.synthetic.main.view_holder_cinema.view.*


class CinemaViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    lateinit var movieTimeAdapter: MovieTimeAdapter



    init {
        movieTimeAdapter = MovieTimeAdapter()
        itemView.rvMovieTime.adapter = movieTimeAdapter
        itemView.rvMovieTime.layoutManager = GridLayoutManager(itemView.context,3)
    }
}