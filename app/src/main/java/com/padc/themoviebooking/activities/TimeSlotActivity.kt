package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.R
import com.padc.themoviebooking.adapters.CinemaAdapter
import com.padc.themoviebooking.delegates.WeekendViewHolderDelegate
import com.padc.themoviebooking.viewpods.WeekendViewPod
import kotlinx.android.synthetic.main.activity_time_slot.*

class TimeSlotActivity : AppCompatActivity(),WeekendViewHolderDelegate {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,TimeSlotActivity::class.java)
        }
    }

    lateinit var mWeekendViewPod: WeekendViewPod
    private lateinit var cinemaAdapter: CinemaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_slot)

        btnNext.setOnClickListener {
            startActivity(SelectSeatsActivity.newIntent(this))
        }

        setUpViewPods()
        setUpShowcaseRecyclerView()
    }

    private fun setUpViewPods() {
        mWeekendViewPod = vpWeekend as WeekendViewPod
        mWeekendViewPod.setUpWeekendViewPod(this)
    }

    private fun setUpShowcaseRecyclerView() {
        cinemaAdapter = CinemaAdapter(this)
        rvCinema.adapter = cinemaAdapter
        rvCinema.layoutManager = LinearLayoutManager(applicationContext,
            LinearLayoutManager.VERTICAL,false)
    }

    override fun onTapOnWeekend() {
        TODO("Not yet implemented")
    }


}