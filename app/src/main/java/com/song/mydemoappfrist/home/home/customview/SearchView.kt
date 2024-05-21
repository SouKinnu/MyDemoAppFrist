package com.song.mydemoappfrist.home.home.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.song.mydemoappfrist.databinding.LayoutSearchBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 17:35.
 * @Description :描述
 */
class SearchView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs),
    View.OnClickListener {

    private val binding = LayoutSearchBinding.inflate(LayoutInflater.from(context))
    private var mOnClickListener: ((String) -> Unit)? = null
    fun setOnClickListener(listener: (String) -> Unit) {
        mOnClickListener = listener
    }

    init {
        binding.apply {
            addView(root)
            search.setOnClickListener(this@SearchView)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.search.id -> if (binding.inputContent.text.toString().isNotEmpty()) {
                mOnClickListener?.invoke(binding.inputContent.text.toString().trim())
            }
        }
    }
}