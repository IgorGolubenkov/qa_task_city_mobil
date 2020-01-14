package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

/**
 * Loads data and exposes it to the view.
 * By annotating the constructor with [@Inject], Dagger will use that constructor when needing to
 * create the object, so defining a [@Provides] method for this class won't be needed.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001lBO\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J(\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010.2\f\u0010V\u001a\b\u0012\u0004\u0012\u0002090#2\u0006\u0010P\u001a\u00020QH\u0002J\t\u0010W\u001a\u00020 H\u0096\u0001J\t\u0010X\u001a\u00020 H\u0096\u0001J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001dH\u0096\u0001J\t\u0010Z\u001a\u00020\u001bH\u0096\u0001J\t\u0010[\u001a\u00020\u001bH\u0096\u0001J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0096\u0001J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001b0)H\u0096\u0001J\u0010\u0010^\u001a\u00020 2\u0006\u0010_\u001a\u00020`H\u0016J\u0014\u0010a\u001a\u00020 2\n\u0010b\u001a\u00060\u001dj\u0002`cH\u0016J\u0010\u0010d\u001a\u00020 2\u0006\u0010e\u001a\u00020\u001dH\u0016J\u0010\u0010f\u001a\u00020 2\u0006\u0010g\u001a\u00020\u0019H\u0016J\u0010\u0010h\u001a\u00020 2\u0006\u0010i\u001a\u00020\u001bH\u0016J\b\u0010j\u001a\u00020 H\u0002J\b\u0010k\u001a\u00020 H\u0016R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u00020%X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u001a\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0)X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b/\u0010,R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180)\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030)\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010,R \u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207030#0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180)8F\u00a2\u0006\u0006\u001a\u0004\b;\u0010,R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180)8F\u00a2\u0006\u0006\u001a\u0004\b=\u0010,R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180)8F\u00a2\u0006\u0006\u001a\u0004\b?\u0010,R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180)8F\u00a2\u0006\u0006\u001a\u0004\bA\u0010,R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180)8F\u00a2\u0006\u0006\u001a\u0004\bC\u0010,R\u001e\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u00180\u0017X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0#0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180)X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bJ\u0010,R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00180)\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010,R\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020%0)X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bO\u0010,R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0)\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010,\u00a8\u0006m"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "loadCurrentMomentUseCase", "Lcom/google/samples/apps/iosched/shared/domain/feed/LoadCurrentMomentUseCase;", "loadAnnouncementsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/feed/LoadAnnouncementsUseCase;", "loadFilteredUserSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadFilteredUserSessionsUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "conferenceStateLiveData", "Lcom/google/samples/apps/iosched/util/ConferenceStateLiveData;", "timeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "signInViewModelDelegate", "themedActivityDelegate", "(Lcom/google/samples/apps/iosched/shared/domain/feed/LoadCurrentMomentUseCase;Lcom/google/samples/apps/iosched/shared/domain/feed/LoadAnnouncementsUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadFilteredUserSessionsUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/util/ConferenceStateLiveData;Lcom/google/samples/apps/iosched/shared/time/TimeProvider;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;)V", "_navigateToMapAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/model/Moment;", "_navigateToScheduleAction", "", "_navigateToSessionAction", "", "_openLiveStreamAction", "_openSignInDialogAction", "", "currentMomentResult", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "currentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "getCurrentTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "errorMessage", "getErrorMessage", "feed", "", "", "getFeed", "loadAnnouncementsResult", "Lcom/google/samples/apps/iosched/model/Announcement;", "loadSessionsResult", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadFilteredUserSessionsResult;", "navigateToMapAction", "getNavigateToMapAction", "navigateToScheduleAction", "getNavigateToScheduleAction", "navigateToSessionAction", "getNavigateToSessionAction", "openLiveStreamAction", "getOpenLiveStreamAction", "openSignInDialogAction", "getOpenSignInDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "preferConferenceTimeZoneResult", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "getSnackBarMessage", "theme", "getTheme", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "createFeedSessionsContainer", "Lcom/google/samples/apps/iosched/ui/feed/FeedSessions;", "userInfo", "sessionsResult", "emitSignInRequest", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onStarClicked", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "openEventDetail", "id", "Lcom/google/samples/apps/iosched/model/SessionId;", "openLiveStream", "liveStreamUrl", "openMap", "moment", "openSchedule", "showOnlyPinnedSessions", "refreshSessions", "signIn", "Companion", "mobile_staging"})
public final class FeedViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.feed.FeedEventListener, com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> feed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> snackBarMessage = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsResult>> loadSessionsResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.Announcement>>> loadAnnouncementsResult = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.model.Moment>> currentMomentResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.model.Moment>> _navigateToMapAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _openSignInDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _openLiveStreamAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> _navigateToScheduleAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase loadCurrentMomentUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsUseCase loadFilteredUserSessionsUseCase = null;
    private final com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate = null;
    private static final int MAX_SESSIONS = 10;
    public static final com.google.samples.apps.iosched.ui.feed.FeedViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getFeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.model.Moment>> getNavigateToMapAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getOpenSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getOpenLiveStreamAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getNavigateToScheduleAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.feed.FeedSessions createFeedSessionsContainer(com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo userInfo, com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsResult> sessionsResult, org.threeten.bp.ZoneId timeZoneId) {
        return null;
    }
    
    private final void refreshSessions() {
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void openSchedule(boolean showOnlyPinnedSessions) {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    @java.lang.Override()
    public void signIn() {
    }
    
    @java.lang.Override()
    public void openMap(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment moment) {
    }
    
    @java.lang.Override()
    public void openLiveStream(@org.jetbrains.annotations.NotNull()
    java.lang.String liveStreamUrl) {
    }
    
    @javax.inject.Inject()
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase loadCurrentMomentUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase loadAnnouncementsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsUseCase loadFilteredUserSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.util.ConferenceStateLiveData conferenceStateLiveData, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate themedActivityDelegate) {
        super();
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel$Companion;", "", "()V", "MAX_SESSIONS", "", "NoHeader", "NoSessionsContainer", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel$Companion$NoHeader;", "", "()V", "mobile_staging"})
        static final class NoHeader {
            public static final com.google.samples.apps.iosched.ui.feed.FeedViewModel.Companion.NoHeader INSTANCE = null;
            
            private NoHeader() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel$Companion$NoSessionsContainer;", "", "()V", "mobile_staging"})
        static final class NoSessionsContainer {
            public static final com.google.samples.apps.iosched.ui.feed.FeedViewModel.Companion.NoSessionsContainer INSTANCE = null;
            
            private NoSessionsContainer() {
                super();
            }
        }
    }
}