package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * Defines all the classes that need to be provided in the scope of the app.
 *
 * Define here all objects that are shared throughout the app, like SharedPreferences, navigators or
 * others. If some of those objects are singletons, they should be annotated with `@Singleton`.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\bH\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\bH\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppModule;", "", "()V", "provideAgendaRepository", "Lcom/google/samples/apps/iosched/shared/data/agenda/AgendaRepository;", "appConfigDataSource", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "provideContext", "Landroid/content/Context;", "application", "Lcom/google/samples/apps/iosched/MainApplication;", "providesAnalyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "context", "signInDelegate", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "preferenceStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "providesAppDatabase", "Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "providesClipboardManager", "Landroid/content/ClipboardManager;", "providesConnectivityManager", "Landroid/net/ConnectivityManager;", "providesMainThreadHandler", "Lcom/google/samples/apps/iosched/shared/domain/internal/IOSchedHandler;", "providesPreferenceStorage", "providesWifiManager", "Landroid/net/wifi/WifiManager;", "mobile_staging"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.MainApplication application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage providesPreferenceStorage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.net.wifi.WifiManager providesWifiManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.net.ConnectivityManager providesConnectivityManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.ClipboardManager providesClipboardManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainThreadHandler()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.domain.internal.IOSchedHandler providesMainThreadHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper providesAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.agenda.AgendaRepository provideAgendaRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfigDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.db.AppDatabase providesAppDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}