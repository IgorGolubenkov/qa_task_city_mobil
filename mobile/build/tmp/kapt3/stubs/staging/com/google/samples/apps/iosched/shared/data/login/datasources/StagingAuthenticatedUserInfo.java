package com.google.samples.apps.iosched.shared.data.login.datasources;

import java.lang.System;

/**
 * A configurable [AuthenticatedUserInfo] used for staging.
 *
 * @see [LoginModule]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\n\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016J\r\u0010\u001f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010 J\r\u0010!\u001a\u00020\u0005H\u0016\u00a2\u0006\u0002\u0010 J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthenticatedUserInfo;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "context", "Landroid/content/Context;", "registered", "", "signedIn", "userId", "", "(Landroid/content/Context;ZZLjava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getRegistered", "()Z", "getSignedIn", "getUserId", "()Ljava/lang/String;", "getCreationTimestamp", "", "()Ljava/lang/Long;", "getDisplayName", "getEmail", "getLastSignInTimestamp", "getPhoneNumber", "getPhotoUrl", "Landroid/net/Uri;", "getProviderData", "", "Lcom/google/firebase/auth/UserInfo;", "getProviderId", "getUid", "isAnonymous", "()Ljava/lang/Boolean;", "isEmailVerified", "isRegistered", "isRegistrationDataReady", "isSignedIn", "mobile_staging"})
public class StagingAuthenticatedUserInfo implements com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final boolean registered = false;
    private final boolean signedIn = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isRegistrationDataReady() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<? extends com.google.firebase.auth.UserInfo> getProviderData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Boolean isAnonymous() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Boolean isEmailVerified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.net.Uri getPhotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getProviderId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getLastSignInTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getCreationTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final boolean getRegistered() {
        return false;
    }
    
    public final boolean getSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public StagingAuthenticatedUserInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean registered, boolean signedIn, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
        super();
    }
}