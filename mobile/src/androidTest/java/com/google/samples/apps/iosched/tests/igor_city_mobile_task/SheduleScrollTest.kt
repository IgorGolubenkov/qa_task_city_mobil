/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.uiautomator.Page
import io.qameta.allure.android.step
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

private const val TITLE_CUSTOM_SHEDULE = "Teaching a Car to Drive Itself by Imitation and Imagination"

@RunWith(AndroidJUnit4::class)
class SheduleScrollTest {

    lateinit var page: Page

    @Before fun setUp() {
        page = Page()
    }

    @Test fun test01() {
        step("Позитивный тест скрола списка расписания событий") {
            with(page) {
                openMenu()
                scheduler()
                notifications(true)
                goItCustomSchedule()
                scrollToContains()
                openItemShedule(TITLE_CUSTOM_SHEDULE)
                checkIsOpenItem(TITLE_CUSTOM_SHEDULE)
            }
        }
    }
}