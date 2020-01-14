package com.google.samples.apps.iosched.util.wifi;

import java.lang.System;

/**
 * Installs WiFi on device given a WiFi configuration.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/util/wifi/WifiInstaller;", "", "wifiManager", "Landroid/net/wifi/WifiManager;", "clipboardManager", "Landroid/content/ClipboardManager;", "(Landroid/net/wifi/WifiManager;Landroid/content/ClipboardManager;)V", "installConferenceWifi", "", "rawWifiConfig", "Landroid/net/wifi/WifiConfiguration;", "mobile_staging"})
public final class WifiInstaller {
    private final android.net.wifi.WifiManager wifiManager = null;
    private final android.content.ClipboardManager clipboardManager = null;
    
    public final boolean installConferenceWifi(@org.jetbrains.annotations.NotNull()
    android.net.wifi.WifiConfiguration rawWifiConfig) {
        return false;
    }
    
    @javax.inject.Inject()
    public WifiInstaller(@org.jetbrains.annotations.NotNull()
    android.net.wifi.WifiManager wifiManager, @org.jetbrains.annotations.NotNull()
    android.content.ClipboardManager clipboardManager) {
        super();
    }
}