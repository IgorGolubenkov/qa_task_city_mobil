package com.google.samples.apps.iosched.ui.schedule

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Boolean
import kotlin.jvm.JvmStatic

data class ScheduleFragmentArgs(val showPinnedEvents: Boolean = false, val showAllEvents: Boolean =
        false) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putBoolean("showPinnedEvents", this.showPinnedEvents)
        result.putBoolean("showAllEvents", this.showAllEvents)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): ScheduleFragmentArgs {
            bundle.setClassLoader(ScheduleFragmentArgs::class.java.classLoader)
            val __showPinnedEvents : Boolean
            if (bundle.containsKey("showPinnedEvents")) {
                __showPinnedEvents = bundle.getBoolean("showPinnedEvents")
            } else {
                __showPinnedEvents = false
            }
            val __showAllEvents : Boolean
            if (bundle.containsKey("showAllEvents")) {
                __showAllEvents = bundle.getBoolean("showAllEvents")
            } else {
                __showAllEvents = false
            }
            return ScheduleFragmentArgs(__showPinnedEvents, __showAllEvents)
        }
    }
}
