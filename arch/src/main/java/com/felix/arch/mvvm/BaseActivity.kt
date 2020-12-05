package com.felix.arch.mvvm

import android.app.ProgressDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.felix.utils.utils.ITAG
import com.felix.utils.widget.dialog.IloadDialog

open class BaseActivity : AppCompatActivity(),
    IloadDialog,
    ITAG {
    override var ctx: Context? = null
        get() = this
    override var dialog: ProgressDialog? = null
    override fun onDestroy() {
        super.onDestroy()
        dismissLoading()
    }
}