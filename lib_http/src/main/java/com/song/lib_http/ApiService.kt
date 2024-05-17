package com.song.lib_http

import com.song.lib_http.data.BaseResultData
import com.song.lib_http.data.SimWordsData
import com.song.lib_http.utils.SIM_WORDS
import retrofit2.http.GET

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 13:44.
 * @Description :描述
 */
interface ApiService {
    /*** 舔狗日记*/
    @GET(SIM_WORDS)
    suspend fun getLiveList(): BaseResultData<List<SimWordsData>>
}