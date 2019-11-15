package com.github.leondevlifelog.business.splash.idlingresource

import androidx.test.espresso.IdlingResource
import java.util.concurrent.atomic.AtomicBoolean

class SimpleIdlingResource : IdlingResource {
    private var callback: IdlingResource.ResourceCallback? = null
    private val misIdleNow: AtomicBoolean = AtomicBoolean(false)
    override fun getName(): String {
        return this.javaClass.name
    }

    override fun isIdleNow(): Boolean {
        return misIdleNow.get()
    }

    override fun registerIdleTransitionCallback(callback: IdlingResource.ResourceCallback?) {
        this.callback = callback
    }

    fun setIdleState(isIdleNow: Boolean) {
        misIdleNow.set(isIdleNow)
        if (isIdleNow && callback != null) {
            callback?.onTransitionToIdle()
        }
    }
}