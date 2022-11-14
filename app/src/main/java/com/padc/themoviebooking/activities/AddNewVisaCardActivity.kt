package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.themoviebooking.R
import kotlinx.android.synthetic.main.activity_add_new_visa_card.*

class AddNewVisaCardActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,AddNewVisaCardActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_visa_card)

        btnConfirm.setOnClickListener{
            finish()
        }
    }
}