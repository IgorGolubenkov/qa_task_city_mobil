/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.uiautomator

import android.content.Context
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage.Companion.SHEDULE_TITLE
import io.qameta.allure.android.step
import org.hamcrest.core.Is.`is`
import org.hamcrest.core.IsNull.notNullValue

private const val BASIC_SAMPLE_PACKAGE = "com.google.samples.apps.iosched"
private const val LAUNCH_TIMEOUT = 5000L
private const val STRING_TO_BE_TYPED = "UiAutomator"

class Page {
    val LOG_TAG = Page::class.java.simpleName

    val device: UiDevice
    val launcherPackage: String

    init {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressHome()

        launcherPackage = device.launcherPackageName
        assertThat(launcherPackage, notNullValue())
        device.wait(
            Until.hasObject(By.pkg(launcherPackage).depth(0)),
            LAUNCH_TIMEOUT)

        val context = ApplicationProvider.getApplicationContext<Context>()
        val intent =
            context.packageManager
                .getLaunchIntentForPackage(BASIC_SAMPLE_PACKAGE)
                .apply {
                    this?.addFlags(FLAG_ACTIVITY_CLEAR_TASK)
                }
        context.startActivity(intent)

        device.wait(
            Until.hasObject(By.pkg(BASIC_SAMPLE_PACKAGE).depth(0)),
            LAUNCH_TIMEOUT)
    }

    fun implClick(uiobject: UiObject) {
        step("Реализация клика по элементу если елемент найден и виден") {
            if (uiobject.exists() && uiobject.isEnabled) {
                uiobject.click()
            } else {
                Log.e(LOG_TAG, "Element not exists or disable")
            }
        }
    }

    fun openMenu() {
        step("Открываем меню навигации") {
            implClick(device.findObject(
                UiSelector().descriptionContains("Open navigation drawer").className("android.widget.ImageButton")))
        }
    }

    fun scheduler() {
        step("Переходим на страницу $SHEDULE_TITLE") {
            implClick(device.findObject(
                UiSelector().descriptionContains(SHEDULE_TITLE).className("androidx.appcompat.widget.LinearLayoutCompat")))
        }
    }

    fun notifications(yes: Boolean) {
        step("Включить уведомления $yes") {
            if (yes) {
                implClick(device.findObject(UiSelector().resourceId("android:id/button1")))
            } else {
                implClick(device.findObject(UiSelector().resourceId("android:id/button2")))
            }
        }
    }

    fun goItCustomSchedule() {
        step("Войти в настройки своего расписания") {
            implClick(device.findObject(UiSelector().resourceId("android:id/button2")))
        }
    }

    fun scrollToContains() {
        step("Скролим вниз") {
            UiScrollable(
                UiSelector().scrollable(true).instance(0))
                    .scrollForward()
        }
    }

    fun openItemShedule(titleContains: String) {
        step("Кликаем по элемента с названием $titleContains") {
            implClick(device.findObject(UiSelector().textContains(titleContains)))
        }
    }

    fun checkIsOpenItem(titleCustomShedule: String) {
        step("Проверяем что открыто событие с названием $titleCustomShedule") {
            val gettingTitle = device.findObject(
                UiSelector().resourceId("com.google.samples.apps.iosched:id/session_detail_title"))
                    .text
            assertThat(gettingTitle, `is`(titleCustomShedule))
        }
    }
}