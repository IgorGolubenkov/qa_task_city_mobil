/*
 * Golubenkov Igor
 */

package com.google.samples.apps.iosched.tests.igor_city_mobile_task.matchers

import android.view.View
import android.view.ViewGroup
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

class ChildCustomMatcher(
        val parentMatcher: Matcher<View>,
        val childPosition: Int): TypeSafeMatcher<View>() {

    override fun describeTo(description: Description?) {
        description?.appendText("position $childPosition of parent ")
    }

    override fun matchesSafely(item: View?): Boolean {
        if (item?.getParent() !is ViewGroup) return false
        val parent = item.getParent() as ViewGroup

        return parentMatcher.matches(parent)
            && parent.getChildCount() > childPosition
            && parent.getChildAt(childPosition).equals(item)
    }
}