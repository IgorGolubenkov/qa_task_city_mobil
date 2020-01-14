package com.google.samples.apps.iosched.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00105\u001a\u000206H\u0002J\n\u00107\u001a\u0004\u0018\u000108H\u0002J\u0010\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u0016H\u0002J\"\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u00162\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010@\u001a\u000206H\u0016J\u0012\u0010A\u001a\u0002062\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\u0012\u0010D\u001a\u0002062\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\b\u0010E\u001a\u000206H\u0016J\b\u0010F\u001a\u000206H\u0002J\b\u0010G\u001a\u000206H\u0002J\b\u0010H\u001a\u000206H\u0002J\b\u0010I\u001a\u000206H\u0002J\b\u0010J\u001a\u000206H\u0002J\u0010\u0010K\u001a\u0002062\u0006\u0010L\u001a\u00020MH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006O"}, d2 = {"Lcom/google/samples/apps/iosched/ui/MainActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Lcom/google/samples/apps/iosched/ui/NavigationHost;", "()V", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "getAnalyticsHelper", "()Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "setAnalyticsHelper", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "canSignedInUserDemoAr", "", "codelabsFeatureEnabled", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "setConnectivityManager", "(Landroid/net/ConnectivityManager;)V", "content", "Landroid/widget/FrameLayout;", "currentNavId", "", "drawer", "Landroidx/drawerlayout/widget/DrawerLayout;", "exploreArFeatureEnabled", "mapFeatureEnabled", "navController", "Landroidx/navigation/NavController;", "navHeaderBinding", "Lcom/google/samples/apps/iosched/databinding/NavigationHeaderBinding;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "navigation", "Lcom/google/android/material/navigation/NavigationView;", "pinnedSessionsJson", "", "snackbarMessageManager", "Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "getSnackbarMessageManager", "()Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "setSnackbarMessageManager", "(Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;)V", "statusScrim", "Landroid/view/View;", "viewModel", "Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "closeDrawer", "", "getCurrentFragment", "Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "navigateTo", "navId", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRestoreInstanceState", "onUserInteraction", "openArCoreNotSupported", "openExploreAr", "openNoConnection", "openSignInDialog", "openSignOutDialog", "registerToolbarWithNavigation", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "Companion", "mobile_debug"})
public final class MainActivity extends dagger.android.support.DaggerAppCompatActivity implements com.google.samples.apps.iosched.ui.NavigationHost {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager snackbarMessageManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.net.ConnectivityManager connectivityManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper;
    @com.google.samples.apps.iosched.shared.di.MapFeatureEnabledFlag()
    @javax.inject.Inject()
    public boolean mapFeatureEnabled;
    @com.google.samples.apps.iosched.shared.di.CodelabsEnabledFlag()
    @javax.inject.Inject()
    public boolean codelabsFeatureEnabled;
    @com.google.samples.apps.iosched.shared.di.ExploreArEnabledFlag()
    @javax.inject.Inject()
    public boolean exploreArFeatureEnabled;
    private com.google.samples.apps.iosched.ui.MainActivityViewModel viewModel;
    private android.widget.FrameLayout content;
    private androidx.drawerlayout.widget.DrawerLayout drawer;
    private com.google.android.material.navigation.NavigationView navigation;
    private com.google.samples.apps.iosched.databinding.NavigationHeaderBinding navHeaderBinding;
    private androidx.navigation.NavController navController;
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    private android.view.View statusScrim;
    private int currentNavId;
    private java.lang.String pinnedSessionsJson;
    private boolean canSignedInUserDemoAr;
    
    /**
     * Key for an int extra defining the initial navigation target.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NAVIGATION_ID = "extra.NAVIGATION_ID";
    private static final int NAV_ID_NONE = -1;
    private static final java.lang.String DIALOG_SIGN_IN = "dialog_sign_in";
    private static final java.lang.String DIALOG_SIGN_OUT = "dialog_sign_out";
    private static final java.util.Set<java.lang.Integer> TOP_LEVEL_DESTINATIONS = null;
    public static final com.google.samples.apps.iosched.ui.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager getSnackbarMessageManager() {
        return null;
    }
    
    public final void setSnackbarMessageManager(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    public final void setConnectivityManager(@org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper getAnalyticsHelper() {
        return null;
    }
    
    public final void setAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void registerToolbarWithNavigation(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void closeDrawer() {
    }
    
    @java.lang.Override()
    public void onUserInteraction() {
    }
    
    private final com.google.samples.apps.iosched.ui.MainNavigationFragment getCurrentFragment() {
        return null;
    }
    
    private final void navigateTo(int navId) {
    }
    
    private final void openSignInDialog() {
    }
    
    private final void openSignOutDialog() {
    }
    
    private final void openExploreAr() {
    }
    
    private final void openNoConnection() {
    }
    
    private final void openArCoreNotSupported() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/MainActivity$Companion;", "", "()V", "DIALOG_SIGN_IN", "", "DIALOG_SIGN_OUT", "EXTRA_NAVIGATION_ID", "NAV_ID_NONE", "", "TOP_LEVEL_DESTINATIONS", "", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}