package com.song.mydemoappfrist.home.home.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.song.mydemoappfrist.databinding.LayoutFunctionBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 16:50.
 * @Description :描述
 */
class FunctionView(context: Context?, attrs: AttributeSet?) : RelativeLayout(context, attrs),
    View.OnClickListener {
    companion object {
        const val DOG = "dog"
        const val FILM = "film"
        const val FIRE = "fire"
        const val TANG = "tang"
        const val AVATAR = "avatar"
    }

    private var binding: LayoutFunctionBinding =
        LayoutFunctionBinding.inflate(LayoutInflater.from(context))
    private var mOnClickListener: ((String) -> Unit)? = null
    fun setOnClickListener(listener: (String) -> Unit) {
        mOnClickListener = listener
    }

    init {
        addView(binding.root)
        binding.apply {
            dog.setOnClickListener(this@FunctionView)
            film.setOnClickListener(this@FunctionView)
            fire.setOnClickListener(this@FunctionView)
            tang.setOnClickListener(this@FunctionView)
            avatar.setOnClickListener(this@FunctionView)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.dog.id -> mOnClickListener?.invoke(DOG)
            binding.film.id -> mOnClickListener?.invoke(FILM)
            binding.fire.id -> mOnClickListener?.invoke(FIRE)
            binding.tang.id -> mOnClickListener?.invoke(TANG)
            binding.avatar.id -> mOnClickListener?.invoke(AVATAR)
        }
    }
}