package com.song.lib_base

import android.app.Dialog
import android.content.Context
import android.graphics.Point
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.WindowManager
import androidx.viewbinding.ViewBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 22:11.
 * @Description :描述
 */
open class BaseDialog<VB : ViewBinding>(
    context: Context,
    themeResId: Int = R.style.BaseDialog,
    inflate: (LayoutInflater) -> VB,
    private val canceledOnTouchOutside: Boolean = false,
    private val gravity: Int = Gravity.CENTER
) : Dialog(context, themeResId) {
    var binding: VB = inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val layoutParams = window!!.attributes
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.gravity = gravity
        window!!.attributes = layoutParams
        setCanceledOnTouchOutside(canceledOnTouchOutside)
    }
}