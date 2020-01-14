package com.google.samples.apps.iosched.util.signin;

import java.lang.System;

/**
 * Element in the presentation layer that interacts with the Auth provider (Firebase in this case).
 *
 * This class is used from the activities or fragments.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH&J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "", "makeSignInIntent", "Landroidx/lifecycle/LiveData;", "Landroid/content/Intent;", "signIn", "", "resultCode", "", "data", "onComplete", "Lkotlin/Function1;", "Lcom/google/samples/apps/iosched/util/signin/SignInResult;", "signOut", "context", "Landroid/content/Context;", "Lkotlin/Function0;", "mobile_debug"})
public abstract interface SignInHandler {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<android.content.Intent> makeSignInIntent();
    
    public abstract void signIn(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.samples.apps.iosched.util.signin.SignInResult, kotlin.Unit> onComplete);
    
    public abstract void signOut(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete);
    
    /**
     * Element in the presentation layer that interacts with the Auth provider (Firebase in this case).
     *
     * This class is used from the activities or fragments.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}