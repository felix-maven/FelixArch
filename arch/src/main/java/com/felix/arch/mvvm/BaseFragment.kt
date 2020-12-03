package com.felix.lib_arch.mvvm

import android.app.ProgressDialog
import android.content.Context
import androidx.fragment.app.Fragment
import com.felix.felixutils.utils.ITAG
import com.felix.felixutils.widget.dialog.IloadDialog

open class BaseFragment : Fragment(), IloadDialog,
    ITAG {
    override var ctx: Context? = null
        get() = context
    override var dialog: ProgressDialog? = null
    override fun onDestroyView() {
        super.onDestroyView()
        dismissLoading()
    }
}