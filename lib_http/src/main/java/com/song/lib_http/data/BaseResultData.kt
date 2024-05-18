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
 */
@Parcelize
open class BaseResultData<out T>(
    val code: Int? = null,
    val msg: String? = null,
    val result: @RawValue T? = null,
) : Parcelable