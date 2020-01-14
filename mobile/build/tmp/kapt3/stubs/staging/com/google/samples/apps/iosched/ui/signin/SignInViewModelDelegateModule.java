package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegateModule;", "", "()V", "provideSignInViewModelDelegate", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "dataSource", "Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;", "notificationsPrefIsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefIsShownUseCase;", "mobile_staging"})
@dagger.Module()
public final class SignInViewModelDelegateModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate provideSignInViewModelDelegate(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase dataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase) {
        return null;
    }
    
    public SignInViewModelDelegateModule() {
        super();
    }
}