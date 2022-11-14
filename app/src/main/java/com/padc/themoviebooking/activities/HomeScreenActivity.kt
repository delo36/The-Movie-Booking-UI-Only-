package com.padc.themoviebooking.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.padc.themoviebooking.R
import com.padc.themoviebooking.delegates.ComingSoonMovieViewHolderDelegate
import com.padc.themoviebooking.delegates.NowShowingMovieViewHolderDelegate
import com.padc.themoviebooking.viewpods.ComingSoonMovieListViewPod
import com.padc.themoviebooking.viewpods.NowShowingMovieListViewPod
import kotlinx.android.synthetic.main.activity_home_screen.*


class HomeScreenActivity : AppCompatActivity(), NowShowingMovieViewHolderDelegate,
    ComingSoonMovieViewHolderDelegate{

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,HomeScreenActivity::class.java)
        }
    }

    lateinit var mMoviesByNowShowingViewPod : NowShowingMovieListViewPod
    lateinit var mMoviesByComingSoonViewPod : ComingSoonMovieListViewPod


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        setUpToolbar()

        setUpViewPods()

        nvDrawer.setOnClickListener {
            setupDrawer()
        }


    }

    private fun setupDrawer(){
        if (drawerLayout.isDrawerOpen(nvDrawer)) {
            drawerLayout.closeDrawer(nvDrawer)
        } else {
            drawerLayout.openDrawer(nvDrawer)
        }
    }

    private fun setUpViewPods() {
        mMoviesByNowShowingViewPod = vpNowShowingMovieList as NowShowingMovieListViewPod
        mMoviesByNowShowingViewPod.setUpMovieListViewPod(this)

        mMoviesByComingSoonViewPod = vpComingSoonMovieList as ComingSoonMovieListViewPod
        mMoviesByComingSoonViewPod.setUpMovieListViewPod(this)

    }

    private fun setUpToolbar() {
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menus)
    }

  /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }*/


    override fun onTapOnComingSoonMovie() {
        startActivity(ComingSoonMovieDetailsActivity.newIntent(this))
    }

    override fun onTapNowShowingMovie() {
        startActivity(NowShowingMovieDetailsActivity.newIntent(this))
    }

    override fun onSupportNavigateUp(): Boolean {
        drawerLayout.openDrawer(nvDrawer)
        return true
    }

    // override the onBackPressed() function to close the Drawer when the back button is clicked
    override fun onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

}