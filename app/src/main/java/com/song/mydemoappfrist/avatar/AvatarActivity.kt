package com.song.mydemoappfrist.avatar

import androidx.recyclerview.widget.GridLayoutManager
import com.song.lib_base.BaseActivity
import com.song.lib_http.data.MiYSheData
import com.song.lib_http.data.TypeData
import com.song.mydemoappfrist.databinding.ActivityAvatarBinding

class AvatarActivity :
    BaseActivity<ActivityAvatarBinding, AvatarViewModel>(ActivityAvatarBinding::inflate) {
    private val miYouSheDataList: ArrayList<TypeData> by lazy {
        ArrayList()
    }
    private val gridLayoutManager: GridLayoutManager by lazy {
        GridLayoutManager(this@AvatarActivity, 4)
    }

    override fun initView() {
        viewModel.miYouSheData.observe(this@AvatarActivity) {
            getMiYouSheDataList(it)
            val avatarAdapter = AvatarAdapter(this@AvatarActivity)
            avatarAdapter.getAvatarList(miYouSheDataList)
            binding.root.adapter = avatarAdapter
        }
    }

    private fun getMiYouSheDataList(miYouShe: List<MiYSheData>) {
        miYouSheDataList.clear()
        miYouShe.forEach { it ->
            miYouSheDataList.add(TypeData(AvatarAdapter.TYPE_TITLE, it.name))
            it.list.forEach {
                miYouSheDataList.add(TypeData(AvatarAdapter.TYPE_CONTENT, it))
            }
        }
    }

    override fun initData() {
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                when (miYouSheDataList[position].type) {
                    AvatarAdapter.TYPE_TITLE -> return 4
                    AvatarAdapter.TYPE_CONTENT -> return 1
                }
                return 0
            }
        }
        binding.root.layoutManager = gridLayoutManager
    }

    override fun initEvent() {

    }
}