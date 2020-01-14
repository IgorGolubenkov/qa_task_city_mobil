/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage.Companion.HOME_TITLE
import io.qameta.allure.android.step

class HomePage: Page() {

    override fun checkCurrentPage(): Page {
        step("Проверяем что текущая страница $HOME_TITLE") {
            getTitleInteraction().check(matches(withText(HOME_TITLE)))
        }
        return this
    }
}