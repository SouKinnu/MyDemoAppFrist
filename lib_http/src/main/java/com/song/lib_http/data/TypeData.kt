package com.song.lib_http.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/20 13:53.
 * @Description :描述
 */
@Parcelize
data class TypeData(val type: String, val data: @RawValue Any) : Parcelable