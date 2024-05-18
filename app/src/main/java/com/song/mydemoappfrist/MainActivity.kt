package com.song.mydemoappfrist

import com.song.lib_base.BaseActivity
import com.song.mydemoappfrist.databinding.ActivityMainBinding

/**
 * @Author : SongJin yu
 * @Email : kinnusou@gmail.com
 * @Date : on 2024/5/16 14:38.
 * @Description :描述
 */
class MainActivity :
    BaseActivity<ActivityMainBinding, MainViewModel>(ActivityMainBinding::inflate) {
    override fun initView() {
        viewModel.getSimWords()
        viewModel.simWordsDataStateFlow.observe(this) {
            binding.aaa.text=it.toString()
        }
    }

    override fun initData() {

    }

    override fun initEvent() {

    }

}