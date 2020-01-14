/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.AgendaPage
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.HomePage
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.Page
import com.google.samples.apps.iosched.ui.MainActivity
import io.qameta.allure.android.step
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @Rule
    @JvmField val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test fun navigationValidTest() {
        step("Позитивный тест навигации в приложении") {
            Page.on<NavigationMenuPage>()
                .agenda()
                .on<AgendaPage>()
                .checkCurrentPage()
                .on<NavigationMenuPage>()
                .home()
                .on<HomePage>()
                .checkCurrentPage()
        }
    }
}