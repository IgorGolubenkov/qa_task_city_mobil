package com.google.samples.apps.iosched.ui.feed

import android.os.Bundle
import androidx.navigation.NavDirections
import com.google.samples.apps.iosched.R
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

class FeedFragmentDirections private constructor() {
    private data class ToSessionDetail(val sessionId: String) : NavDirections {
        override fun getActionId(): Int = R.id.to_session_detail

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("session_id", this.sessionId)
            return result
        }
    }

    private data class ToSchedule(val showPinnedEvents: Boolean = false, val showAllEvents: Boolean
            = false) : NavDirections {
        override fun getActionId(): Int = R.id.to_schedule

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putBoolean("showPinnedEvents", this.showPinnedEvents)
            result.putBoolean("showAllEvents", this.showAllEvents)
            return result
        }
    }

    private data class ToMap(
        val featureId: String? = null,
        val startTime: Long = 0L,
        val mapVariant: String? = null
    ) : NavDirections {
        override fun getActionId(): Int = R.id.to_map

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("featureId", this.featureId)
            result.putLong("startTime", this.startTime)
            result.putString("mapVariant", this.mapVariant)
            return result
        }
    }

    companion object {
        fun toSessionDetail(sessionId: String): NavDirections = ToSessionDetail(sessionId)

        fun toSchedule(showPinnedEvents: Boolean = false, showAllEvents: Boolean = false):
                NavDirections = ToSchedule(showPinnedEvents, showAllEvents)

        fun toMap(
            featureId: String? = null,
            startTime: Long = 0L,
            mapVariant: String? = null
        ): NavDirections = ToMap(featureId, startTime, mapVariant)
    }
}
