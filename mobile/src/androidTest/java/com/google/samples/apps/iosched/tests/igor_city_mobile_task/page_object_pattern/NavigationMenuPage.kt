/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern

import android.widget.ImageButton
import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.google.samples.apps.iosched.R
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.helpers.TextHelper.getTextToTextView
import io.qameta.allure.android.step
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.core.AllOf.allOf

class NavigationMenuPage: Page() {

    companion object {
        val HOME_TITLE = "Home"
        val AGENDA_TITLE = "Agenda"
        val SETTINGS_TITLE = "Settings"
        val SHEDULE_TITLE = "Schedule"
    }

    fun implOpenPage(pageTitle: String) {
        step("Реализация перехода на страницу $pageTitle") {
            if (!isCurrentPage(pageTitle)) {
                openMenu()
                onView(withText(pageTitle))
                    .perform(click())
            }
        }
    }

    fun home(): NavigationMenuPage {
        step("Переходим на страницу $HOME_TITLE") {
            implOpenPage(HOME_TITLE)
        }
        return this
    }

    fun agenda(): NavigationMenuPage {
        step("Переходим на страницу $AGENDA_TITLE") {
            implOpenPage(AGENDA_TITLE)
        }
        return this
    }

    fun settings(): NavigationMenuPage {
        step("Переходим на страницу $SETTINGS_TITLE") {
            implOpenPage(SETTINGS_TITLE)
        }
        return this
    }

    private fun isCurrentPage(pageTitle: String): Boolean {
        step("Получаем название страницы в toolbar и сравнием его с $pageTitle") {
            return pageTitle.equals(
                getTextToTextView(
                    onView(allOf(instanceOf(TextView::class.java), withParent(withId(R.id.toolbar))))))
        }
    }

    fun openMenu(): NavigationMenuPage {
        step("Открываем меню навигации") {
            onView(allOf(instanceOf(ImageButton::class.java), withParent(withId(R.id.toolbar))))
                .perform(click())
        }
        return this
    }
}