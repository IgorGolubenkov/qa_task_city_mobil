package com.google.samples.apps.iosched.ui.codelabs

import android.os.Bundle
import androidx.navigation.NavDirections
import com.google.samples.apps.iosched.R
import kotlin.Int
import kotlin.Long
import kotlin.String

class CodelabsFragmentDirections private constructor() {
    private data class ToMap(
        val mapVariant: String = "DAY",
        val featureId: String = "codelabs",
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
        fun toMap(
            mapVariant: String = "DAY",
            featureId: String = "codelabs",
            startTime: Long = 0L
        ): NavDirections = ToMap(mapVariant, featureId, startTime)
    }
}
