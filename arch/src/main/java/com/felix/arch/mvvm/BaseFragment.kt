package com.felix.lib_arch.mvvm

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import androidx.fragment.app.Fragment
import com.felix.utils.utils.ITAG
import com.felix.utils.widget.dialog.IInfoDialog
import com.felix.utils.widget.dialog.ILoadDialog

open class BaseFragment : Fragment(), ILoadDialog, IInfoDialog,
    ITAG {
    override var ctx: Context? = null
        get() = context
    override var progressDialog: ProgressDialog? = null
    override var infoDialog: AlertDialog? = null
    override fun onDestroyView() {
        super.onDestroyView()
        dismissLoading()
        dismissInfo()
    }
}