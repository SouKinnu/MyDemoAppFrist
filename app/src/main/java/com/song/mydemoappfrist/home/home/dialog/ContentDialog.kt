package com.song.mydemoappfrist.home.home.dialog

import android.content.Context
import android.view.View
import com.song.lib_base.BaseDialog
import com.song.mydemoappfrist.databinding.DialogContentBinding

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 22:19.
 * @Description :描述
 */
class ContentDialog(context: Context) :
    BaseDialog<DialogContentBinding>(context, inflate = DialogContentBinding::inflate),
    View.OnClickListener {
    init {
        binding.dialogOk.setOnClickListener(this@ContentDialog)
    }

    fun setContent(content: String) {
        binding.dialogContent.text = content
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.dialogOk.id -> dismiss()
        }
    }
}