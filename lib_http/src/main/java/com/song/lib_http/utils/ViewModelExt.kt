package com.song.lib_http.utils

import android.util.Log
import com.song.lib_base.BaseViewModel
import com.song.lib_http.data.BaseResultData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 16:06.
 * @Description : 封装的网络请求
 */

/**
 * @param T
 * @param block
 * @param success
 */
fun <T> BaseViewModel.launchRequest(
    block: suspend () -> BaseResultData<T>,
    success: suspend (T?) -> Unit,
) {
    launchUi {
        val resultData = withContext(Dispatchers.IO) {
            block()
        }
        Log.e("resultData", "请求结果 $resultData")
        success.invoke(resultData.result)
    }
}