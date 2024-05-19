package com.song.mydemoappfrist.home.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.song.lib_http.data.Medals
import com.song.mydemoappfrist.R

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
        val goldMedalNum: AppCompatTextView = itemView.findViewById(R.id.gold_medal_num)
        val silverMedalNum: AppCompatTextView = itemView.findViewById(R.id.silver_medal_num)
        val brassMedalNum: AppCompatTextView = itemView.findViewById(R.id.brass_medal_num)
        val rank: AppCompatTextView = itemView.findViewById(R.id.rank)
        val countryId: AppCompatTextView = itemView.findViewById(R.id.countryid)
        val countryName: AppCompatTextView = itemView.findViewById(R.id.countryname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(context).inflate(R.layout.item_olymedals_list, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.apply {
            goldMedalNum.text = list[position].gold
            silverMedalNum.text = list[position].silver
            brassMedalNum.text = list[position].bronze
            rank.text = list[position].rank
            countryId.text = list[position].countryid
            countryName.text = list[position].countryname
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}