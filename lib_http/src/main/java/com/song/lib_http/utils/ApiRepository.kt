package com.song.lib_http.utils

import com.song.lib_http.ApiService
import com.song.lib_http.HttpClient
import com.song.lib_http.data.BaseResultData
import com.song.lib_http.data.BingImageData
import com.song.lib_http.data.OlyMedalsData
import com.song.lib_http.data.ContentData
import com.song.lib_http.data.MiYSheData

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

    /*** 舔狗日记*/
    suspend fun getSimWords(
    ): BaseResultData<ContentData> {
        return mApiService.getSimWords()
    }

    /*** 必应每日一图*/
    suspend fun getBingImage(
    ): BaseResultData<List<BingImageData>> {
        return mApiService.getBingImage()
    }

    /*** 官方奥运会排行榜数据*/
    suspend fun getOlyMedals(
    ): BaseResultData<OlyMedalsData> {
        return mApiService.getOlyMedals()
    }

    /*** /*** 米游社随机头像*/*/
    suspend fun getMiYouShe(
    ): BaseResultData<List<MiYSheData>> {
        return mApiService.getMiYouShe()
    }
}