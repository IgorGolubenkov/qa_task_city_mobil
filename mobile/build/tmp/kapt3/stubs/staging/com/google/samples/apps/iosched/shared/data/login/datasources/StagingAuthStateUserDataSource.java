package com.google.samples.apps.iosched.shared.data.login.datasources;

import java.lang.System;

/**
 * A configurable [AuthStateUserDataSource] used for staging.
 *
 * @see LoginModule
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\"H\u0016J\b\u0010#\u001a\u00020 H\u0016R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006$"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthStateUserDataSource;", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "isSignedIn", "", "isRegistered", "userId", "", "context", "Landroid/content/Context;", "notificationAlarmUpdater", "Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "(ZZLjava/lang/String;Landroid/content/Context;Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;)V", "_firebaseUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "get_firebaseUser", "()Landroidx/lifecycle/MutableLiveData;", "_userId", "get_userId", "getContext", "()Landroid/content/Context;", "()Z", "getNotificationAlarmUpdater", "()Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "user", "Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthenticatedUserInfo;", "getUser", "()Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthenticatedUserInfo;", "getUserId", "()Ljava/lang/String;", "clearListener", "", "getBasicUserInfo", "Landroidx/lifecycle/LiveData;", "startListening", "mobile_staging"})
public final class StagingAuthStateUserDataSource implements com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _userId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic>> _firebaseUser = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.login.datasources.StagingAuthenticatedUserInfo user = null;
    private final boolean isSignedIn = false;
    private final boolean isRegistered = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_userId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic>> get_firebaseUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.login.datasources.StagingAuthenticatedUserInfo getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void startListening() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic>> getBasicUserInfo() {
        return null;
    }
    
    @java.lang.Override()
    public void clearListener() {
    }
    
    public final boolean isSignedIn() {
        return false;
    }
    
    public final boolean isRegistered() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater getNotificationAlarmUpdater() {
        return null;
    }
    
    public StagingAuthStateUserDataSource(boolean isSignedIn, boolean isRegistered, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater) {
        super();
    }
}