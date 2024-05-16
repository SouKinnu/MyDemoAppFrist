package com.song.lib_base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType

/**
 * @Author      : SongJin yu
 * @Email       : kinnusou@gmail.com
 * @Date        : on 2024/5/16 14:39.
 * @Description :描述
 */
abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB
) : Fragment(), InitListener {

    private var _binding: VB? = null
    val binding: VB get() = _binding!!
    protected lateinit var viewModel: VM
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this)[getViewModelClass()]
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(viewModel)
        initView()
        initData()
        initEvent()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @Keep
    private fun getViewModelClass(): Class<VM> {
        return ((javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1]) as Class<VM>
    }
}
