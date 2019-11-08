package com.github.leondevlifelog.business.login

import android.os.Build
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.leondevlifelog.core.CoreApp
import com.github.leondevlifelog.router.splash.ISplashService
import com.github.leondevlifelog.service.ISplashServiceDefaultImpl
import com.sankuai.waimai.router.service.ServiceLoader
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog
import org.robolectric.shadows.ShadowToast

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.P], application = CoreApp::class)
class LoginActivityTest {
    @Before
    fun setup(): Unit {
        ShadowLog.stream = System.out
        ServiceLoader.put(
            ISplashService::class.java,
            "default",
            ISplashServiceDefaultImpl::class.java,
            true
        )
    }

    @Test
    fun test(): Unit {
        var launch = ActivityScenario.launch(LoginActivity::class.java)
        launch.onActivity {
            assertEquals("test", ShadowToast.getTextOfLatestToast())
        }
        assertEquals(true, true)
    }
}