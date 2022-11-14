package com.padc.themoviebooking.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.delegates.CastComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.CastNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreNowShowingMovieDetailViewHolderDelegate

class CastMovieDetailViewHolderNowShowing(itemView: View, private val mDelegate: CastNowShowingMovieDetailViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
        /*  itemView.setOnClickListener {
              mDelegate.onTapOnGenreMovieDetail()
          }*/
    }
}