package com.github.leondevlifelog.business.splash

import android.os.Build
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.IdlingResource
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.leondevlifelog.core.CoreApp
import com.github.leondevlifelog.router.login.ILoginService
import com.github.leondevlifelog.service.ILoginServiceDefaultImpl
import com.sankuai.waimai.router.service.ServiceLoader
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog
import org.robolectric.shadows.ShadowToast


@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.P], application = CoreApp::class)
class SplashActivityTest {
    private var mIdlingResource: IdlingResource? = null
    @Before
    fun setup(): Unit {
        ServiceLoader.put(
            ILoginService::class.java,
            "default",
            ILoginServiceDefaultImpl::class.java,
            true
        )
        ShadowLog.stream = System.out
        val launch = ActivityScenario.launch(SplashActivity::class.java)
        launch.onActivity {
            mIdlingResource = it.simpleIdlingResource
            IdlingRegistry.getInstance().register(mIdlingResource)
        }
    }

    @Test
    fun `测试同步调用和耗时异步调用`() {
        assertEquals("这是mock，出现说明可以跳到登录页面", ShadowToast.getTextOfLatestToast())
        mIdlingResource?.registerIdleTransitionCallback {
            assertEquals("这是默认实现的异步结果", ShadowToast.getTextOfLatestToast())
        }
    }

    @After
    fun reset() {
        IdlingRegistry.getInstance().unregister(mIdlingResource)
    }
}