package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

/**
 * Interface to implement sign-in functionality in a ViewModel.
 *
 * You can inject a implementation of this via Dagger2, then use the implementation as an interface
 * delegate to add sign in functionality without writing any code
 *
 * Example usage
 *
 * ```
 * class MyViewModel @Inject constructor(
 *    signInViewModelComponent: SignInViewModelDelegate
 * ) : ViewModel(), SignInViewModelDelegate by signInViewModelComponent {
 * ```
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0014H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\u0011H&J\b\u0010\u0019\u001a\u00020\u0011H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006\u00a8\u0006\u001c"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "performSignInEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "", "getShouldShowNotificationsPrefAction", "emitSignInRequest", "", "emitSignOutRequest", "getUserId", "", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "mobile_debug"})
public abstract interface SignInViewModelDelegate {
    
    /**
     * Live updated value of the current firebase user
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo();
    
    /**
     * Live updated value of the current firebase users image url
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri();
    
    /**
     * Emits Events when a sign-in event should be attempted
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent();
    
    /**
     * Emits an non-null Event when the dialog to ask the user notifications preference should be
     * shown.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction();
    
    /**
     * Emit an Event on performSignInEvent to request sign-in
     */
    public abstract void emitSignInRequest();
    
    /**
     * Emit an Event on performSignInEvent to request sign-out
     */
    public abstract void emitSignOutRequest();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser();
    
    public abstract boolean isSignedIn();
    
    public abstract boolean isRegistered();
    
    /**
     * Returns the current user ID or null if not available.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUserId();
}