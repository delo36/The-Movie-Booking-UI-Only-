package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.CastNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreNowShowingMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import com.padc.themoviebooking.viewpods.CastComingSoonMovieDetailViewPod
import com.padc.themoviebooking.viewpods.CastNowShowingMovieDetailViewPod
import com.padc.themoviebooking.viewpods.GenreComingSoonMovieDetailViewPod
import com.padc.themoviebooking.viewpods.GenreNowShowingMovieDetailViewPod
import kotlinx.android.synthetic.main.activity_coming_soon_movie_details.*
import kotlinx.android.synthetic.main.activity_now_showing_movie_details.*


class NowShowingMovieDetailsActivity : AppCompatActivity(),NowShowingMovieViewHolderDelegate,
    CastNowShowingMovieDetailViewHolderDelegate, GenreNowShowingMovieDetailViewHolderDelegate {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,NowShowingMovieDetailsActivity::class.java)
        }
    }

    lateinit var mGenreNowShowingMovieDetailViewPod: GenreNowShowingMovieDetailViewPod
    lateinit var mCastMovieDetailViewPod: CastNowShowingMovieDetailViewPod

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_now_showing_movie_details)

        setUpViewPods()

        btnConfirmNowShowing.setOnClickListener {
            startActivity(TimeSlotActivity.newIntent(this))
        }
    }

    private fun setUpViewPods() {
        mGenreNowShowingMovieDetailViewPod = vpMovieGenreNowShowing as GenreNowShowingMovieDetailViewPod
        mGenreNowShowingMovieDetailViewPod.setUpGenreListViewPod(this)

        mCastMovieDetailViewPod = vpCastNowShowing as CastNowShowingMovieDetailViewPod
        mCastMovieDetailViewPod.setUpCastListViewPod(this)
    }



    override fun onTapNowShowingMovie() {

    }

    override fun onTapOnCastMovieDetail() {

    }

    override fun onTapOnGenreMovieDetail() {

    }


}