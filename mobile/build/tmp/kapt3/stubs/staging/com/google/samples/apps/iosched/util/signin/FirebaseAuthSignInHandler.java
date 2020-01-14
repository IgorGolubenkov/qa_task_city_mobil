package com.google.samples.apps.iosched.util.signin;

import java.lang.System;

/**
 * Implementation of [SignInHandler] that interacts with Firebase Auth.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/util/signin/FirebaseAuthSignInHandler;", "Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "()V", "makeSignInIntent", "Landroidx/lifecycle/LiveData;", "Landroid/content/Intent;", "signIn", "", "resultCode", "", "data", "onComplete", "Lkotlin/Function1;", "Lcom/google/samples/apps/iosched/util/signin/SignInResult;", "signOut", "context", "Landroid/content/Context;", "Lkotlin/Function0;", "mobile_staging"})
public final class FirebaseAuthSignInHandler implements com.google.samples.apps.iosched.util.signin.SignInHandler {
    
    /**
     * Request a sign in intent.
     *
     * To observe the result you must pass this to startActivityForResult.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.content.Intent> makeSignInIntent() {
        return null;
    }
    
    /**
     * Parse the response from a sign in request, helper to call from onActivityResult.
     *
     * ```
     * signIn(resultCode, data) { result ->
     *   return when(result) {
     *       is SignInSuccess -> // all good
     *       is SignInFailed -> result?.error // access FirebaseUiException - can be null
     *                                        // (e.g. canceled)
     *   }
     * }
     * ```
     *
     * @param resultCode activity result code
     * @param data activity result intent
     * @param onComplete pass parsed result of either [SignInSuccess] or [SignInFailed]
     */
    @java.lang.SuppressWarnings(value = {"unused"})
    @java.lang.Override()
    public void signIn(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.samples.apps.iosched.util.signin.SignInResult, kotlin.Unit> onComplete) {
    }
    
    /**
     * Attempt to sign the current user out.
     *
     * @param context any context
     * @param onComplete used to notify of signOut completion.
     */
    @java.lang.Override()
    public void signOut(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public FirebaseAuthSignInHandler() {
        super();
    }
}