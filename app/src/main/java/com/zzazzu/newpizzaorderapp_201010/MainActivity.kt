package com.zzazzu.newpizzaorderapp_201010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var mViewPagerAdapter: MainViewPagerAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            setupEvents()
            setValues()
        }


        override fun setupEvents() {

        }

        override fun setValues() {

            mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
            mainViewPager.adapter = mViewPagerAdapter

            mainTabLayout.setupWithViewPager(mainViewPager)

    }
}