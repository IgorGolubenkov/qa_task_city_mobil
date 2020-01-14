package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * Loads data and exposes it to the view.
 * By annotating the constructor with [@Inject], Dagger will use that constructor when needing to
 * create the object, so defining a [@Provides] method for this class won't be needed.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bo\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0002\u0010\u001dJ\b\u0010t\u001a\u00020\'H\u0016J\t\u0010u\u001a\u00020\'H\u0096\u0001J\t\u0010v\u001a\u00020\'H\u0096\u0001J\u000b\u0010w\u001a\u0004\u0018\u00010!H\u0096\u0001J\t\u0010x\u001a\u00020$H\u0096\u0001J\t\u0010y\u001a\u00020$H\u0096\u0001J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020$04H\u0096\u0001J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020$04H\u0096\u0001J\u0006\u0010|\u001a\u00020\'J\u0010\u0010}\u001a\u00020\'2\u0006\u0010~\u001a\u00020\u007fH\u0016J\u0007\u0010\u0080\u0001\u001a\u00020\'J\u0017\u0010\u0081\u0001\u001a\u00020\'2\f\u0010\u0082\u0001\u001a\u00070!j\u0003`\u0083\u0001H\u0016J\t\u0010\u0084\u0001\u001a\u00020\'H\u0002J\u0011\u0010\u0085\u0001\u001a\u00020\'2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020\'J\u001b\u0010\u0089\u0001\u001a\u00020\'2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020$H\u0016J\t\u0010\u008c\u0001\u001a\u00020\'H\u0002R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010504X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010904X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b:\u00107R\u000e\u0010;\u001a\u00020<X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 048F\u00a2\u0006\u0006\u001a\u0004\b>\u00107R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@04\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.04\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020$048F\u00a2\u0006\u0006\u001a\u0004\bE\u00107R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020$04\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020$04\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00107R \u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0I0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0I0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0I0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 048F\u00a2\u0006\u0006\u001a\u0004\bN\u00107R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 048F\u00a2\u0006\u0006\u001a\u0004\bP\u00107R\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 048F\u00a2\u0006\u0006\u001a\u0004\bR\u00107R\u001e\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0 0#X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0I0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020*048F\u00a2\u0006\u0006\u001a\u0004\bY\u00107R\u001d\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0 04\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00107R\u001a\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0I0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0 048F\u00a2\u0006\u0006\u001a\u0004\b^\u00107R\u001d\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.048F\u00a2\u0006\u0006\u001a\u0004\b`\u00107R\u001e\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0 04X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bb\u00107R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020$04\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00107R\u001d\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010 048F\u00a2\u0006\u0006\u001a\u0004\bf\u00107R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0I0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020$04\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u00107R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020k04\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u00107R\u001a\u0010m\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u000e\u0010r\u001a\u00020sX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008d\u0001"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "loadFilteredUserSessionsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadFilteredUserSessionsUseCase;", "loadEventFiltersUseCase", "Lcom/google/samples/apps/iosched/ui/schedule/filters/LoadEventFiltersUseCase;", "signInViewModelDelegate", "starEventUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;", "scheduleUiHintsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/ScheduleUiHintsShownUseCase;", "topicSubscriber", "Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "refreshConferenceDataUseCase", "Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;", "observeConferenceDataUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ObserveConferenceDataUseCase;", "loadSelectedFiltersUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/LoadSelectedFiltersUseCase;", "saveSelectedFiltersUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/SaveSelectedFiltersUseCase;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "(Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadFilteredUserSessionsUseCase;Lcom/google/samples/apps/iosched/ui/schedule/filters/LoadEventFiltersUseCase;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/users/StarEventAndNotifyUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/ScheduleUiHintsShownUseCase;Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/ObserveConferenceDataUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/LoadSelectedFiltersUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/SaveSelectedFiltersUseCase;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "_errorMessage", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_hasAnyFilters", "Landroidx/lifecycle/MutableLiveData;", "", "_navigateToSessionAction", "_navigateToSignInDialogAction", "", "_navigateToSignOutDialogAction", "_scheduleUiData", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleUiData;", "_scrollToEvent", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleScrollEvent;", "_selectedFilters", "", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "_snackBarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "cachedEventFilters", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "dayIndexer", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "errorMessage", "getErrorMessage", "eventCount", "", "getEventCount", "eventFilters", "getEventFilters", "hasAnyFilters", "getHasAnyFilters", "isConferenceTimeZone", "isLoading", "loadEventFiltersResult", "Lcom/google/samples/apps/iosched/shared/result/Result;", "loadSelectedFiltersResult", "loadSessionsResult", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadFilteredUserSessionsResult;", "navigateToSessionAction", "getNavigateToSessionAction", "navigateToSignInDialogAction", "getNavigateToSignInDialogAction", "navigateToSignOutDialogAction", "getNavigateToSignOutDialogAction", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "preferConferenceTimeZoneResult", "scheduleUiData", "getScheduleUiData", "scheduleUiHintsShown", "getScheduleUiHintsShown", "scheduleUiHintsShownResult", "scrollToEvent", "getScrollToEvent", "selectedFilters", "getSelectedFilters", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showReservations", "getShowReservations", "snackBarMessage", "getSnackBarMessage", "swipeRefreshResult", "swipeRefreshing", "getSwipeRefreshing", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "userHasInteracted", "getUserHasInteracted", "()Z", "setUserHasInteracted", "(Z)V", "userSessionMatcher", "Lcom/google/samples/apps/iosched/shared/schedule/UserSessionMatcher;", "clearFilters", "emitSignInRequest", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "onSignInRequired", "onStarClicked", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "onSwipeRefresh", "openEventDetail", "id", "Lcom/google/samples/apps/iosched/model/SessionId;", "refreshUserSessions", "scrollToStartOfDay", "day", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "showPinnedEvents", "toggleFilter", "filter", "enabled", "updateFilterStateObservables", "mobile_staging"})
