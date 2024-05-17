package com.song.lib_http

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue


/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 13:48.
 * @Description :描述
 */

@Parcelize
data class BaseResultData<T>(val result: @RawValue T?, val message: String, val status: String):
    Parcelable



const val API_STATUS_OK = "0000"
const val BASE_URL = "https://api.oioweb.cn/"

/*** 舔狗日记 api*/
const val SIM_WORDS = "/api/SimpWords"