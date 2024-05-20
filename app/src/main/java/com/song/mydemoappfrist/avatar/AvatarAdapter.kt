package com.song.mydemoappfrist.avatar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.song.lib_http.data.Avatar
import com.song.lib_http.data.TypeData
import com.song.mydemoappfrist.databinding.ItemAvatarContentBinding
import com.song.mydemoappfrist.databinding.ItemAvatarTitleBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/20 17:53.
 * @Description :描述
 */
class AvatarAdapter(val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val TYPE_TITLE = "title"
        const val TYPE_CONTENT = "content"
        const val TYPE_TITLE_NUM = 1
        const val TYPE_CONTENT_NUM = 2
    }

    private lateinit var list: ArrayList<TypeData>

    fun getAvatarList(avatarList: ArrayList<TypeData>) {
        list = avatarList
    }

    class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleBinding = ItemAvatarTitleBinding.bind(itemView)
    }

    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentBinding = ItemAvatarContentBinding.bind(itemView)
    }

    override fun getItemViewType(position: Int): Int {
        when (list[position].type) {
            TYPE_TITLE -> return TYPE_TITLE_NUM
            TYPE_CONTENT -> return TYPE_CONTENT_NUM
        }
        return TYPE_TITLE_NUM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val titleBinding =
            ItemAvatarTitleBinding.inflate(LayoutInflater.from(context), parent, false)
        val contentBinding =
            ItemAvatarContentBinding.inflate(LayoutInflater.from(context), parent, false)
        when (viewType) {
            TYPE_TITLE_NUM -> return TitleViewHolder(titleBinding.root)
            TYPE_CONTENT_NUM -> return ContentViewHolder(contentBinding.root)
        }
        return TitleViewHolder(titleBinding.root)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val data = list[position].data
        if (holder is TitleViewHolder && data is String)
            holder.titleBinding.root.text = data
        else if (holder is ContentViewHolder && data is Avatar)
            holder.contentBinding.apply {
                Glide.with(context).load(data.icon).into(icon)
                name.text = data.name
            }
    }


    override fun getItemCount(): Int {
        return list.size
    }
}