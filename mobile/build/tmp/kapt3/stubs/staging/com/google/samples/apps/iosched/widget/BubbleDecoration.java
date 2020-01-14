package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * ItemDecoration that draws a bubble background around items in a specified range.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J(\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000fH\u0002J\u0018\u0010\'\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J \u0010+\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J \u0010,\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BubbleDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "animator", "Landroid/animation/ValueAnimator;", "value", "Lkotlin/ranges/IntRange;", "bubbleRange", "getBubbleRange", "()Lkotlin/ranges/IntRange;", "setBubbleRange", "(Lkotlin/ranges/IntRange;)V", "currentRect", "Landroid/graphics/RectF;", "insetHorizontal", "", "insetVertical", "paint", "Landroid/graphics/Paint;", "pendingAnimation", "", "previousRect", "progress", "temp", "computeMovingRect", "", "initial", "target", "computeScalingRect", "rect", "computeTargetRect", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "range", "outRectF", "drawBubble", "canvas", "Landroid/graphics/Canvas;", "getDrawingRect", "onDraw", "startAnimatorIfNeeded", "mobile_staging"})
public final class BubbleDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final android.graphics.Paint paint = null;
    private final float insetHorizontal = 0.0F;
    private final float insetVertical = 0.0F;
    private final android.graphics.RectF currentRect = null;
    private final android.graphics.RectF previousRect = null;
    private final android.graphics.RectF temp = null;
    private android.animation.ValueAnimator animator;
    private boolean pendingAnimation;
    private float progress;
    
    /**
     * The adapter positions to decorate.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.ranges.IntRange bubbleRange;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.ranges.IntRange getBubbleRange() {
        return null;
    }
    
    public final void setBubbleRange(@org.jetbrains.annotations.NotNull()
    kotlin.ranges.IntRange value) {
    }
    
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final void drawBubble(android.graphics.RectF rect, android.graphics.Canvas canvas) {
    }
    
    private final android.graphics.RectF getDrawingRect(android.graphics.RectF initial, android.graphics.RectF target) {
        return null;
    }
    
    private final void computeScalingRect(android.graphics.RectF rect, float progress) {
    }
    
    private final void computeMovingRect(android.graphics.RectF initial, android.graphics.RectF target, float progress) {
    }
    
    private final void computeTargetRect(androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.RecyclerView.State state, kotlin.ranges.IntRange range, android.graphics.RectF outRectF) {
    }
    
    private final void startAnimatorIfNeeded(android.graphics.RectF initial, android.graphics.RectF target, androidx.recyclerview.widget.RecyclerView parent) {
    }
    
    public BubbleDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}