package com.song.mydemoappfrist.home.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.song.lib_http.data.Medals
import com.song.mydemoappfrist.databinding.ItemOlymedalsListBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 18:28.
 * @Description :描述
 */
class OlyMedalsAdapter(private val context: Context) :
    RecyclerView.Adapter<OlyMedalsAdapter.VH>() {
    private lateinit var list: List<Medals>
    fun setListData(olyMedalsList: List<Medals>) {
        list = olyMedalsList
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemOlymedalsListBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            ItemOlymedalsListBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            ).root
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.apply {
            goldMedalNum.text = list[position].gold
            silverMedalNum.text = list[position].silver
            brassMedalNum.text = list[position].bronze
            rank.text = list[position].rank
            countryid.text = list[position].countryid
            countryname.text = list[position].countryname
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}