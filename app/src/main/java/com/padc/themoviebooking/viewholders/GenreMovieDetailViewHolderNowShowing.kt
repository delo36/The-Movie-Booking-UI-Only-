package com.padc.themoviebooking.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreNowShowingMovieDetailViewHolderDelegate

class GenreMovieDetailViewHolderNowShowing(itemView: View, private val mDelegate: GenreNowShowingMovieDetailViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
        /*  itemView.setOnClickListener {
              mDelegate.onTapOnGenreMovieDetail()
          }*/
    }
}