package com.felix.arch.mvvm

import android.app.ProgressDialog
import android.content.Context
import androidx.fragment.app.Fragment
import com.felix.utils.utils.ITAG
import com.felix.utils.widget.dialog.IloadDialog

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