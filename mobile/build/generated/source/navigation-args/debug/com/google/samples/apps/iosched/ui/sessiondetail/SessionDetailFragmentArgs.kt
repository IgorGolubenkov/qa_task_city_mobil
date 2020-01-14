package com.google.samples.apps.iosched.ui.sessiondetail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class SessionDetailFragmentArgs(val sessionId: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("session_id", this.sessionId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): SessionDetailFragmentArgs {
            bundle.setClassLoader(SessionDetailFragmentArgs::class.java.classLoader)
            val __sessionId : String?
            if (bundle.containsKey("session_id")) {
                __sessionId = bundle.getString("session_id")
                if (__sessionId == null) {
                    throw IllegalArgumentException("Argument \"session_id\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"session_id\" is missing and does not have an android:defaultValue")
            }
            return SessionDetailFragmentArgs(__sessionId)
        }
    }
}
