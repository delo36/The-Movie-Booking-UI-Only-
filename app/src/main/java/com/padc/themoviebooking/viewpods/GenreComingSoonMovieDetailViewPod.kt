package com.padc.themoviebooking.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.activities.ComingSoonMovieDetailsActivity
import com.padc.themoviebooking.adapters.GenreComingSoonMovieDetailAdapter
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import kotlinx.android.synthetic.main.view_pod_genre_coming_soon_movie_detail.view.*

class GenreComingSoonMovieDetailViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var mGenreMovieDetailAdapter: GenreComingSoonMovieDetailAdapter
    private lateinit var mDelegate: GenreComingSoonMovieDetailViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpGenreListViewPod(delegate: ComingSoonMovieDetailsActivity){
        setDelegate(delegate)
        setUpRecyclerView()
    }

    private fun setDelegate(delegate: ComingSoonMovieDetailsActivity){
        this.mDelegate = delegate
    }

    private fun setUpRecyclerView() {
        mGenreMovieDetailAdapter = GenreComingSoonMovieDetailAdapter(mDelegate)
        rvGenreComingSoonMovieDetail.adapter = mGenreMovieDetailAdapter
        rvGenreComingSoonMovieDetail.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}