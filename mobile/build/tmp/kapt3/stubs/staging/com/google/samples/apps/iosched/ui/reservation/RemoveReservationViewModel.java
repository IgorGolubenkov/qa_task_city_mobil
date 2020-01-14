package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010#\u001a\u00020$H\u0096\u0001J\t\u0010%\u001a\u00020$H\u0096\u0001J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0096\u0001J\t\u0010\'\u001a\u00020!H\u0096\u0001J\t\u0010(\u001a\u00020!H\u0096\u0001J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020!0\u000eH\u0096\u0001J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u000eH\u0096\u0001J\u0006\u0010+\u001a\u00020$J\u0012\u0010,\u001a\u00020$2\n\u0010-\u001a\u00060\u000bj\u0002`\fR\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0013\u00a8\u0006."}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "signInViewModelDelegate", "loadUserSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;", "reservationActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationActionUseCase;", "(Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationActionUseCase;)V", "_sessionId", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "_userSession", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "currentUserImageUri", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "loadUserSessionResult", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCaseResult;", "performSignInEvent", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "", "getShouldShowNotificationsPrefAction", "emitSignInRequest", "", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "removeReservation", "setSessionId", "sessionId", "mobile_staging"})
public final class RemoveReservationViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _sessionId = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult>> loadUserSessionResult = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserSession> _userSession = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase reservationActionUseCase = null;
    
    public final void setSessionId(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
    }
    
    public final void removeReservation() {
    }
    
    @javax.inject.Inject()
    public RemoveReservationViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase reservationActionUseCase) {
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