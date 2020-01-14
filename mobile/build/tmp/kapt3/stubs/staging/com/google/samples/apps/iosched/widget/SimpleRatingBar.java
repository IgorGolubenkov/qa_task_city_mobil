package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * This is like [android.widget.RatingBar],  but looks like SeekBar.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/google/samples/apps/iosched/widget/SimpleRatingBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isRated", "", "onRateListener", "Lcom/google/samples/apps/iosched/widget/SimpleRatingBar$OnRateListener;", "rated", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "unrated", "setOnRateListener", "", "listener", "setOnSeekBarChangeListener", "l", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setProgress", "progress", "animate", "updateIndicator", "OnRateListener", "mobile_staging"})
public final class SimpleRatingBar extends androidx.appcompat.widget.AppCompatSeekBar {
    private final android.graphics.drawable.Drawable rated = null;
    private final android.graphics.drawable.Drawable unrated = null;
    private boolean isRated;
    private com.google.samples.apps.iosched.widget.SimpleRatingBar.OnRateListener onRateListener;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void setProgress(int progress) {
    }
    
    @java.lang.Override()
    public void setProgress(int progress, boolean animate) {
    }
    
    @java.lang.Override()
    public void setOnSeekBarChangeListener(@org.jetbrains.annotations.Nullable()
    android.widget.SeekBar.OnSeekBarChangeListener l) {
    }
    
    public final void setOnRateListener(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.widget.SimpleRatingBar.OnRateListener listener) {
    }
    
    private final void updateIndicator(int progress) {
    }
    
    public SimpleRatingBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public SimpleRatingBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SimpleRatingBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/widget/SimpleRatingBar$OnRateListener;", "", "onRate", "", "rate", "", "mobile_staging"})
    public static abstract interface OnRateListener {
        
        public abstract void onRate(int rate);
    }
}