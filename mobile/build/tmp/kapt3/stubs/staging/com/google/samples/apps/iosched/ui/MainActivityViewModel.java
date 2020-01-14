package com.google.samples.apps.iosched.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u00108\u001a\u00020\u0013H\u0096\u0001J\t\u00109\u001a\u00020\u0013H\u0096\u0001J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016H\u0096\u0001J\t\u0010;\u001a\u00020\u000fH\u0096\u0001J\t\u0010<\u001a\u00020\u000fH\u0096\u0001J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0#H\u0096\u0001J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0#H\u0096\u0001J\u0006\u0010?\u001a\u00020\u0013R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0#X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b)\u0010&R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120#8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010&R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120#8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010&R\u001e\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00120\u0011X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u001e\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120#X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b5\u0010&R\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0#X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b7\u0010&\u00a8\u0006@"}, d2 = {"Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "signInViewModelDelegate", "themedActivityDelegate", "loadPinnedSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadPinnedSessionsJsonUseCase;", "loadArDebugFlagUseCase", "Lcom/google/samples/apps/iosched/shared/domain/ar/LoadArDebugFlagUseCase;", "context", "Landroid/content/Context;", "(Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadPinnedSessionsJsonUseCase;Lcom/google/samples/apps/iosched/shared/domain/ar/LoadArDebugFlagUseCase;Landroid/content/Context;)V", "_canSignedInUserDemoAr", "Landroidx/lifecycle/MediatorLiveData;", "", "_navigateToSignInDialogAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToSignOutDialogAction", "_pinnedSessionsJson", "", "arCoreAvailability", "Lcom/google/samples/apps/iosched/ui/ar/ArCoreAvailabilityLiveData;", "getArCoreAvailability", "()Lcom/google/samples/apps/iosched/ui/ar/ArCoreAvailabilityLiveData;", "canSignedInUserDemoAr", "getCanSignedInUserDemoAr", "()Landroidx/lifecycle/MediatorLiveData;", "currentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "getCurrentTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "navigateToSignInDialogAction", "getNavigateToSignInDialogAction", "navigateToSignOutDialogAction", "getNavigateToSignOutDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "pinnedSessionsJson", "getPinnedSessionsJson", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "theme", "getTheme", "emitSignInRequest", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onProfileClicked", "mobile_staging"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate, com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignInDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignOutDialogAction = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.String> _pinnedSessionsJson = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.String> pinnedSessionsJson = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _canSignedInUserDemoAr = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> canSignedInUserDemoAr = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.ui.ar.ArCoreAvailabilityLiveData arCoreAvailability = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignOutDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.String> getPinnedSessionsJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getCanSignedInUserDemoAr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.ar.ArCoreAvailabilityLiveData getArCoreAvailability() {
        return null;
    }
    
    public final void onProfileClicked() {
    }
    
    @javax.inject.Inject()
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate themedActivityDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadPinnedSessionsJsonUseCase loadPinnedSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.ar.LoadArDebugFlagUseCase loadArDebugFlagUseCase, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    
    /**
     * Allows querying of the current theme synchronously
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.Theme getCurrentTheme() {
        return null;
    }
    
    /**
     * Allows observing of the current theme
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> getTheme() {
        return null;
    }
}