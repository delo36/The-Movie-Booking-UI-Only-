package com.padc.themoviebooking.activities

import alirezat775.lib.carouselview.Carousel
import alirezat775.lib.carouselview.CarouselView
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.themoviebooking.R
import com.padc.themoviebooking.adapters.CarouselAdapter
import com.padc.themoviebooking.data.vos.VisaVO
import kotlinx.android.synthetic.main.activity_carousel.*

class CarouselActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,CarouselActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousel)

        setupCarousel()
        buttonListener()
    }

    private fun buttonListener() {
        tvAddNewCard.setOnClickListener {
            startActivity(AddNewVisaCardActivity.newIntent(this))
        }
        btnConfirm.setOnClickListener {
            startActivity(VoucherActivity.newIntent(this))

        }
    }

    private fun setupCarousel() {
        val adapter = CarouselAdapter()
        val carousel = Carousel(this, carouselView, adapter)
        carousel.setOrientation(CarouselView.HORIZONTAL, false)
        carousel.scaleView(true)

        carousel.add(VisaVO(1))
        carousel.add(VisaVO(2))
        carousel.add(VisaVO(3))
        carousel.add(VisaVO(4))
        carousel.add(VisaVO(5))

        carousel.setCurrentPosition(3)
    }
}