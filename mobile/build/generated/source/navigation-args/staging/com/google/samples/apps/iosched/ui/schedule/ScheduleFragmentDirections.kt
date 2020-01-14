package com.google.samples.apps.iosched.ui.schedule

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.google.samples.apps.iosched.R
import kotlin.Int
import kotlin.String

class ScheduleFragmentDirections private constructor() {
    private data class ToSessionDetail(val sessionId: String) : NavDirections {
        override fun getActionId(): Int = R.id.to_session_detail

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("session_id", this.sessionId)
            return result
        }
    }

    companion object {
        fun toSessionDetail(sessionId: String): NavDirections = ToSessionDetail(sessionId)

        fun toSearch(): NavDirections = ActionOnlyNavDirections(R.id.to_search)
    }
}
