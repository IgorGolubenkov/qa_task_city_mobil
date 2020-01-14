package com.google.samples.apps.iosched.ui.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0006\u00108\u001a\u00020\u0018J\u000e\u00109\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u001cJ\u000e\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\"J\u000e\u0010<\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\"J\u000e\u0010=\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\"R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0 0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0 0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001a8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0 0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0 0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0 0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/google/samples/apps/iosched/ui/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "setTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/SetTimeZoneUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "notificationsPrefSaveActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;", "getNotificationsSettingUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetNotificationsSettingUseCase;", "setAnalyticsSettingUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/SetAnalyticsSettingUseCase;", "getAnalyticsSettingUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetAnalyticsSettingUseCase;", "setThemeUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/SetThemeUseCase;", "getThemeUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetThemeUseCase;", "getAvailableThemesUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetAvailableThemesUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/settings/SetTimeZoneUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetNotificationsSettingUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/SetAnalyticsSettingUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetAnalyticsSettingUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/SetThemeUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetThemeUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetAvailableThemesUseCase;)V", "_navigateToThemeSelector", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "availableThemes", "Landroidx/lifecycle/LiveData;", "", "Lcom/google/samples/apps/iosched/model/Theme;", "getAvailableThemes", "()Landroidx/lifecycle/LiveData;", "availableThemesResult", "Lcom/google/samples/apps/iosched/shared/result/Result;", "enableNotifications", "", "getEnableNotifications", "enableNotificationsResult", "navigateToThemeSelector", "getNavigateToThemeSelector", "getNotificationsPrefSaveActionUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;", "preferConferenceTimeZone", "getPreferConferenceTimeZone", "preferConferenceTimeZoneResult", "sendUsageStatistics", "getSendUsageStatistics", "sendUsageStatisticsResult", "getSetAnalyticsSettingUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/settings/SetAnalyticsSettingUseCase;", "getSetThemeUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/settings/SetThemeUseCase;", "getSetTimeZoneUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/settings/SetTimeZoneUseCase;", "theme", "getTheme", "themeResult", "onThemeSettingClicked", "setTheme", "toggleEnableNotifications", "checked", "toggleSendUsageStatistics", "toggleTimeZone", "mobile_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> preferConferenceTimeZone = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> enableNotificationsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> enableNotifications = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> sendUsageStatisticsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> sendUsageStatistics = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.model.Theme>> themeResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> theme = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.Theme>>> availableThemesResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Theme>> availableThemes = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> _navigateToThemeSelector = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase setTimeZoneUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase notificationsPrefSaveActionUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase setAnalyticsSettingUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase setThemeUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getPreferConferenceTimeZone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEnableNotifications() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSendUsageStatistics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> getTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Theme>> getAvailableThemes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<kotlin.Unit>> getNavigateToThemeSelector() {
        return null;
    }
    
    public final void toggleTimeZone(boolean checked) {
    }
    
    public final void toggleSendUsageStatistics(boolean checked) {
    }
    
    public final void toggleEnableNotifications(boolean checked) {
    }
    
    public final void setTheme(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Theme theme) {
    }
    
    public final void onThemeSettingClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase getSetTimeZoneUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase getNotificationsPrefSaveActionUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase getSetAnalyticsSettingUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase getSetThemeUseCase() {
        return null;
    }
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.SetTimeZoneUseCase setTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase notificationsPrefSaveActionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetNotificationsSettingUseCase getNotificationsSettingUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.SetAnalyticsSettingUseCase setAnalyticsSettingUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetAnalyticsSettingUseCase getAnalyticsSettingUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.SetThemeUseCase setThemeUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase getThemeUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetAvailableThemesUseCase getAvailableThemesUseCase) {
        super();
    }
}