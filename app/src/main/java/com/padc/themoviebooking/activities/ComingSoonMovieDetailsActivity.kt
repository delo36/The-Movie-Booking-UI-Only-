package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.CastComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.delegates.GenreComingSoonMovieDetailViewHolderDelegate
import com.padc.themoviebooking.viewholders.CastMovieDetailViewHolderComingSoon
import com.padc.themoviebooking.viewpods.CastComingSoonMovieDetailViewPod
import com.padc.themoviebooking.viewpods.GenreComingSoonMovieDetailViewPod
import com.padc.themoviebooking.viewpods.GenreNowShowingMovieDetailViewPod
import kotlinx.android.synthetic.main.activity_coming_soon_movie_details.*
import kotlinx.android.synthetic.main.activity_now_showing_movie_details.*

class ComingSoonMovieDetailsActivity : AppCompatActivity(), GenreComingSoonMovieDetailViewHolderDelegate ,CastComingSoonMovieDetailViewHolderDelegate{

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,ComingSoonMovieDetailsActivity::class.java)
        }
    }

    lateinit var mGenreMovieDetailViewPodComingSoon : GenreComingSoonMovieDetailViewPod
    lateinit var mCastMovieDetailViewPod: CastComingSoonMovieDetailViewPod

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coming_soon_movie_details)

        setUpViewPods()

        btnConfirmComingSoon.setOnClickListener {
            startActivity(TimeSlotActivity.newIntent(this))
        }
    }

    private fun setUpViewPods() {
        mGenreMovieDetailViewPodComingSoon = vpGenreComingSoon as GenreComingSoonMovieDetailViewPod
        mGenreMovieDetailViewPodComingSoon.setUpGenreListViewPod(this)

        mCastMovieDetailViewPod = vpCastComingSoon as CastComingSoonMovieDetailViewPod
        mCastMovieDetailViewPod.setUpCastListViewPod(this)
    }

    override fun onTapOnGenreMovieDetail() {

    }

    override fun onTapOnCastMovieDetail() {

    }
}