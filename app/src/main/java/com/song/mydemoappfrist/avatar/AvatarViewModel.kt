package com.song.mydemoappfrist.avatar

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import com.song.lib_base.BaseViewModel
import com.song.lib_http.data.MiYSheData
import com.song.lib_http.data.TypeData
import com.song.lib_http.utils.ApiRepository
import com.song.lib_http.utils.launchRequest

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/20 13:32.
 * @Description :描述
 */
class AvatarViewModel : BaseViewModel() {
    private val apiRepository: ApiRepository by lazy {
        ApiRepository()
    }
    val miYouSheData = MutableLiveData<List<MiYSheData>>()

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        getMiYouShe()
    }

    private fun getMiYouShe() {
        launchRequest({ apiRepository.getMiYouShe() }, {
            if (it != null) {
                miYouSheData.value = it
            }
        })
    }
}