package com.song.mydemoappfrist.weather

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.song.lib_http.data.Forecast
import com.song.mydemoappfrist.databinding.ItemWeatherBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/21 20:13.
 * @Description :描述
 */
class WeatherAdapter(val context: Context) : RecyclerView.Adapter<WeatherAdapter.VH>() {
    private lateinit var list: List<Forecast>
    fun getList(forecast: List<Forecast>) {
        list = forecast
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemWeatherBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemWeatherBinding.inflate(LayoutInflater.from(context), parent, false).root)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.apply {
            date.text = list[position].date
            windDirection.text = list[position].wind_direction
            condition.text = list[position].condition
        }
    }
}