package com.song.lib_http.utils

import com.song.lib_http.ApiService
import com.song.lib_http.HttpClient
import com.song.lib_http.data.BaseResultData
import com.song.lib_http.data.SimWordsData

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/18 13:46.
 * @Description :描述
 */
class ApiRepository {
    private val mApiService: ApiService by lazy {
        HttpClient.getApiService
    }

    suspend fun getSimWords(
    ): BaseResultData<SimWordsData> {
        return mApiService.getSimWords()
    }
}