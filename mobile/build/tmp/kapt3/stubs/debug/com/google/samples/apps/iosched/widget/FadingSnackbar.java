package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * A custom snackbar implementation allowing more control over placement and entry/exit animations.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJW\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/google/samples/apps/iosched/widget/FadingSnackbar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "action", "Landroid/widget/Button;", "message", "Landroid/widget/TextView;", "dismiss", "", "show", "messageId", "", "messageText", "", "actionId", "longDuration", "", "actionClick", "Lkotlin/Function0;", "dismissListener", "(ILjava/lang/CharSequence;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Companion", "mobile_debug"})
public final class FadingSnackbar extends android.widget.FrameLayout {
    private final android.widget.TextView message = null;
    private final android.widget.Button action = null;
    private static final long ENTER_DURATION = 300L;
    private static final long EXIT_DURATION = 200L;
    private static final long SHORT_DURATION = 1500L;
    private static final long LONG_DURATION = 2750L;
    public static final com.google.samples.apps.iosched.widget.FadingSnackbar.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void dismiss() {
    }
    
    public final void show(@androidx.annotation.StringRes()
    int messageId, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence messageText, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer actionId, boolean longDuration, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> actionClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissListener) {
    }
    
    public FadingSnackbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/widget/FadingSnackbar$Companion;", "", "()V", "ENTER_DURATION", "", "EXIT_DURATION", "LONG_DURATION", "SHORT_DURATION", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}