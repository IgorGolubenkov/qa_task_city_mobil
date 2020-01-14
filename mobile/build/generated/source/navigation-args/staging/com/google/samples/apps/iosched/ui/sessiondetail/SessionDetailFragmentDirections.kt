package com.google.samples.apps.iosched.ui.sessiondetail

import android.os.Bundle
import androidx.navigation.NavDirections
import com.google.samples.apps.iosched.R
import kotlin.Int
import kotlin.Long
import kotlin.String

class SessionDetailFragmentDirections private constructor() {
    private data class ToSessionDetail(val sessionId: String) : NavDirections {
        override fun getActionId(): Int = R.id.to_session_detail

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("session_id", this.sessionId)
            return result
        }
    }

    private data class ToSpeakerDetail(val speakerId: String) : NavDirections {
        override fun getActionId(): Int = R.id.to_speaker_detail

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("speaker_id", this.speakerId)
            return result
        }
    }

    private data class ToMap(
        val mapVariant: String? = null,
        val featureId: String? = null,
        val startTime: Long = 0L
    ) : NavDirections {
        override fun getActionId(): Int = R.id.to_map

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("mapVariant", this.mapVariant)
            result.putString("featureId", this.featureId)
            result.putLong("startTime", this.startTime)
            return result
        }
    }

    companion object {
        fun toSessionDetail(sessionId: String): NavDirections = ToSessionDetail(sessionId)

        fun toSpeakerDetail(speakerId: String): NavDirections = ToSpeakerDetail(speakerId)

        fun toMap(
            mapVariant: String? = null,
            featureId: String? = null,
            startTime: Long = 0L
        ): NavDirections = ToMap(mapVariant, featureId, startTime)
    }
}
