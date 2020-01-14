/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.helpers

import android.view.View
import android.widget.TextView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import com.google.samples.apps.iosched.tests.igor_city_mobile_task.matchers.ChildCustomMatcher
import io.qameta.allure.android.step
import org.hamcrest.Matcher

object ChildHelper {

    fun childPositionOf(parentMatcher: Matcher<View>, childPosition: Int): Matcher<View> =
        ChildCustomMatcher(parentMatcher, childPosition)

    fun getParentToTitle(viewInteraction: ViewInteraction) {
        step("Через кастомный matcher") {
            viewInteraction.perform(object : ViewAction {
                override fun getConstraints(): Matcher<View> =
                    isAssignableFrom(TextView::class.java)

                override fun getDescription(): String = "Agenda title get through parent view"

                override fun perform(uiController: UiController, view: View) {
                    val parent = view.parent
                }
            })
        }
    }
}