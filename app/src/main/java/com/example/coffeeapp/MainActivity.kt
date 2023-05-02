package com.example.coffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.coffeeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    lateinit var vp :ViewPager2
    var images = arrayOf(R.drawable.firstview, R.drawable.secondview, R.drawable.thirdview)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vp = binding.viewPager2 // Находит viewPager
        vp.currentItem = 3
        vp.adapter = VPAdapter(images)

        onInfinitePageChangeCallback(images.size + 2)

    }
    private fun onInfinitePageChangeCallback(listSize: Int) {
        vp.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)

                if (state == ViewPager2.SCROLL_STATE_IDLE) {
                    when (vp.currentItem) {
                        listSize - 1 -> vp.setCurrentItem(0, false)
                        0 -> vp.setCurrentItem(listSize - 2, false)
                    }
                }
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position != 0 && position != listSize - 1) {
                    // pageIndicatorView.setSelected(position-1)
                }
            }
        })
    }




}