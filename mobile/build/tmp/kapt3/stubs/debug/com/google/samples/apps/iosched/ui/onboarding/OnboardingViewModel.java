package com.google.samples.apps.iosched.ui.onboarding;

import java.lang.System;

/**
 * Records that onboarding has been completed and navigates user onward.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u001f\u001a\u00020\nH\u0096\u0001J\t\u0010 \u001a\u00020\nH\u0096\u0001J\u0006\u0010!\u001a\u00020\nJ\u000b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0001J\t\u0010$\u001a\u00020\u001dH\u0096\u0001J\t\u0010%\u001a\u00020\u001dH\u0096\u0001J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\rH\u0096\u0001J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001d0\rH\u0096\u0001J\u0006\u0010(\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/google/samples/apps/iosched/ui/onboarding/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "onboardingCompleteActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/OnboardingCompleteActionUseCase;", "signInViewModelDelegate", "(Lcom/google/samples/apps/iosched/shared/domain/prefs/OnboardingCompleteActionUseCase;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;)V", "_navigateToMainActivity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToSignInDialogAction", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "navigateToMainActivity", "getNavigateToMainActivity", "navigateToSignInDialogAction", "getNavigateToSignInDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "", "getShouldShowNotificationsPrefAction", "emitSignInRequest", "emitSignOutRequest", "getStartedClick", "getUserId", "", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onSigninClicked", "mobile_debug"})
public final class OnboardingViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToMainActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> navigateToMainActivity = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignInDialogAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> navigateToSignInDialogAction = null;
    private final com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompleteActionUseCase onboardingCompleteActionUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToMainActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    public final void getStartedClick() {
    }
    
    public final void onSigninClicked() {
    }
    
    @javax.inject.Inject()
    public OnboardingViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompleteActionUseCase onboardingCompleteActionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate) {
        super();
    }
    
    /**
     * Live updated value of the current firebase users image url
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    /**
     * Live updated value of the current firebase user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    /**
     * Emits Events when a sign-in event should be attempted
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    /**
     * Emits an non-null Event when the dialog to ask the user notifications preference should be
     * shown.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-in
     */
    @java.lang.Override()
    public void emitSignInRequest() {
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-out
     */
    @java.lang.Override()
    public void emitSignOutRequest() {
    }
    
    /**
     * Returns the current user ID or null if not available.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
}