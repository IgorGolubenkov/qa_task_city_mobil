package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

/**
 * Models the different states of a reservation and a corresponding content description.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;", "", "state", "", "text", "", "contentDescription", "(Ljava/lang/String;I[III)V", "getContentDescription", "()I", "getState", "()[I", "getText", "RESERVABLE", "WAIT_LIST_AVAILABLE", "WAIT_LISTED", "RESERVED", "RESERVATION_PENDING", "RESERVATION_DISABLED", "Companion", "mobile_debug"})
public enum ReservationViewState {
    /*public static final*/ RESERVABLE /* = new RESERVABLE(null, 0, 0) */,
    /*public static final*/ WAIT_LIST_AVAILABLE /* = new WAIT_LIST_AVAILABLE(null, 0, 0) */,
    /*public static final*/ WAIT_LISTED /* = new WAIT_LISTED(null, 0, 0) */,
    /*public static final*/ RESERVED /* = new RESERVED(null, 0, 0) */,
    /*public static final*/ RESERVATION_PENDING /* = new RESERVATION_PENDING(null, 0, 0) */,
    /*public static final*/ RESERVATION_DISABLED /* = new RESERVATION_DISABLED(null, 0, 0) */;
    @org.jetbrains.annotations.NotNull()
    private final int[] state = null;
    private final int text = 0;
    private final int contentDescription = 0;
    public static final com.google.samples.apps.iosched.ui.reservation.ReservationViewState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getState() {
        return null;
    }
    
    public final int getText() {
        return 0;
    }
    
    public final int getContentDescription() {
        return 0;
    }
    
    ReservationViewState(int[] state, @androidx.annotation.StringRes()
    int text, @androidx.annotation.StringRes()
    int contentDescription) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState$Companion;", "", "()V", "fromUserEvent", "Lcom/google/samples/apps/iosched/ui/reservation/ReservationViewState;", "userEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "unavailable", "", "mobile_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.reservation.ReservationViewState fromUserEvent(@org.jetbrains.annotations.Nullable()
        com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, boolean unavailable) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}