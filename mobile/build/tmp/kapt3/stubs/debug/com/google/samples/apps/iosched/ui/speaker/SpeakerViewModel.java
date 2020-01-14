package com.google.samples.apps.iosched.ui.speaker;

import java.lang.System;

/**
 * Loads a [Speaker] and their sessions, handles event actions.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010?\u001a\u00020,H\u0096\u0001J\t\u0010@\u001a\u00020,H\u0096\u0001J\u000b\u0010A\u001a\u0004\u0018\u00010(H\u0096\u0001J\t\u0010B\u001a\u00020\u001eH\u0096\u0001J\t\u0010C\u001a\u00020\u001eH\u0096\u0001J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0096\u0001J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0096\u0001J\u0010\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020\u0014H\u0016J\u0015\u0010H\u001a\u00020,2\n\u0010I\u001a\u00060(j\u0002`)H\u0096\u0001J\u0012\u0010J\u001a\u00020,2\n\u0010I\u001a\u00060(j\u0002`KR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010&\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060(j\u0002`)0\'0\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u001e\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\'0\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u001e\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\'0!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\'0\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b4\u0010\u0019R\u001e\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\'0\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b7\u0010\u0019R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00168F\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u0019R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00168F\u00a2\u0006\u0006\u001a\u0004\b;\u0010\u0019R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0019\u00a8\u0006L"}, d2 = {"Lcom/google/samples/apps/iosched/ui/speaker/SpeakerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegate;", "loadSpeakerUseCase", "Lcom/google/samples/apps/iosched/shared/domain/speakers/LoadSpeakerUseCase;", "loadSpeakerSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "signInViewModelDelegate", "eventActionsViewModelDelegate", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "(Lcom/google/samples/apps/iosched/shared/domain/speakers/LoadSpeakerUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActionsViewModelDelegate;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "_speaker", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/model/Speaker;", "_speakerUserSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "hasNoProfileImage", "", "getHasNoProfileImage", "loadSpeakerUseCaseResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/speakers/LoadSpeakerUseCaseResult;", "loadSpeakerUserSessions", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCaseResult;", "navigateToEventAction", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "getNavigateToEventAction", "navigateToSignInDialogAction", "", "getNavigateToSignInDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "preferConferenceTimeZoneResult", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "getSnackBarMessage", "speaker", "getSpeaker", "speakerUserSessions", "getSpeakerUserSessions", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "emitSignInRequest", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onStarClicked", "userSession", "openEventDetail", "id", "setSpeakerId", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "mobile_debug"})
public final class SpeakerViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate, com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCaseResult>> loadSpeakerUseCaseResult = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCaseResult>> loadSpeakerUserSessions = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.model.Speaker> _speaker = null;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> _speakerUserSessions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasNoProfileImage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase loadSpeakerUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadSpeakerSessionsUseCase = null;
    private final com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate eventActionsViewModelDelegate = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> getSpeaker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> getSpeakerUserSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasNoProfileImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    /**
     * Provides the speaker ID which initiates all data loading.
     */
    public final void setSpeakerId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @javax.inject.Inject()
    public SpeakerViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase loadSpeakerUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadSpeakerSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate eventActionsViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToEventAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}