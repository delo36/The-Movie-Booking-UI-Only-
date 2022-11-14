package com.padc.themoviebooking.adapters

import alirezat775.lib.carouselview.CarouselAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.data.vos.EmptyVisaVo
import com.padc.themoviebooking.data.vos.VisaVO
import kotlinx.android.synthetic.main.item_empty_carousel.view.*
import kotlinx.android.synthetic.main.item_view_carousel.view.*

class CarouselAdapter : CarouselAdapter() {

    private val EMPTY_ITEM = 0
    private val NORMAL_ITEM = 1

    private var vh: CarouselViewHolder? = null
    var onClick: OnClick? = null

    fun setOnClickListener(onClick: OnClick?) {
        this.onClick = onClick
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItems()[position]) {
            is EmptyVisaVo -> EMPTY_ITEM
            else -> NORMAL_ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == NORMAL_ITEM) {
            val v = inflater.inflate(R.layout.item_view_carousel, parent, false)
            vh = MyViewHolder(v)
            vh as MyViewHolder
        } else {
            val v = inflater.inflate(R.layout.item_empty_carousel, parent, false)
            vh = EmptyMyViewHolder(v)
            vh as EmptyMyViewHolder
        }
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        when (holder) {
            is MyViewHolder -> {
                vh = holder
                val model = getItems()[position] as VisaVO
                (vh as MyViewHolder).title.text = model.getId().toString()
            }
            else -> {
                vh = holder
                val model = getItems()[position] as EmptyVisaVo
                (vh as EmptyMyViewHolder).titleEmpty.text = model.getText()
            }
        }
    }

    inner class MyViewHolder(itemView: View) : CarouselViewHolder(itemView) {

        var title: TextView = itemView.tvCardHolderTitle

        init {
            title.setOnClickListener { onClick?.click(getItems()[adapterPosition] as VisaVO) }
        }

    }

    inner class EmptyMyViewHolder(itemView: View) : CarouselViewHolder(itemView) {
        var titleEmpty: TextView = itemView.tvEmptyTitle
    }

    interface OnClick {
        fun click(model: VisaVO)
    }
}