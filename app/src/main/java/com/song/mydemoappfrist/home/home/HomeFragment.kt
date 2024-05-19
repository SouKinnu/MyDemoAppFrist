package com.song.mydemoappfrist.home.home

import androidx.recyclerview.widget.LinearLayoutManager
import com.song.lib_base.BaseFragment
import com.song.mydemoappfrist.databinding.FragmentHomeBinding
import com.song.mydemoappfrist.home.home.adapter.BannerAdapter
import com.song.mydemoappfrist.home.home.adapter.OlyMedalsAdapter
import com.song.mydemoappfrist.home.home.customview.FunctionView
import com.song.mydemoappfrist.home.home.dialog.ContentDialog

class HomeFragment :
    BaseFragment<FragmentHomeBinding, HomeViewModel>(FragmentHomeBinding::inflate) {
    private val contentDialog: ContentDialog by lazy {
        ContentDialog(requireContext())
    }
    private val olyMedalsAdapter: OlyMedalsAdapter by lazy {
        OlyMedalsAdapter(requireContext())
    }

    override fun initView() {
        viewModel.apply {
            getBingImage()
            bingImageData.observe(this@HomeFragment) {
                binding.bingBanner.adapter = BannerAdapter(it, requireContext())
            }
            getOlyMedals()
            olyMedalsData.observe(this@HomeFragment) {
                olyMedalsAdapter.setListData(it.medalsList)
                binding.rankings.adapter = olyMedalsAdapter
                binding.rankings.layoutManager = LinearLayoutManager(context)
            }
        }
    }

    override fun initData() {

    }

    override fun initEvent() {
        binding.FunctionView.setOnClickListener { it ->
            when (it) {
                FunctionView.DOG -> viewModel.apply {
                    getSimWords()
                    simWordsData.observe(this@HomeFragment) {
                        showContentDialog(it.content.toString())
                    }
                }
            }
        }
    }

    private fun showContentDialog(content: String) {
        contentDialog.setContent(content)
        contentDialog.show()
    }
}