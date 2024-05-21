package com.song.mydemoappfrist.weather

import androidx.recyclerview.widget.LinearLayoutManager
import com.song.lib_base.BaseActivity
import com.song.mydemoappfrist.databinding.ActivityWeatherBinding


class WeatherActivity :
    BaseActivity<ActivityWeatherBinding, WeatherViewModel>(ActivityWeatherBinding::inflate) {
    private lateinit var cityName: String
    val weatherAdapter: WeatherAdapter by lazy {
        WeatherAdapter(this@WeatherActivity)
    }

    override fun initView() {
        cityName = intent.getStringExtra("cityName").toString()
        viewModel.apply {
            getWeather(cityName)
            weatherData.observe(this@WeatherActivity) {
                binding.apply {
                    if (it != null) {
                        cityName.text = it.city_name
                        currentCondition.text = it.current_condition
                        datCondition.text = it.dat_condition
                        weatherAdapter.getList(it.forecast_list)
                        weatherList.adapter = weatherAdapter
                    }
                }
            }
        }
    }

    override fun initData() {
        binding.weatherList.layoutManager = LinearLayoutManager(this@WeatherActivity)
    }

    override fun initEvent() {

    }

}