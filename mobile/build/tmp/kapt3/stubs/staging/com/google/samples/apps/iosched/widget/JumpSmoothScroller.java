package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * [LinearSmoothScroller] implementation that first jumps closer to the target position if necessary
 * in order to avoid really long scrolling animations.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/widget/JumpSmoothScroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", "maxDifference", "", "(Landroid/content/Context;I)V", "getHorizontalSnapPreference", "getVerticalSnapPreference", "onSeekTargetStep", "", "dx", "dy", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "action", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;", "mobile_staging"})
public final class JumpSmoothScroller extends androidx.recyclerview.widget.LinearSmoothScroller {
    
    /**
     * Maximum position difference to scroll normally without jumping first.
     */
    private final int maxDifference = 0;
    
    @java.lang.Override()
    protected int getVerticalSnapPreference() {
        return 0;
    }
    
    @java.lang.Override()
    protected int getHorizontalSnapPreference() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onSeekTargetStep(int dx, int dy, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action) {
    }
    
    public JumpSmoothScroller(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int maxDifference) {
        super(null);
    }
}