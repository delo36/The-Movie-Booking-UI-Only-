package com.padc.themoviebooking.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate

class NowShowingMovieViewHolder(itemView: View, private val mDelegate: NowShowingMovieViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            mDelegate.onTapNowShowingMovie()
        }
    }
}