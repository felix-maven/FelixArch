package com.felix.lib_arch.mvvm

import android.app.ProgressDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.felix.utils.utils.ITAG
import com.felix.utils.widget.dialog.ILoadDialog

open class BaseActivity : AppCompatActivity(),
    ILoadDialog,
    ITAG {
    override var ctx: Context? = null
        get() = this
    override var dialog: ProgressDialog? = null
    override fun onDestroy() {
        super.onDestroy()
        dismissLoading()
    }
}