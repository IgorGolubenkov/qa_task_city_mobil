package com.google.samples.apps.iosched.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/di/SignInModule;", "", "()V", "provideAuthStateUserDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "firebase", "Lcom/google/firebase/auth/FirebaseAuth;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "notificationAlarmUpdater", "Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "provideFirebaseAuth", "provideRegisteredUserDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "provideSignInHandler", "Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "providesAuthIdDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthIdDataSource;", "firebaseAuth", "mobile_debug"})
@dagger.Module()
public final class SignInModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.samples.apps.iosched.util.signin.SignInHandler provideSignInHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource provideRegisteredUserDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource provideAuthStateUserDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebase, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource providesAuthIdDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        return null;
    }
    
    public SignInModule() {
        super();
    }
}