package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

/**
 * An [AppCompatTextView] extension supporting multiple custom states, representing the status
 * of a user's reservation for an event.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0014R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/ReservationTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;", "status", "getStatus", "()Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;", "setStatus", "(Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;)V", "onCreateDrawableState", "", "extraSpace", "mobile_staging"})
public final class ReservationTextView extends androidx.appcompat.widget.AppCompatTextView {
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.ui.reservation.ReservationViewState status;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.reservation.ReservationViewState getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.reservation.ReservationViewState value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    public ReservationTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public ReservationTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ReservationTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}