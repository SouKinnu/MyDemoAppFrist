package com.song.lib_http.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class WeatherData(
    val alert: @RawValue Any,
    val aqi: Int,
    val city_name: String,
    val current_condition: String,
    val current_temperature: Int,
    val current_time: Int,
    val dat_condition: String,
    val dat_high_temperature: Int,
    val dat_low_temperature: Int,
    val dat_weather_icon_id: String,
    val day_condition: String,
    val download_icon: Int,
    val forecast_list: List<Forecast>,
    val high_temperature: Int,
    val hourly_forecast: List<HourlyForecast>,
    val low_temperature: Int,
    val moji_city_id: Int,
    val night_condition: String,
    val origin_data: @RawValue List<Any>,
    val quality_level: String,
    val tips: String,
    val tomorrow_aqi: Int,
    val tomorrow_condition: String,
    val tomorrow_high_temperature: Int,
    val tomorrow_low_temperature: Int,
    val tomorrow_quality_level: String,
    val tomorrow_weather_icon_id: String,
    val update_time: String,
    val weather_icon_id: String,
    val wind_direction: String,
    val wind_level: Int
) : Parcelable

@Parcelize
data class HourlyForecast(
    val condition: String,
    val hour: String,
    val temperature: String,
    val weather_icon_id: String,
    val wind_direction: String,
    val wind_level: String
) : Parcelable

@Parcelize
data class Forecast(
    val condition: String,
    val date: String,
    val high_temperature: String,
    val low_temperature: String,
    val weather_icon_id: String,
    val wind_direction: String,
    val wind_level: String
) : Parcelable