package com.google.samples.apps.iosched.util;

import java.lang.System;

/**
 * Firebase Analytics implementation of AnalyticsHelper
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/google/samples/apps/iosched/util/FirebaseAnalyticsHelper;", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "context", "Landroid/content/Context;", "signInViewModelDelegate", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "preferenceStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "(Landroid/content/Context;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;)V", "enabled", "", "analyticsEnabled", "setAnalyticsEnabled", "(Z)V", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "prefListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "getBooleanPreferenceAction", "", "prefs", "Landroid/content/SharedPreferences;", "key", "logUiEvent", "", "itemId", "action", "sendScreenView", "screenName", "activity", "Landroid/app/Activity;", "setUserRegistered", "isRegistered", "setUserSignedIn", "isSignedIn", "setupPreferenceChangeListener", "Companion", "mobile_debug"})
public final class FirebaseAnalyticsHelper implements com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper {
    private com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    
    /**
     * stores a strong reference to preference change][PreferenceManager]
     */
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener prefListener;
    private boolean analyticsEnabled;
    private static final java.lang.String UPROP_USER_SIGNED_IN = "user_signed_in";
    private static final java.lang.String UPROP_USER_REGISTERED = "user_registered";
    
    /**
     * Log a specific screen view under the `screenName` string.
     */
    private static final java.lang.String FA_CONTENT_TYPE_SCREENVIEW = "screen";
    private static final java.lang.String FA_KEY_UI_ACTION = "ui_action";
    private static final java.lang.String FA_CONTENT_TYPE_UI_EVENT = "ui event";
    public static final com.google.samples.apps.iosched.util.FirebaseAnalyticsHelper.Companion Companion = null;
    
    private final void setAnalyticsEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void sendScreenView(@org.jetbrains.annotations.NotNull()
    java.lang.String screenName, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void logUiEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String itemId, @org.jetbrains.annotations.NotNull()
    java.lang.String action) {
    }
    
    @java.lang.Override()
    public void setUserSignedIn(boolean isSignedIn) {
    }
    
    @java.lang.Override()
    public void setUserRegistered(boolean isRegistered) {
    }
    
    /**
     * Set up a listener for preference changes.
     */
    private final void setupPreferenceChangeListener(android.content.Context context) {
    }
    
    private final java.lang.String getBooleanPreferenceAction(android.content.SharedPreferences prefs, java.lang.String key) {
        return null;
    }
    
    public FirebaseAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/util/FirebaseAnalyticsHelper$Companion;", "", "()V", "FA_CONTENT_TYPE_SCREENVIEW", "", "FA_CONTENT_TYPE_UI_EVENT", "FA_KEY_UI_ACTION", "UPROP_USER_REGISTERED", "UPROP_USER_SIGNED_IN", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}