package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\'\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\n\u0010-\u001a\u00060\u0013j\u0002`.H\u0002J\u0012\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u000101H\u0016J&\u00102\u001a\u0004\u0018\u00010*2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00106\u001a\u00020(H\u0016J\b\u00107\u001a\u00020(H\u0016J\b\u00108\u001a\u00020(H\u0016J\u0010\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020\u0013H\u0002J\b\u0010;\u001a\u00020(H\u0002J\u0018\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020(2\u0006\u0010=\u001a\u00020>H\u0002J\u0018\u0010B\u001a\u00020(2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020\u0013H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006G"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailFragment;", "Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackFragment$Listener;", "()V", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "getAnalyticsHelper", "()Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "setAnalyticsHelper", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentSessionDetailBinding;", "isMapEnabled", "", "session", "Lcom/google/samples/apps/iosched/model/Session;", "sessionDetailViewModel", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewModel;", "sessionTitle", "", "shareString", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "getSnackbarMessageManager", "()Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "setSnackbarMessageManager", "(Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;)V", "tagRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getTagRecycledViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setTagRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "addToCalendar", "", "findSpeakerHeadshot", "Landroid/view/View;", "speakers", "Landroid/view/ViewGroup;", "speakerId", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onFeedbackSubmitted", "onStart", "onStop", "openFeedbackDialog", "sessionId", "openNotificationsPreferenceDialog", "openRemoveReservationDialog", "activity", "Landroidx/fragment/app/FragmentActivity;", "parameters", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogParameters;", "openSignInDialog", "openSwapReservationDialog", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestParameters;", "openYoutubeUrl", "youtubeUrl", "Companion", "mobile_debug"})
public final class SessionDetailFragment extends com.google.samples.apps.iosched.ui.MainNavigationFragment implements com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackFragment.Listener {
    private java.lang.String shareString;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager;
    private com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel sessionDetailViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "tagViewPool")
    @javax.inject.Inject()
    public androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagRecycledViewPool;
    @com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag()
    @javax.inject.Inject()
    public boolean isMapEnabled;
    private com.google.samples.apps.iosched.model.Session session;
    private java.lang.String sessionTitle;
    private com.google.samples.apps.iosched.databinding.FragmentSessionDetailBinding binding;
    private static final java.lang.String FRAGMENT_SESSION_FEEDBACK = "feedback";
    private static final java.lang.String EXTRA_SESSION_ID = "SESSION_ID";
    public static final com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager getSnackbarMessageManager() {
        return null;
    }
    
    public final void setSnackbarMessageManager(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper getAnalyticsHelper() {
        return null;
    }
    
    public final void setAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.RecycledViewPool getTagRecycledViewPool() {
        return null;
    }
    
    public final void setTagRecycledViewPool(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.RecycledViewPool p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onFeedbackSubmitted() {
    }
    
    private final void openYoutubeUrl(java.lang.String youtubeUrl) {
    }
    
    private final void openSignInDialog(androidx.fragment.app.FragmentActivity activity) {
    }
    
    private final void openNotificationsPreferenceDialog() {
    }
    
    private final void openRemoveReservationDialog(androidx.fragment.app.FragmentActivity activity, com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogParameters parameters) {
    }
    
    private final void openSwapReservationDialog(androidx.fragment.app.FragmentActivity activity, com.google.samples.apps.iosched.shared.domain.users.SwapRequestParameters parameters) {
    }
    
    private final android.view.View findSpeakerHeadshot(android.view.ViewGroup speakers, java.lang.String speakerId) {
        return null;
    }
    
    private final void addToCalendar(com.google.samples.apps.iosched.model.Session session) {
    }
    
    private final void openFeedbackDialog(java.lang.String sessionId) {
    }
    
    public SessionDetailFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\u0004j\u0002`\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailFragment$Companion;", "", "()V", "EXTRA_SESSION_ID", "", "FRAGMENT_SESSION_FEEDBACK", "newInstance", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailFragment;", "sessionId", "Lcom/google/samples/apps/iosched/model/SessionId;", "openRateSession", "", "mobile_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String sessionId, boolean openRateSession) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}