package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

/**
 * Dialog that confirms the user wants to replace their reservations
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/SwapReservationDialogFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "swapActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapActionUseCase;", "getSwapActionUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/users/SwapActionUseCase;", "setSwapActionUseCase", "(Lcom/google/samples/apps/iosched/shared/domain/users/SwapActionUseCase;)V", "formatSwapReservationMessage", "", "res", "Landroid/content/res/Resources;", "fromTitle", "", "toTitle", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "mobile_debug"})
public final class SwapReservationDialogFragment extends dagger.android.support.DaggerAppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.users.SwapActionUseCase swapActionUseCase;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIALOG_SWAP_RESERVATION = "dialog_swap_reservation";
    private static final java.lang.String USER_ID_KEY = "user_id";
    private static final java.lang.String FROM_ID_KEY = "from_id";
    private static final java.lang.String FROM_TITLE_KEY = "from_title";
    private static final java.lang.String TO_ID_KEY = "to_id";
    private static final java.lang.String TO_TITLE_KEY = "to_title";
    public static final com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.users.SwapActionUseCase getSwapActionUseCase() {
        return null;
    }
    
    public final void setSwapActionUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.SwapActionUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final java.lang.CharSequence formatSwapReservationMessage(android.content.res.Resources res, java.lang.String fromTitle, java.lang.String toTitle) {
        return null;
    }
    
    public SwapReservationDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/SwapReservationDialogFragment$Companion;", "", "()V", "DIALOG_SWAP_RESERVATION", "", "FROM_ID_KEY", "FROM_TITLE_KEY", "TO_ID_KEY", "TO_TITLE_KEY", "USER_ID_KEY", "newInstance", "Lcom/google/samples/apps/iosched/ui/reservation/SwapReservationDialogFragment;", "parameters", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;", "mobile_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters parameters) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}