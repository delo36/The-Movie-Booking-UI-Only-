package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.ComingSoonMovieDetailsActivity
import com.padc.themoviebooking.adapters.CastComingSoonMovieDetailAdapter
import com.padc.themoviebooking.adapters.GenreComingSoonMovieDetailAdapter
import com.padc.themoviebooking.delegates.CastComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_cast_coming_soon_movie_detail.view.*
import kotlinx.android.synthetic.main.view_pod_genre_coming_soon_movie_detail.view.*

class CastComingSoonMovieDetailViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mCastMovieDetailAdapter: CastComingSoonMovieDetailAdapter
    private lateinit var mDelegate: CastComingSoonMovieDetailViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpCastListViewPod(delegate: ComingSoonMovieDetailsActivity){
        setDelegate(delegate)
        setUpRecyclerView()
    }

    private fun setDelegate(delegate: ComingSoonMovieDetailsActivity){
        this.mDelegate = delegate
    }

    private fun setUpRecyclerView() {
        mCastMovieDetailAdapter = CastComingSoonMovieDetailAdapter(mDelegate)
        rvCastComingSoonMovieDetail.adapter = mCastMovieDetailAdapter
        rvCastComingSoonMovieDetail.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}