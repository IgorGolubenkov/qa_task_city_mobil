/*
 * Golubenkov Igor
 */

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.helpers.OrientationScreenHelper.orientationScreenChange
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.NavigationMenuPage.Companion.SETTINGS_TITLE
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern.Page
import com.google.samples.apps.iosched.ui.MainActivity
import io.qameta.allure.android.step


class SettingPage: Page() {

    override fun checkCurrentPage(): SettingPage {
        step("Проверяем что текущая страница $SETTINGS_TITLE") {
            getTitleInteraction().check(matches(withText(SETTINGS_TITLE)))
        }
        return this
    }

    fun rotationScreen(activityRule: ActivityTestRule<MainActivity>): SettingPage {
        step("Смена орентации экрана") {
            orientationScreenChange(onView(isRoot()), activityRule)
        }
        return this
    }
}