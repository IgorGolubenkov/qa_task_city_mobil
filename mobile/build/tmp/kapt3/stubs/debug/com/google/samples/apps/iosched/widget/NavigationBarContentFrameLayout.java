package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * A [FrameLayout] which will draw a divider on the edge of the navigation bar. Similar in
 * functionality to what [Window.setNavigationBarDividerColor] provides, but works with translucent
 * navigation bar colors.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0016J(\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014J\b\u0010%\u001a\u00020\u001bH\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006&"}, d2 = {"Lcom/google/samples/apps/iosched/widget/NavigationBarContentFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dividerDrawable", "Landroid/graphics/drawable/ColorDrawable;", "getDividerDrawable", "()Landroid/graphics/drawable/ColorDrawable;", "dividerDrawable$delegate", "Lkotlin/Lazy;", "lastInsets", "Landroid/view/WindowInsets;", "value", "navigationBarDividerColor", "getNavigationBarDividerColor", "()I", "setNavigationBarDividerColor", "(I)V", "navigationBarDividerSize", "getNavigationBarDividerSize", "setNavigationBarDividerSize", "draw", "", "canvas", "Landroid/graphics/Canvas;", "onApplyWindowInsets", "insets", "onSizeChanged", "w", "h", "oldw", "oldh", "updateDividerBounds", "mobile_debug"})
public final class NavigationBarContentFrameLayout extends android.widget.FrameLayout {
    private int navigationBarDividerColor;
    private int navigationBarDividerSize;
    private android.view.WindowInsets lastInsets;
    private final kotlin.Lazy dividerDrawable$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getNavigationBarDividerColor() {
        return 0;
    }
    
    public final void setNavigationBarDividerColor(int value) {
    }
    
    public final int getNavigationBarDividerSize() {
        return 0;
    }
    
    public final void setNavigationBarDividerSize(int value) {
    }
    
    private final android.graphics.drawable.ColorDrawable getDividerDrawable() {
        return null;
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.WindowInsets onApplyWindowInsets(@org.jetbrains.annotations.NotNull()
    android.view.WindowInsets insets) {
        return null;
    }
    
    private final void updateDividerBounds() {
    }
    
    public NavigationBarContentFrameLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public NavigationBarContentFrameLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public NavigationBarContentFrameLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}