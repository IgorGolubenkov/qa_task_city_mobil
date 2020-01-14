package com.google.samples.apps.iosched.ui.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/google/samples/apps/iosched/ui/info/EventInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "loadWifiInfoUseCase", "Lcom/google/samples/apps/iosched/shared/domain/logistics/LoadWifiInfoUseCase;", "wifiInstaller", "Lcom/google/samples/apps/iosched/util/wifi/WifiInstaller;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "(Lcom/google/samples/apps/iosched/shared/domain/logistics/LoadWifiInfoUseCase;Lcom/google/samples/apps/iosched/util/wifi/WifiInstaller;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "_openUrlEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_snackbarMessage", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "_wifiConfig", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/model/ConferenceWifiInfo;", "openUrlEvent", "Landroidx/lifecycle/LiveData;", "getOpenUrlEvent", "()Landroidx/lifecycle/LiveData;", "showWifi", "", "getShowWifi", "snackBarMessage", "getSnackBarMessage", "wifiConfig", "getWifiConfig", "onClickAssistantApp", "", "onWifiConnect", "Companion", "mobile_staging"})
public final class EventInfoViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.model.ConferenceWifiInfo>> _wifiConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.ConferenceWifiInfo> wifiConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showWifi = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> _snackbarMessage = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _openUrlEvent = null;
    private final com.google.samples.apps.iosched.util.wifi.WifiInstaller wifiInstaller = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private static final java.lang.String ASSISTANT_APP_URL = "https://assistant.google.com/services/invoke/uid/0000009fca77b068";
    public static final com.google.samples.apps.iosched.ui.info.EventInfoViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.ConferenceWifiInfo> getWifiConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowWifi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> getSnackBarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getOpenUrlEvent() {
        return null;
    }
    
    public final void onWifiConnect() {
    }
    
    public final void onClickAssistantApp() {
    }
    
    @javax.inject.Inject()
    public EventInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.logistics.LoadWifiInfoUseCase loadWifiInfoUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.util.wifi.WifiInstaller wifiInstaller, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/ui/info/EventInfoViewModel$Companion;", "", "()V", "ASSISTANT_APP_URL", "", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}