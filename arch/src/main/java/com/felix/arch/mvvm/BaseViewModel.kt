package com.felix.arch.mvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import com.felix.utils.utils.ITAG
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

open class BaseViewModel : ViewModel(), LifecycleObserver, ITAG {
    val scope = MainScope()

    @OnLifecycleEvent(value = Lifecycle.Event.ON_DESTROY)
    fun destory() {
        scope.cancel()
    }
}