package com.song.mydemoappfrist.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.song.lib_base.BaseViewModel
import com.song.lib_http.HttpClient
import com.song.lib_http.data.WeatherData
import com.song.lib_http.utils.launchRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/21 15:59.
 * @Description :描述
 */
class WeatherViewModel : BaseViewModel() {
    val weatherData = MutableLiveData<WeatherData?>()
    fun getWeather(cityName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = HttpClient.getApiService.getWeather(cityName)
                withContext(Dispatchers.Main) {
                    weatherData.value = data.result
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}