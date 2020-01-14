package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020$H\u0016J\u001a\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\u0014\u00103\u001a\u00020&2\n\u00104\u001a\u00060,j\u0002`5H\u0002J\b\u00106\u001a\u00020&H\u0002J \u00107\u001a\u00020&2\u0006\u00108\u001a\u0002092\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006>"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedFragment;", "Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "()V", "adapter", "Lcom/google/samples/apps/iosched/ui/feed/FeedAdapter;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "getAnalyticsHelper", "()Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "setAnalyticsHelper", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentFeedBinding;", "model", "Lcom/google/samples/apps/iosched/ui/feed/FeedViewModel;", "sessionsViewBinder", "Lcom/google/samples/apps/iosched/ui/feed/FeedSessionsViewBinder;", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "getSnackbarMessageManager", "()Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "setSnackbarMessageManager", "(Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "", "outState", "onViewCreated", "view", "openLiveStreamUrl", "url", "", "openMap", "moment", "Lcom/google/samples/apps/iosched/model/Moment;", "openSchedule", "withPinnedSessions", "", "openSessionDetail", "id", "Lcom/google/samples/apps/iosched/model/SessionId;", "openSignInDialog", "showFeedItems", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "", "Companion", "mobile_debug"})
public final class FeedFragment extends com.google.samples.apps.iosched.ui.MainNavigationFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper;
    private com.google.samples.apps.iosched.ui.feed.FeedViewModel model;
    private com.google.samples.apps.iosched.databinding.FragmentFeedBinding binding;
    private com.google.samples.apps.iosched.ui.feed.FeedAdapter adapter;
    private com.google.samples.apps.iosched.ui.feed.FeedSessionsViewBinder sessionsViewBinder;
    private static final java.lang.String DIALOG_NEED_TO_SIGN_IN = "dialog_need_to_sign_in";
    private static final java.lang.String BUNDLE_KEY_SESSIONS_LAYOUT_MANAGER_STATE = "sessions_layout_manager";
    public static final com.google.samples.apps.iosched.ui.feed.FeedFragment.Companion Companion = null;
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void openSessionDetail(java.lang.String id) {
    }
    
    private final void openSchedule(boolean withPinnedSessions) {
    }
    
    private final void showFeedItems(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.List<? extends java.lang.Object> list) {
    }
    
    private final void openSignInDialog() {
    }
    
    private final void openMap(com.google.samples.apps.iosched.model.Moment moment) {
    }
    
    private final void openLiveStreamUrl(java.lang.String url) {
    }
    
    public FeedFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedFragment$Companion;", "", "()V", "BUNDLE_KEY_SESSIONS_LAYOUT_MANAGER_STATE", "", "DIALOG_NEED_TO_SIGN_IN", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}