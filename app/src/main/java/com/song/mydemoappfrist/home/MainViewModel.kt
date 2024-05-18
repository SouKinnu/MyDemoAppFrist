package com.song.mydemoappfrist.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.song.lib_base.BaseViewModel
import com.song.lib_http.HttpClient
import com.song.lib_http.data.SimWordsData
import com.song.lib_http.utils.ApiRepository
import com.song.lib_http.utils.launchRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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
    val simWordsDataStateFlow = MutableLiveData(SimWordsData())
    fun getSimWords() {
        /*viewModelScope.launch(Dispatchers.IO) {
            try {
                val simWords = HttpClient.getApiService.getSimWords()
                withContext(Dispatchers.Main) {
                    simWordsDataStateFlow.value = simWords.result?.get(0)
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }*/
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