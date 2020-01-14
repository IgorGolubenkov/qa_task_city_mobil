/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withChild
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.google.samples.apps.iosched.R
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.helpers.ChildHelper.childPositionOf
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage.Companion.AGENDA_TITLE
import io.qameta.allure.android.step

class AgendaPage: Page() {

    override fun checkCurrentPage(): AgendaPage {
        step("Проверяем что текущая страница $AGENDA_TITLE") {
            getTitleInteraction().check(matches(withText(AGENDA_TITLE)))
        }
        return this
    }

    fun checkPositionChildItem(title: String, count: Int) {
        step("Проверяем что элемент с названием $title находится в списке под индексом $count") {
            onView(withChild(withText(title)))
                .check(matches(childPositionOf(withId(R.id.recyclerView), count)))
        }
    }
}