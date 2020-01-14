package com.google.samples.apps.iosched.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/di/SignInModule;", "", "()V", "provideAuthStateUserDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "context", "Landroid/content/Context;", "notificationAlarmUpdater", "Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "provideRegisteredUserDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "provideSignInHandler", "Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "providesAuthIdDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthIdDataSource;", "mobile_staging"})
@dagger.Module()
public final class SignInModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.samples.apps.iosched.util.signin.SignInHandler provideSignInHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource provideRegisteredUserDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource provideAuthStateUserDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource providesAuthIdDataSource() {
        return null;
    }
    
    public SignInModule() {
        super();
    }
}