package com.song.mydemoappfrist.home.home

import androidx.lifecycle.MutableLiveData
import com.song.lib_base.BaseViewModel
import com.song.lib_http.data.BingImageData
import com.song.lib_http.data.ContentData
import com.song.lib_http.data.OlyMedalsData
import com.song.lib_http.utils.ApiRepository
import com.song.lib_http.utils.launchRequest

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/18 21:49.
 * @Description :描述
 */
class HomeViewModel : BaseViewModel() {
    val bingImageData = MutableLiveData<List<BingImageData>>()
    val olyMedalsData = MutableLiveData<OlyMedalsData>()
    val simWordsData = MutableLiveData<ContentData>()
    private val apiRepository: ApiRepository by lazy {
        ApiRepository()
    }

    fun getBingImage() {
        launchRequest({
            apiRepository.getBingImage()
        }, {
            if (it != null) {
                bingImageData.value = it
            }
        })
    }

    fun getOlyMedals() {
        launchRequest({
            apiRepository.getOlyMedals()
        }, {
            if (it != null) {
                olyMedalsData.value = it
            }
        })
    }

    fun getSimWords() {
        launchRequest(
            {
                apiRepository.getSimWords()
            }, {
                if (it != null) {
                    simWordsData.value = it
                }
            }
        )
    }
}