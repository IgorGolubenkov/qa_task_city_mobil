/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.helpers

import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
import android.content.res.Configuration
import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.rule.ActivityTestRule
import com.google.samples.apps.iosched.ui.MainActivity
import io.qameta.allure.android.step
import org.hamcrest.Matcher

object OrientationScreenHelper {

    fun orientationScreenChange(viewInteraction: ViewInteraction,
                          activityRule: ActivityTestRule<MainActivity>) {
        step("смена ориентации экрана через кастомный viewaction") {
            viewInteraction.perform(object : ViewAction {
                override fun getConstraints(): Matcher<View> = isRoot()

                override fun getDescription(): String = "Change orientation"

                override fun perform(uiController: UiController, view: View) {
                    val context = view.context
                    val orientation = context?.getResources()?.getConfiguration()?.orientation

                    val activity = activityRule.getActivity()
                    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                        activity.setRequestedOrientation(SCREEN_ORIENTATION_LANDSCAPE)
                    } else {
                        activity.setRequestedOrientation(SCREEN_ORIENTATION_PORTRAIT)
                    }
                }
            })
        }
    }
}