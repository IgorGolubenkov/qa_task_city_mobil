/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.AgendaPage
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.Page
import com.google.samples.apps.iosched.ui.MainActivity
import io.qameta.allure.android.step
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

private const val TITLE = "Google Keynote"
private const val COUNT = 3

@RunWith(AndroidJUnit4::class)
class AgendaChildTest {

    @Rule
    @JvmField val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun childPositionValidTest() {
        step("Позитивный тест проверки позиции дочерних элементов в списке") {
            Page.on<NavigationMenuPage>()
                .agenda()
                .on<AgendaPage>()
                .checkCurrentPage()
                .checkPositionChildItem(TITLE, COUNT)
        }
    }
}