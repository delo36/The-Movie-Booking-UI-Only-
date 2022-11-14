package com.padc.themoviebooking.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.activities.TimeSlotActivity
import com.padc.themoviebooking.viewholders.CinemaViewHolder

class CinemaAdapter(timeSlotActivity: TimeSlotActivity) :RecyclerView.Adapter<CinemaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cinema,parent,false)
        return CinemaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}