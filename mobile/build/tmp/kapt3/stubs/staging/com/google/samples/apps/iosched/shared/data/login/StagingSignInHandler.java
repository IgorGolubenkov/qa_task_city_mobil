package com.google.samples.apps.iosched.shared.data.login;

import java.lang.System;

/**
 * A [SignInHandler] that signs a [StagingAuthenticatedUser] in and out, used to simulate an
 * authentication backend for hermetic development and testing.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/StagingSignInHandler;", "Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "user", "Lcom/google/samples/apps/iosched/shared/data/login/StagingAuthenticatedUser;", "(Lcom/google/samples/apps/iosched/shared/data/login/StagingAuthenticatedUser;)V", "getUser", "()Lcom/google/samples/apps/iosched/shared/data/login/StagingAuthenticatedUser;", "makeSignInIntent", "Landroidx/lifecycle/LiveData;", "Landroid/content/Intent;", "signIn", "", "resultCode", "", "data", "onComplete", "Lkotlin/Function1;", "Lcom/google/samples/apps/iosched/util/signin/SignInResult;", "signOut", "context", "Landroid/content/Context;", "Lkotlin/Function0;", "mobile_staging"})
public final class StagingSignInHandler implements com.google.samples.apps.iosched.util.signin.SignInHandler {
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.data.login.StagingAuthenticatedUser user = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.content.Intent> makeSignInIntent() {
        return null;
    }
    
    @java.lang.Override()
    public void signIn(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.samples.apps.iosched.util.signin.SignInResult, kotlin.Unit> onComplete) {
    }
    
    @java.lang.Override()
    public void signOut(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.login.StagingAuthenticatedUser getUser() {
        return null;
    }
    
    public StagingSignInHandler(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.login.StagingAuthenticatedUser user) {
        super();
    }
}