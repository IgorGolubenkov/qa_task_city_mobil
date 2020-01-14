package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

/**
 * A custom view for displaying filters. Allows a custom presentation of the tag color and selection
 * state.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000205\u0018\u000108J\u0010\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020\bH\u0002J\u0010\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u0014H\u0016J\b\u0010A\u001a\u000205H\u0014J\b\u0010B\u001a\u00020%H\u0016J\b\u0010C\u001a\u000205H\u0016J\u0010\u0010D\u001a\u0002052\u0006\u0010<\u001a\u00020=H\u0014J\u0018\u0010E\u001a\u0002052\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0014J\u0010\u0010H\u001a\u0002052\u0006\u00106\u001a\u00020%H\u0016J\b\u0010I\u001a\u000205H\u0016J\b\u0010J\u001a\u000205H\u0002J\u0010\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020\fH\u0014R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001e\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020%@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\r\u001a\u00020)@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilterView;", "Landroid/view/View;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chipHeight", "clear", "Landroid/graphics/drawable/Drawable;", "value", "color", "getColor", "()I", "setColor", "(I)V", "cornerRadius", "", "defaultTextColor", "dotPaint", "Landroid/graphics/Paint;", "interp", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "outlinePaint", "padding", "progress", "setProgress", "(F)V", "progressAnimator", "Landroid/animation/ValueAnimator;", "selectedTextColor", "getSelectedTextColor", "setSelectedTextColor", "", "showIcons", "setShowIcons", "(Z)V", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textLayout", "Landroid/text/StaticLayout;", "textPaint", "Landroid/text/TextPaint;", "touchFeedback", "animateCheckedAndInvoke", "", "checked", "onEnd", "Lkotlin/Function0;", "createLayout", "textWidth", "drawChip", "canvas", "Landroid/graphics/Canvas;", "drawableHotspotChanged", "x", "y", "drawableStateChanged", "isChecked", "jumpDrawablesToCurrentState", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setChecked", "toggle", "updateContentDescription", "verifyDrawable", "who", "Companion", "mobile_staging"})
public final class EventFilterView extends android.view.View implements android.widget.Checkable {
    private int color;
    private int selectedTextColor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.CharSequence text;
    private boolean showIcons;
    private float progress;
    private final int padding = 0;
    private final android.graphics.Paint outlinePaint = null;
    private final android.text.TextPaint textPaint = null;
    private final android.graphics.Paint dotPaint = null;
    private final android.graphics.drawable.Drawable clear = null;
    private final android.graphics.drawable.Drawable touchFeedback = null;
    private final float cornerRadius = 0.0F;
    private android.text.StaticLayout textLayout;
    private android.animation.ValueAnimator progressAnimator;
    private final android.view.animation.Interpolator interp = null;
    private int chipHeight;
    @androidx.annotation.ColorInt()
    private final int defaultTextColor = 0;
    private static final long SELECTING_DURATION = 350L;
    private static final long DESELECTING_DURATION = 200L;
    public static final com.google.samples.apps.iosched.ui.schedule.filters.EventFilterView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(int value) {
    }
    
    public final int getSelectedTextColor() {
        return 0;
    }
    
    public final void setSelectedTextColor(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence value) {
    }
    
    private final void setShowIcons(boolean value) {
    }
    
    private final void setProgress(float value) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawChip(android.graphics.Canvas canvas) {
    }
    
    /**
     * Starts the animation to enable/disable a filter and invokes a function when done.
     */
    public final void animateCheckedAndInvoke(boolean checked, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onEnd) {
    }
    
    @java.lang.Override()
    public boolean isChecked() {
        return false;
    }
    
    @java.lang.Override()
    public void toggle() {
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    @java.lang.Override()
    protected boolean verifyDrawable(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable who) {
        return false;
    }
    
    @java.lang.Override()
    protected void drawableStateChanged() {
    }
    
    @java.lang.Override()
    public void jumpDrawablesToCurrentState() {
    }
    
    @java.lang.Override()
    public void drawableHotspotChanged(float x, float y) {
    }
    
    private final void createLayout(int textWidth) {
    }
    
    private final void updateContentDescription() {
    }
    
    public EventFilterView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public EventFilterView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public EventFilterView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilterView$Companion;", "", "()V", "DESELECTING_DURATION", "", "SELECTING_DURATION", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}