package com.google.samples.apps.iosched.ui.speaker

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class SpeakerFragmentArgs(val speakerId: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("speaker_id", this.speakerId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): SpeakerFragmentArgs {
            bundle.setClassLoader(SpeakerFragmentArgs::class.java.classLoader)
            val __speakerId : String?
            if (bundle.containsKey("speaker_id")) {
                __speakerId = bundle.getString("speaker_id")
                if (__speakerId == null) {
                    throw IllegalArgumentException("Argument \"speaker_id\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"speaker_id\" is missing and does not have an android:defaultValue")
            }
            return SpeakerFragmentArgs(__speakerId)
        }
    }
}
