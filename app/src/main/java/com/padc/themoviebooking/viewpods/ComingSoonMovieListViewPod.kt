package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.HomeScreenActivity
import com.padc.themoviebooking.adapters.ComingSoonMovieAdapter
import com.padc.themoviebooking.delegates.ComingSoonMovieViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_coming_soon_movie_list.view.*
import kotlinx.android.synthetic.main.view_pod_now_showing_movie_list.view.*

class ComingSoonMovieListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mComingSoonMovieAdapter: ComingSoonMovieAdapter
    private lateinit var mDelegate: ComingSoonMovieViewHolderDelegate

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
        mComingSoonMovieAdapter = ComingSoonMovieAdapter(mDelegate)
        rvComingSoonMovieList.adapter = mComingSoonMovieAdapter
        rvComingSoonMovieList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}