package com.google.samples.apps.iosched.ui.map

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

data class MapFragmentArgs(
    val mapVariant: String? = null,
    val featureId: String? = null,
    val startTime: Long = 0L
) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("mapVariant", this.mapVariant)
        result.putString("featureId", this.featureId)
        result.putLong("startTime", this.startTime)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): MapFragmentArgs {
            bundle.setClassLoader(MapFragmentArgs::class.java.classLoader)
            val __mapVariant : String?
            if (bundle.containsKey("mapVariant")) {
                __mapVariant = bundle.getString("mapVariant")
            } else {
                __mapVariant = null
            }
            val __featureId : String?
            if (bundle.containsKey("featureId")) {
                __featureId = bundle.getString("featureId")
            } else {
                __featureId = null
            }
            val __startTime : Long
            if (bundle.containsKey("startTime")) {
                __startTime = bundle.getLong("startTime")
            } else {
                __startTime = 0L
            }
            return MapFragmentArgs(__mapVariant, __featureId, __startTime)
        }
    }
}
