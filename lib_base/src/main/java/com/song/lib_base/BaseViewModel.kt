package com.song.lib_base

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

/**
 * @Author : SongJin yu
 * @Email : kinnusou@gmail.com
 * @Date : on 2024/5/16 14:38.
 * @Description :描述
 */
open class BaseViewModel : ViewModel(), DefaultLifecycleObserver, CoroutineScope {
    private val mJob = SupervisorJob()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + mJob

    /**
     * 切换 Ui 线程
     * @param T
     * @param block
     */
    fun <T> launchUi(block: suspend () -> T) {
        viewModelScope.launch(Dispatchers.Main) {
            runCatching {
                block()
            }.onFailure {
                it.printStackTrace()
            }
        }
    }

    /**
     * 切换 Io 线程
     * @param T
     * @param block
     */
    fun <T> launchIo(block: suspend () -> T) {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                block()
            }.onFailure {
                it.printStackTrace()
            }
        }
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.e("BaseViewModel", "onCreate:")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.e("BaseViewModel", "onStart:")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.e("BaseViewModel", "onResume:")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.e("BaseViewModel", "onPause:")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.e("BaseViewModel", "onStop:")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.e("BaseViewModel", "onDestroy:")
    }

    override fun onCleared() {
        super.onCleared()
        mJob.cancel()
    }
}