public final class ScheduleViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> swipeRefreshing = null;
    private final com.google.samples.apps.iosched.shared.schedule.UserSessionMatcher userSessionMatcher = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<kotlin.Unit>> loadSelectedFiltersResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isConferenceTimeZone = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer dayIndexer;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.ui.schedule.ScheduleUiData> _scheduleUiData = null;
    private java.util.List<? extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter> cachedEventFilters;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> eventFilters = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> _selectedFilters = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hasAnyFilters = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsResult>> loadSessionsResult = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>>> loadEventFiltersResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> swipeRefreshResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> eventCount = null;
    
    /**
     * LiveData for Actions and Events
     */
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _errorMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> _snackBarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showReservations = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignInDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToSignOutDialogAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> scheduleUiHintsShownResult = null;
    
    /**
     * Indicates if the UI hints for the schedule have been shown
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> scheduleUiHintsShown = null;
    private boolean userHasInteracted;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.schedule.ScheduleScrollEvent>> _scrollToEvent = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsUseCase loadFilteredUserSessionsUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase = null;
    private final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager = null;
    private final com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase refreshConferenceDataUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.prefs.SaveSelectedFiltersUseCase saveSelectedFiltersUseCase = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSwipeRefreshing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isConferenceTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.schedule.ScheduleUiData> getScheduleUiData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> getEventFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> getSelectedFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasAnyFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getEventCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowReservations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignInDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToSignOutDialogAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getScheduleUiHintsShown() {
        return null;
    }
    
    public final boolean getUserHasInteracted() {
        return false;
    }
    
    public final void setUserHasInteracted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.schedule.ScheduleScrollEvent>> getScrollToEvent() {
        return null;
    }
    
    public final void showPinnedEvents() {
    }
    
    @java.lang.Override()
    public void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilter filter, boolean enabled) {
    }
    
    @java.lang.Override()
    public void clearFilters() {
    }
    
    private final void updateFilterStateObservables() {
    }
    
    public final void onSwipeRefresh() {
    }
    
    public final void onSignInRequired() {
    }
    
    private final void refreshUserSessions() {
    }
    
    @java.lang.Override()
    public void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    public final void scrollToStartOfDay(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.ConferenceDay day) {
    }
    
    @javax.inject.Inject()
    public ScheduleViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadFilteredUserSessionsUseCase loadFilteredUserSessionsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.LoadEventFiltersUseCase loadEventFiltersUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase starEventUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.ScheduleUiHintsShownUseCase scheduleUiHintsShownUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.fcm.TopicSubscriber topicSubscriber, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase refreshConferenceDataUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.ObserveConferenceDataUseCase observeConferenceDataUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.LoadSelectedFiltersUseCase loadSelectedFiltersUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.SaveSelectedFiltersUseCase saveSelectedFiltersUseCase, @org.jetbrains.annotations.NotNull()
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