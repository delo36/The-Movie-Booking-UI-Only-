package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.NowShowingMovieDetailsActivity
import com.padc.themoviebooking.adapters.GenreComingSoonMovieDetailAdapter
import com.padc.themoviebooking.adapters.GenreNowShowingMovieDetailAdapter
import com.padc.themoviebooking.delegates.GenreNowShowingMovieDetailViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_movie_detail_genre_now_showing.view.*

class GenreNowShowingMovieDetailViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mGenreNowSoonMovieDetailAdapter: GenreNowShowingMovieDetailAdapter
    private lateinit var mDelegate: GenreNowShowingMovieDetailViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpGenreListViewPod(delegate: NowShowingMovieDetailsActivity){
        setDelegate(delegate)
        setUpRecyclerView()
    }

    private fun setDelegate(delegate: NowShowingMovieDetailsActivity){
        this.mDelegate = delegate
    }

    private fun setUpRecyclerView() {
        mGenreNowSoonMovieDetailAdapter = GenreNowShowingMovieDetailAdapter(mDelegate)
        rvGenreNowShowingMovieDetail.adapter = mGenreNowSoonMovieDetailAdapter
        rvGenreNowShowingMovieDetail.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}