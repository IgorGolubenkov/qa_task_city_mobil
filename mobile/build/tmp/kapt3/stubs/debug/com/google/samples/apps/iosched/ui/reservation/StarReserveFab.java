package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

/**
 * An extension to the [FloatingActionButton] supporting multiple custom states, representing the
 * status of a user's reservation for an event or whether an event is bookmarked (as modelled by
 * the checked state).
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020 H\u0016R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r8\u0002@BX\u0083\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/StarReserveFab;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "_checked", "set_checked", "(Z)V", "", "currentDrawable", "setCurrentDrawable", "(I)V", "mode", "Lcom/google/samples/apps/iosched/ui/reservation/StarReserveFabMode;", "Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;", "reservationStatus", "getReservationStatus", "()Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;", "setReservationStatus", "(Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;)V", "isChecked", "isShowingReservation", "isShowingStar", "onCreateDrawableState", "", "extraSpace", "setChecked", "", "checked", "toggle", "Companion", "mobile_debug"})
public final class StarReserveFab extends com.google.android.material.floatingactionbutton.FloatingActionButton implements android.widget.Checkable {
    private com.google.samples.apps.iosched.ui.reservation.StarReserveFabMode mode;
    private boolean _checked;
    @org.jetbrains.annotations.Nullable()
    private com.google.samples.apps.iosched.ui.reservation.ReservationViewState reservationStatus;
    @androidx.annotation.DrawableRes()
    private int currentDrawable;
    private static final int[] stateChecked = null;
    private static final int[] stateUnchecked = null;
    public static final com.google.samples.apps.iosched.ui.reservation.StarReserveFab.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void set_checked(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.ui.reservation.ReservationViewState getReservationStatus() {
        return null;
    }
    
    public final void setReservationStatus(@org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.ui.reservation.ReservationViewState value) {
    }
    
    private final void setCurrentDrawable(int value) {
    }
    
    @java.lang.Override()
    public boolean isChecked() {
        return false;
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    @java.lang.Override()
    public void toggle() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    private final boolean isShowingReservation() {
        return false;
    }
    
    private final boolean isShowingStar() {
        return false;
    }
    
    public StarReserveFab(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/StarReserveFab$Companion;", "", "()V", "stateChecked", "", "stateUnchecked", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}