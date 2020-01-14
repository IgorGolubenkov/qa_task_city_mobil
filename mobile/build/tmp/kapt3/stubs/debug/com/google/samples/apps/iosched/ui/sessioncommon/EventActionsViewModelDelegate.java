package com.google.samples.apps.iosched.ui.sessioncommon;

import java.lang.System;

/**
 * A delegate providing common functionality for displaying a list of events and responding to
 * actions performed on them.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\"\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "navigateToEventAction", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "getNavigateToEventAction", "()Landroidx/lifecycle/LiveData;", "navigateToSignInDialogAction", "", "getNavigateToSignInDialogAction", "snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "getSnackBarMessage", "mobile_debug"})
public abstract interface EventActionsViewModelDelegate extends com.google.samples.apps.iosched.ui.sessioncommon.EventActions {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToEventAction();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage();
}