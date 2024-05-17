package com.song.lib_http.utils

import kotlinx.coroutines.flow.MutableSharedFlow

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 13:48.
 * @Description :描述
 */
typealias SharedFlowEvents<T> = MutableSharedFlow<List<T>>
fun <T> SharedFlowEvents(): SharedFlowEvents<T> {
    return MutableSharedFlow()
}

const val API_STATUS_OK = "0000"
const val TIME_OUT = 30L
const val BASE_URL = "https://api.oioweb.cn/"

/*** 舔狗日记 api*/
const val SIM_WORDS = "/api/SimpWords"