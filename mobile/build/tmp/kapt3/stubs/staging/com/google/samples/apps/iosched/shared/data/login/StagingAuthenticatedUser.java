package com.google.samples.apps.iosched.shared.data.login;

import java.lang.System;

/**
 * A data source for used for [StagingSignInHandler]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/StagingAuthenticatedUser;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "currentUserResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserResult", "()Landroidx/lifecycle/MutableLiveData;", "signedIn", "", "stagingSignedInFirebaseUser", "Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthenticatedUserInfo;", "stagingSignedOutFirebaseUser", "Lcom/google/samples/apps/iosched/shared/data/login/StagingLoggedOutFirebaseUserInfo;", "signIn", "", "signOut", "mobile_staging"})
public final class StagingAuthenticatedUser {
    private final com.google.samples.apps.iosched.shared.data.login.datasources.StagingAuthenticatedUserInfo stagingSignedInFirebaseUser = null;
    private final com.google.samples.apps.iosched.shared.data.login.StagingLoggedOutFirebaseUserInfo stagingSignedOutFirebaseUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>> currentUserResult = null;
    private boolean signedIn;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>> getCurrentUserResult() {
        return null;
    }
    
    public final void signIn() {
    }
    
    public final void signOut() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public StagingAuthenticatedUser(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}