package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

/**
 * Implementation of SignInViewModelDelegate that uses Firebase's auth mechanisms.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\'\u001a\u00020\u001fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00160\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/FirebaseSignInViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "observeUserAuthStateUseCase", "Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;", "notificationsPrefIsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefIsShownUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefIsShownUseCase;)V", "_isRegistered", "Landroidx/lifecycle/LiveData;", "", "_isSignedIn", "currentUserImageUri", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "notificationsPrefIsShown", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "performSignInEvent", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "Landroidx/lifecycle/MediatorLiveData;", "getShouldShowNotificationsPrefAction", "()Landroidx/lifecycle/MediatorLiveData;", "emitSignInRequest", "", "emitSignOutRequest", "getUserId", "", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "showNotificationPref", "mobile_debug"})
public final class FirebaseSignInViewModelDelegate implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> performSignInEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> currentUserInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.net.Uri> currentUserImageUri = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> shouldShowNotificationsPrefAction = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> _isRegistered = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> _isSignedIn = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> notificationsPrefIsShown = null;
    private final com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    private final void showNotificationPref() {
    }
    
    @java.lang.Override()
    public void emitSignInRequest() {
    }
    
    @java.lang.Override()
    public void emitSignOutRequest() {
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @javax.inject.Inject()
    public FirebaseSignInViewModelDelegate(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase observeUserAuthStateUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase) {
        super();
    }
}