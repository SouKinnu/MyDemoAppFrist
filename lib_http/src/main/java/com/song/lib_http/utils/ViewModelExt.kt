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
 * @param isLoading
 * @param block
 * @param success
 * @param failed
 * @param error
 */
fun <T> BaseViewModel.launchRequest(
    isLoading: Boolean = false,
    block: suspend () -> BaseResultData<T>,
    success: suspend (T?) -> Unit,
    failed: suspend (errorCode: String?, errorMsg: String?) -> Unit = { _, _ -> },
    error: suspend (throwable: Throwable) -> Unit
) {
    launchUi {
        //  if (isLoading) loadState.setEvent(LoadState.Start())

        val resultData = withContext(Dispatchers.IO) {
            block()
        }
        Log.e("resultData", "请求结果 $resultData")
        resultData.parseData {
            onSuccess = {
                launchUi {
                    success.invoke(it)
                }
            }
            onFailed = { errorCode, errorMsg ->
                launchUi {
                    failed.invoke(errorCode, errorMsg)
                    //loadState.setEvent(LoadState.Error(errorCode.orEmpty(), errorMsg.orEmpty()))
                }
            }
            onError = {
                launchUi {
                    error.invoke(it)
                    //  loadState.setEvent(LoadState.Error("", it.message.orEmpty()))
                }
            }
        }
    }
}