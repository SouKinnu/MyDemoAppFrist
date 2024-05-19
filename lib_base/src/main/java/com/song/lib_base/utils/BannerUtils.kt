package com.song.lib_base.utils

import android.view.View
import androidx.viewpager2.widget.ViewPager2

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/19 12:48.
 * @Description :描述
 */
class BannerUtils : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        if (position < 0f) {
            page.pivotX = page.width.toFloat()
            page.scaleX = 1f + position * 0.5f
        } else if (position < 1f) {
            page.pivotX = 0f
            page.scaleX = 1f - position * 0.5f
        }

    }


}
