package com.padc.themoviebooking.adapters

import PaymentMethodViewHolder
import SnackViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.activities.TimeSlotActivity
import com.padc.themoviebooking.viewholders.CinemaViewHolder

class PaymentMethodAdapter() :RecyclerView.Adapter<PaymentMethodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentMethodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_payment_method,parent,false)
        return PaymentMethodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: PaymentMethodViewHolder, position: Int) {

    }
}