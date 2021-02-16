package com.felix.arch.mvvm

import android.os.Bundle
import com.felix.lib_arch.mvvm.BaseActivity

open class BaseMvvmActivity<VM : BaseViewModel> : BaseActivity(), BaseMvvmView<VM> {
    override lateinit var viewModel: VM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
    }
}