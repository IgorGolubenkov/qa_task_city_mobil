/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.page_object_pattern

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import com.google.samples.apps.iosched.R
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.core.AllOf.allOf

open class Page {

    companion object {
        inline fun <reified T : Page> on(): T {
            return Page().on()
        }
    }

    inline fun <reified T : Page> on(): T {
        val page = T::class.constructors.first().call()
        return page
    }

    open fun checkCurrentPage(): Page {
        return this
    }

    fun getTitleInteraction(): ViewInteraction =
        onView(allOf(instanceOf(TextView::class.java), withParent(withId(R.id.toolbar))))
}