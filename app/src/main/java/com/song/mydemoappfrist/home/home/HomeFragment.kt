package com.song.mydemoappfrist.home.home

import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.song.lib_base.BaseFragment
import com.song.mydemoappfrist.databinding.FragmentHomeBinding
import com.song.mydemoappfrist.home.home.adapter.BannerAdapter
import com.song.mydemoappfrist.home.home.adapter.OlyMedalsAdapter

class HomeFragment :
    BaseFragment<FragmentHomeBinding, HomeViewModel>(FragmentHomeBinding::inflate) {
    override fun initView() {
        viewModel.getBingImage()
        viewModel.bingImageData.observe(this@HomeFragment) {
            binding.bingBanner.adapter = BannerAdapter(it, requireContext())
        }
        viewModel.getOlyMedals()
        viewModel.olyMedalsData.observe(this@HomeFragment) {
            binding.rankings.adapter = OlyMedalsAdapter(it.medalsList, requireContext())
            binding.rankings.layoutManager=LinearLayoutManager(context)
        }

    }

    override fun initData() {

    }

    override fun initEvent() {

    }

}