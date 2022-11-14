package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.HomeScreenActivity
import com.padc.themoviebooking.adapters.NowShowingMovieAdapter
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_now_showing_movie_list.view.*


class NowShowingMovieListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mNowShowingMovieAdapter: NowShowingMovieAdapter
    private lateinit var mDelegate: NowShowingMovieViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpMovieListViewPod(delegate: HomeScreenActivity){
        setDelegate(delegate)
        setUpRecyclerView()
    }

    private fun setDelegate(delegate: HomeScreenActivity){
        this.mDelegate = delegate
    }

    private fun setUpRecyclerView() {
        mNowShowingMovieAdapter = NowShowingMovieAdapter(mDelegate)
        rvNowShowingMovieList.adapter = mNowShowingMovieAdapter
        rvNowShowingMovieList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}