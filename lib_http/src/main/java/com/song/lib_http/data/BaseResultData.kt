package com.song.lib_http.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 21:17.
 * @Description : 网络请求最外层视图
 */

/**
 * @param T             具体的实体
 * @property code       响应的状态
 * @property msg        响应的消息
 * @property result     响应的具体数据
 * @property error
 */
@Parcelize
open class BaseResultData<out T>(
    open val code: String? = null,
    open val msg: String? = null,
    open val result: @RawValue T? = null,
    open val error: Throwable? = null
) : Parcelable {
    val isSuccess: Boolean
        get() = code == "200" || code == "00000"
}

data class ApiSuccessResultData<T>(val response: T) : BaseResultData<T>(result = response)

data class ApiEmptyResultData<T>(
    override val code: String? = null,
    override val msg: String? = null,
) : BaseResultData<T>(
    code = code,
    msg = msg,
    result = null
)

data class ApiFailedResultData<T>(
    override val code: String?,
    override val msg: String?
) : BaseResultData<T>(code = code, msg = msg, result = null)

data class ApiErrorResultData<T>(val throwable: Throwable) : BaseResultData<T>(error = throwable)