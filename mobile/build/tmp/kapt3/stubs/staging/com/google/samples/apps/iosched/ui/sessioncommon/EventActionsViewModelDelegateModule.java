package com.google.samples.apps.iosched.ui.sessioncommon;

import java.lang.System;

/**
 * Provides a default implementation of [EventActionsViewModelDelegate].
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegateModule;", "", "()V", "provideEventActionsViewModelDelegate", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegate;", "signInViewModelDelegate", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "starEventUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "mobile_staging"})
@dagger.Module()
public final class EventActionsViewModelDelegateModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate provideEventActionsViewModelDelegate(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager) {
        return null;
    }
    
    public EventActionsViewModelDelegateModule() {
        super();
    }
}