package com.song.mydemoappfrist.home.home.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.song.mydemoappfrist.R
import com.song.mydemoappfrist.databinding.LayoutFunctionBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 16:50.
 * @Description :描述
 */
class FunctionView(context: Context?, attrs: AttributeSet?) : RelativeLayout(context, attrs) {

    init {
        val bing = LayoutFunctionBinding.inflate(LayoutInflater.from(context))
        addView(bing.root)

    }
}