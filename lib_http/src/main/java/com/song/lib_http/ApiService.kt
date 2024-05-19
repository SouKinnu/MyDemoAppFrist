package com.song.lib_http

import com.song.lib_http.data.BaseResultData
import com.song.lib_http.data.BingImageData
import com.song.lib_http.data.OlyMedalsData
import com.song.lib_http.data.SimWordsData
import com.song.lib_http.utils.BING_IMAGE
import com.song.lib_http.utils.OLY_MEDALS
import com.song.lib_http.utils.SIM_WORDS
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 13:44.
 * @Description :描述
 */
interface ApiService {
    /*** 舔狗日记*/
    @GET(SIM_WORDS)
    suspend fun getSimWords(): BaseResultData<SimWordsData>

    /*** 必应每日一图*/
    @GET(BING_IMAGE)
    suspend fun getBingImage(): BaseResultData<List<BingImageData>>

    /*** 官方奥运会排行榜数据*/
    @POST(OLY_MEDALS)
    suspend fun getOlyMedals(): BaseResultData<OlyMedalsData>
}