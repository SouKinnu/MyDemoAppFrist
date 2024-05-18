package com.song.lib_http.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.song.lib_http.data.ApiEmptyResultData
import com.song.lib_http.data.ApiErrorResultData
import com.song.lib_http.data.ApiFailedResultData
import com.song.lib_http.data.ApiSuccessResultData
import com.song.lib_http.data.BaseResultData


/**
 * Author: BenChen
 * Date: 2023/05/24 15:58
 * Email:chenxiaobin@cloudhearing.cn
 */

fun <T> BaseResultData<T>.parseData(listenerBuilder: ResultBuilder<T>.() -> Unit) {
    val listener = ResultBuilder<T>().also(listenerBuilder)
    when (this) {
        is ApiSuccessResultData -> listener.onSuccess(this.response)
        is ApiEmptyResultData -> listener.onSuccess(null)
        is ApiFailedResultData -> listener.onFailed(this.code, this.msg)
        is ApiErrorResultData -> listener.onError(this.throwable)
    }
    listener.onComplete()
}