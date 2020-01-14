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
import io.qameta.allure.android.step
import org.hamcrest.Matcher

object TextHelper {

    /**
     * реализация кастомного Action
     */
    fun getTextToTextView(viewInteraction: ViewInteraction): String {
        step("Получаем текст view через кастомный viewaction") {
            var text = String()
            viewInteraction.perform(object : ViewAction {
                override fun getConstraints(): Matcher<View> =
                    isAssignableFrom(TextView::class.java)

                override fun getDescription(): String = "Tag of the view"

                override fun perform(uiController: UiController, view: View) {
                    val tv = view as TextView
                    text = tv.text.toString()
                }
            })
            return text
        }
    }
}