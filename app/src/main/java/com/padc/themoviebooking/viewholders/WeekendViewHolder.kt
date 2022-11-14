package com.padc.themoviebooking.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.delegates.CastComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.WeekendViewHolderDelegate

class WeekendViewHolder(itemView: View, private val mDelegate: WeekendViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
        /*  itemView.setOnClickListener {
              mDelegate.onTapOnGenreMovieDetail()
          }*/
    }
}