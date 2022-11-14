package com.padc.themoviebooking.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.delegates.ComingSoonMovieViewHolderDelegate
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate

class ComingSoonMovieViewHolder(itemView: View, private val mDelegate: ComingSoonMovieViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            mDelegate.onTapOnComingSoonMovie()
        }
    }
}