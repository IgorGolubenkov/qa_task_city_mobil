/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task

import SettingPage
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.Page
import com.google.samples.apps.iosched.ui.MainActivity
import io.qameta.allure.android.step
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ScreenRotationTest {

    @Rule
    @JvmField val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun screenRotationValidTest() {
        step("Позитивный тест смены ориентации экрана") {
            Page.on<NavigationMenuPage>()
                .settings()
                .on<SettingPage>()
                .checkCurrentPage()
                .rotationScreen(activityRule)
                .rotationScreen(activityRule)
        }
    }
}