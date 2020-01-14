package com.google.samples.apps.iosched.widget.transition;

import java.lang.System;

/**
 * A [Transition] which animates the rotation of a [View].
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0017\u00a2\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0019"}, d2 = {"Lcom/google/samples/apps/iosched/widget/transition/RotateX;", "Landroid/transition/Transition;", "()V", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "captureEndValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureStartValues", "captureValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "getTransitionProperties", "", "", "()[Ljava/lang/String;", "Companion", "mobile_staging"})
public final class RotateX extends android.transition.Transition {
    private static final java.lang.String PROP_ROTATION = "iosched:rotate:rotation";
    private static final java.lang.String[] TRANSITION_PROPERTIES = null;
    public static final com.google.samples.apps.iosched.widget.transition.RotateX.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String[] getTransitionProperties() {
        return null;
    }
    
    @java.lang.Override()
    public void captureStartValues(@org.jetbrains.annotations.NotNull()
    android.transition.TransitionValues transitionValues) {
    }
    
    @java.lang.Override()
    public void captureEndValues(@org.jetbrains.annotations.NotNull()
    android.transition.TransitionValues transitionValues) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.animation.Animator createAnimator(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup sceneRoot, @org.jetbrains.annotations.Nullable()
    android.transition.TransitionValues startValues, @org.jetbrains.annotations.Nullable()
    android.transition.TransitionValues endValues) {
        return null;
    }
    
    private final void captureValues(android.transition.TransitionValues transitionValues) {
    }
    
    @androidx.annotation.Keep()
    public RotateX() {
        super();
    }
    
    @androidx.annotation.Keep()
    public RotateX(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/widget/transition/RotateX$Companion;", "", "()V", "PROP_ROTATION", "", "TRANSITION_PROPERTIES", "", "[Ljava/lang/String;", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}