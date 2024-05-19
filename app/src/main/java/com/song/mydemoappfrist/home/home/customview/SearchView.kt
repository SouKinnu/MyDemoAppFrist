package com.song.mydemoappfrist.home.home.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.song.mydemoappfrist.databinding.LayoutSearchBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 17:35.
 * @Description :描述
 */
class SearchView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    init {
        val bing = LayoutSearchBinding.inflate(LayoutInflater.from(context))
        addView(bing.root)
    }
}