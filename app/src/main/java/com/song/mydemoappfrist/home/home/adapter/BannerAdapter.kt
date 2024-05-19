package com.song.mydemoappfrist.home.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.song.lib_http.data.BingImageData
import com.song.mydemoappfrist.R

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 13:06.
 * @Description :描述
 */
class BannerAdapter(private val mImageList: List<BingImageData>, private val context: Context) :
    RecyclerView.Adapter<BannerAdapter.VH>() {
    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mBannerItem: AppCompatImageView = itemView.findViewById(R.id.banner_item)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VH {
        return VH(
            LayoutInflater.from(context).inflate(
                R.layout.item_banner,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        Glide.with(context).load(mImageList[position].url).into(holder.mBannerItem)
    }

    override fun getItemCount(): Int {
        return mImageList.count()
    }

}