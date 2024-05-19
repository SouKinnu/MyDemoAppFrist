package com.song.lib_http.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BingImageData(
    val copyright: String,
    val copyrightlink: String,
    val title: String,
    val url: String
) : Parcelable