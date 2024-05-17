package com.song.lib_http

import com.song.lib_http.data.SimWordsData
import retrofit2.http.GET
import retrofit2.http.Query

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