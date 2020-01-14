package com.google.samples.apps.iosched.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005\u00a8\u0006\t"}, d2 = {"navigationItemBackground", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "slideOffsetToAlpha", "", "value", "rangeMin", "rangeMax", "mobile_staging"})
public final class UiUtilsKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable navigationItemBackground(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Map a slideOffset (in the range `[-1, 1]`) to an alpha value based on the desired range.
     * For example, `slideOffsetToAlpha(0.5, 0.25, 1) = 0.33` because 0.5 is 1/3 of the way between
     * 0.25 and 1. The result value is additionally clamped to the range `[0, 1]`.
     */
    public static final float slideOffsetToAlpha(float value, float rangeMin, float rangeMax) {
        return 0.0F;
    }
}