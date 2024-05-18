package com.song.mydemoappfrist

import androidx.lifecycle.MutableLiveData
import com.song.lib_base.BaseViewModel
import com.song.lib_http.data.SimWordsData
import com.song.lib_http.utils.ApiRepository
import com.song.lib_http.utils.launchRequest

/**
 * @Author : SongJin yu
 * @Email : kinnusou@gmail.com
 * @Date : on 2024/5/16 14:38.
 * @Description :描述
 */
class MainViewModel : BaseViewModel() {
    private val mApiRepository: ApiRepository by lazy {
        ApiRepository()
    }
    val simWordsDataStateFlow = MutableLiveData(emptyList<SimWordsData>())
    fun getSimWords() {
        launchRequest(
            {
                mApiRepository.getSimWords()
            }, {
                if (it != null) {
                    simWordsDataStateFlow.value = it
                }
            }
        )
    }
}