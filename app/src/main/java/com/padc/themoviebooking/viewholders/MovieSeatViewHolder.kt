package com.padc.themoviebooking.viewholders

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.data.vos.MovieSeatVO
import kotlinx.android.synthetic.main.view_holder_movie_seat.view.*

class MovieSeatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    fun blindData(data: MovieSeatVO){
        when{
            data.isMovieSeatAvailable() == true -> {
                itemView.tvMovieSeatTitle.visibility  = View.GONE
                itemView.background = ContextCompat.getDrawable(itemView.context, R.drawable.background_available_seats);
            }
            data.isMovieSeatTaken() == true ->{
                itemView.tvMovieSeatTitle.visibility = View.GONE
                itemView.background = ContextCompat.getDrawable(itemView.context, R.drawable.background_reserved_seats)
            }
            data.isMovieSeatRowTitle() ->{
                itemView.tvMovieSeatTitle.visibility = View.VISIBLE
                itemView.tvMovieSeatTitle.text = data.title
                itemView.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.white))
            }else ->{
                itemView.tvMovieSeatTitle.visibility = View.GONE
                itemView.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.white))
            }
        }
    }
}