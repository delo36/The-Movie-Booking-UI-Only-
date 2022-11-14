package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.HomeScreenActivity
import com.padc.themoviebooking.activities.TimeSlotActivity
import com.padc.themoviebooking.adapters.NowShowingMovieAdapter
import com.padc.themoviebooking.adapters.WeekendAdapter
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import com.padc.themoviebooking.delegates.WeekendViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_now_showing_movie_list.view.*
import kotlinx.android.synthetic.main.view_pod_weekend.view.*


class WeekendViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mWeekendAdapter: WeekendAdapter
    private lateinit var mDelegate: WeekendViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpWeekendViewPod(delegate: TimeSlotActivity){
        setDelegate(delegate)
        setUpRecyclerView()
    }

    private fun setDelegate(delegate: TimeSlotActivity){
        this.mDelegate = delegate
    }

    private fun setUpRecyclerView() {
        mWeekendAdapter = WeekendAdapter(mDelegate)
        rvWeekendList.adapter = mWeekendAdapter
        rvWeekendList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}