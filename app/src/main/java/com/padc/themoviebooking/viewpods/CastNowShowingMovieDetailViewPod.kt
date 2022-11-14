package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.ComingSoonMovieDetailsActivity
import com.padc.themoviebooking.activities.NowShowingMovieDetailsActivity
import com.padc.themoviebooking.adapters.CastComingSoonMovieDetailAdapter
import com.padc.themoviebooking.adapters.CastNowShowingMovieDetailAdapter
import com.padc.themoviebooking.adapters.GenreComingSoonMovieDetailAdapter
import com.padc.themoviebooking.delegates.CastComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.CastNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_cast_coming_soon_movie_detail.view.*
import kotlinx.android.synthetic.main.view_pod_cast_now_showing_movie_detail.view.*
import kotlinx.android.synthetic.main.view_pod_genre_coming_soon_movie_detail.view.*

class CastNowShowingMovieDetailViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mCastMovieDetailAdapter: CastNowShowingMovieDetailAdapter
    private lateinit var mDelegate: CastNowShowingMovieDetailViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpCastListViewPod(delegate: NowShowingMovieDetailsActivity){
        setDelegate(delegate)
        setUpRecyclerView()
    }

    private fun setDelegate(delegate: NowShowingMovieDetailsActivity){
        this.mDelegate = delegate
    }

    private fun setUpRecyclerView() {
        mCastMovieDetailAdapter = CastNowShowingMovieDetailAdapter(mDelegate)
        rvCastNowShowingMovieDetail.adapter = mCastMovieDetailAdapter
        rvCastNowShowingMovieDetail.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}