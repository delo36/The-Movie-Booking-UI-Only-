package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.padc.themoviebooking.R
import com.padc.themoviebooking.adapters.MovieSeatAdapter
import com.padc.themoviebooking.dummy.DUMMY_SEATS
import kotlinx.android.synthetic.main.activity_select_seats.*

class SelectSeatsActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,SelectSeatsActivity::class.java)
        }
    }

    private val movieSeatAdapter = MovieSeatAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_seats)

        setupSeatRecyclerView()

        btnBuyTicket.setOnClickListener {
            startActivity(SnackActivity.newIntent(this))

        }

    }

    private fun setupSeatRecyclerView() {
        rvShowSeats.adapter = movieSeatAdapter
        rvShowSeats.layoutManager = GridLayoutManager(applicationContext,10)

        movieSeatAdapter.setNewData(DUMMY_SEATS)
    }
}