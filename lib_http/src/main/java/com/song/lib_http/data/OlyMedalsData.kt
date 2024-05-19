package com.song.lib_http.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OlyMedalsData(
    val medalsList: List<Medals>,
    val total: Int
) : Parcelable

@Parcelize
data class Medals(
    val bronze: String,
    val count: String,
    val countryid: String,
    val countryname: String,
    val gold: String,
    val rank: String,
    val silver: String
) : Parcelable
