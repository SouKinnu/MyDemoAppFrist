package com.song.lib_http.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/17 14:43.
 * @Description :描述
 */

@Parcelize
data class SimWordsData(val content: String? = null) : Parcelable