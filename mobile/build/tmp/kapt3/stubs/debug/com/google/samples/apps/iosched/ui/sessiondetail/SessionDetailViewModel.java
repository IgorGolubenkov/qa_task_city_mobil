package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * Loads [Session] data and exposes it to the session detail view.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BW\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u0010n\u001a\u00020$H\u0096\u0001J\t\u0010o\u001a\u00020$H\u0096\u0001J\u0010\u0010p\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`!H\u0002J\u000b\u0010q\u001a\u0004\u0018\u00010\u001cH\u0096\u0001J\t\u0010r\u001a\u00020/H\u0096\u0001J\t\u0010s\u001a\u00020/H\u0096\u0001J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020/05H\u0096\u0001J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020/05H\u0096\u0001J\b\u0010v\u001a\u00020$H\u0014J\b\u0010w\u001a\u00020$H\u0016J\b\u0010x\u001a\u00020$H\u0016J\u0006\u0010y\u001a\u00020$J\b\u0010z\u001a\u00020$H\u0016J\u0014\u0010{\u001a\u00020$2\n\u0010|\u001a\u00060\u001cj\u0002`&H\u0016J\b\u0010}\u001a\u00020$H\u0016J\u0010\u0010}\u001a\u00020$2\u0006\u0010~\u001a\u00020+H\u0016J\u0015\u0010\u007f\u001a\u00020$2\u000b\u0010\u0080\u0001\u001a\u00060\u001cj\u0002`!H\u0016J\t\u0010\u0081\u0001\u001a\u00020$H\u0002J\u0018\u0010\u0082\u0001\u001a\u00020$2\u000f\u0010\u0083\u0001\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`!J\t\u0010\u0084\u0001\u001a\u00020/H\u0002R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001cj\u0002`!0\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001cj\u0002`!0\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001cj\u0002`&0\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010605X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:05X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b;\u00108R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b058F\u00a2\u0006\u0006\u001a\u0004\b=\u00108R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020/05\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00108R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@05X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0@0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b058F\u00a2\u0006\u0006\u001a\u0004\bE\u00108R!\u0010F\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001cj\u0002`!0\u001b058F\u00a2\u0006\u0006\u001a\u0004\bG\u00108R!\u0010H\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001cj\u0002`!0\u001b058F\u00a2\u0006\u0006\u001a\u0004\bI\u00108R\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001b058F\u00a2\u0006\u0006\u001a\u0004\bK\u00108R!\u0010L\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001cj\u0002`&0\u001b058F\u00a2\u0006\u0006\u001a\u0004\bM\u00108R\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001b058F\u00a2\u0006\u0006\u001a\u0004\bO\u00108R\u001d\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u001b0\u001eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bU\u0010RR\u001a\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0@0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*058F\u00a2\u0006\u0006\u001a\u0004\bX\u00108R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020-058F\u00a2\u0006\u0006\u001a\u0004\bZ\u00108R\u001c\u0010[\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u001cj\u0004\u0018\u0001`!0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020]05X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001b05X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b_\u00108R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020/05\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00108R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020/05\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00108R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001b058F\u00a2\u0006\u0006\u001a\u0004\be\u00108R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g05\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u00108R\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020j05\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u00108R\u0017\u0010l\u001a\b\u0012\u0004\u0012\u000203058F\u00a2\u0006\u0006\u001a\u0004\bm\u00108\u00a8\u0006\u0085\u0001"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailEventListener;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "signInViewModelDelegate", "loadUserSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;", "loadRelatedSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;", "starEventUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;", "reservationActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationActionUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "timeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "networkUtils", "Lcom/google/samples/apps/iosched/shared/util/NetworkUtils;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "(Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCase;Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationActionUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;Lcom/google/samples/apps/iosched/shared/time/TimeProvider;Lcom/google/samples/apps/iosched/shared/util/NetworkUtils;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "_errorMessage", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToRemoveReservationDialogAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogParameters;", "_navigateToSessionAction", "Lcom/google/samples/apps/iosched/model/SessionId;", "_navigateToSessionFeedbackAction", "_navigateToSignInDialogAction", "", "_navigateToSpeakerDetail", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "_navigateToSwapReservationDialogAction", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;", "_relatedUserSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "_session", "Lcom/google/samples/apps/iosched/model/Session;", "_shouldShowStarInBottomNav", "", "_snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "_userEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "errorMessage", "getErrorMessage", "isReservationDisabled", "loadRelatedUserSessions", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionsUseCaseResult;", "loadUserSessionResult", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCaseResult;", "navigateToRemoveReservationDialogAction", "getNavigateToRemoveReservationDialogAction", "navigateToSessionAction", "getNavigateToSessionAction", "navigateToSessionFeedbackAction", "getNavigateToSessionFeedbackAction", "navigateToSignInDialogAction", "getNavigateToSignInDialogAction", "navigateToSpeakerDetail", "getNavigateToSpeakerDetail", "navigateToSwapReservationDialogAction", "getNavigateToSwapReservationDialogAction", "navigateToYouTubeAction", "getNavigateToYouTubeAction", "()Landroidx/lifecycle/MutableLiveData;", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "preferConferenceTimeZoneResult", "relatedUserSessions", "getRelatedUserSessions", "session", "getSession", "sessionId", "sessionTimeRelativeState", "Lcom/google/samples/apps/iosched/shared/util/TimeUtils$SessionRelativeTimeState;", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "shouldShowStarInBottomNav", "getShouldShowStarInBottomNav", "showFeedbackButton", "getShowFeedbackButton", "snackBarMessage", "getSnackBarMessage", "timeUntilStart", "Lorg/threeten/bp/Duration;", "getTimeUntilStart", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "userEvent", "getUserEvent", "emitSignInRequest", "emitSignOutRequest", "getSessionId", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onCleared", "onFeedbackClicked", "onLoginClicked", "onPlayVideo", "onReservationClicked", "onSpeakerClicked", "speakerId", "onStarClicked", "userSession", "openEventDetail", "id", "refreshUserSession", "setSessionId", "newSessionId", "showStarInBottomNav", "mobile_debug"})
public final class SessionDetailViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener, com.google.samples.apps.iosched.ui.sessioncommon.EventActions, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult>> loadUserSessionResult = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCaseResult>> loadRelatedUserSessions = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.util.TimeUtils.SessionRelativeTimeState> sessionTimeRelativeState = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _errorMessage = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> _snackBarMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignInDialogAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToYouTubeAction = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.model.Session> _session = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> _userEvent = null;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> _relatedUserSessions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showFeedbackButton = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.Duration> timeUntilStart = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isReservationDisabled = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _shouldShowStarInBottomNav = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldShowStarInBottomNav = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> sessionId = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogParameters>> _navigateToRemoveReservationDialogAction = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters>> _navigateToSwapReservationDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSpeakerDetail = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionFeedbackAction = null;
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadRelatedSessionUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase reservationActionUseCase = null;
    private final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager = null;
    private final com.google.samples.apps.iosched.shared.util.NetworkUtils networkUtils = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToYouTubeAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> getRelatedUserSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowFeedbackButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.Duration> getTimeUntilStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isReservationDisabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldShowStarInBottomNav() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogParameters>> getNavigateToRemoveReservationDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters>> getNavigateToSwapReservationDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSpeakerDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionFeedbackAction() {
        return null;
    }
    
    private final void refreshUserSession() {
    }
    
    public final void setSessionId(@org.jetbrains.annotations.Nullable()
    java.lang.String newSessionId) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * Called by the UI when play button is clicked
     */
    public final void onPlayVideo() {
    }
    
    @java.lang.Override()
    public void onStarClicked() {
    }
    
    @java.lang.Override()
    public void onReservationClicked() {
    }
    
    @java.lang.Override()
    public void onLoginClicked() {
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @java.lang.Override()
    public void onSpeakerClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String speakerId) {
    }
    
    @java.lang.Override()
    public void onFeedbackClicked() {
    }
    
    /**
     * Returns the current session ID or null if not available.
     */
    private final java.lang.String getSessionId() {
        return null;
    }
    
    private final boolean showStarInBottomNav() {
        return false;
    }
    
    @javax.inject.Inject()
    public SessionDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase loadRelatedSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase reservationActionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.util.NetworkUtils networkUtils, @org.jetbrains.annotations.NotNull()
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
}