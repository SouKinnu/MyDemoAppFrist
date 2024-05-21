package com.song.lib_http

import com.song.lib_http.data.BaseResultData
import com.song.lib_http.data.BingImageData
import com.song.lib_http.data.OlyMedalsData
import com.song.lib_http.data.ContentData
import com.song.lib_http.data.MiYSheData
import com.song.lib_http.data.WeatherData
import com.song.lib_http.utils.BING_IMAGE
import com.song.lib_http.utils.MI_YOU_SHE_AVATAR
import com.song.lib_http.utils.OLY_MEDALS
import com.song.lib_http.utils.SIM_WORDS
import com.song.lib_http.utils.WEATHER
import retrofit2.http.GET
import retrofit2.http.POST
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
    suspend fun getSimWords(): BaseResultData<ContentData>

    /*** 必应每日一图*/
    @GET(BING_IMAGE)
    suspend fun getBingImage(): BaseResultData<List<BingImageData>>

    /*** 官方奥运会排行榜数据*/
    @POST(OLY_MEDALS)
    suspend fun getOlyMedals(): BaseResultData<OlyMedalsData>

    /*** 米游社随机头像*/
    @GET(MI_YOU_SHE_AVATAR)
    suspend fun getMiYouShe(): BaseResultData<List<MiYSheData>>

    /*** 自定义地区天气信息查询*/
    @GET(WEATHER)
    suspend fun getWeather(@Query("city_name") cityName: String): BaseResultData<WeatherData>
}