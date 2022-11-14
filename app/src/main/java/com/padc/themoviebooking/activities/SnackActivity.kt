package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.padc.themoviebooking.R
import com.padc.themoviebooking.adapters.MovieSeatAdapter
import com.padc.themoviebooking.adapters.PaymentMethodAdapter
import com.padc.themoviebooking.adapters.SnackAdapter
import kotlinx.android.synthetic.main.activity_select_seats.*
import kotlinx.android.synthetic.main.activity_snack.*

class SnackActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,SnackActivity::class.java)
        }
    }

    private val snackAdapter = SnackAdapter()
    private val paymentMethodAdapter = PaymentMethodAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)

        setupSnackRecyclerView()

        btnPay.setOnClickListener {
            startActivity(CarouselActivity.newIntent(this))
        }

    }

    private fun setupSnackRecyclerView() {
        rvComboSet.adapter = snackAdapter
        rvComboSet.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)

        rvPaymentMethod.adapter = paymentMethodAdapter
        rvPaymentMethod.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
    }
}