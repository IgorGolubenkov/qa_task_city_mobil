package com.google.samples.apps.iosched.ui.theme;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegateImpl;", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "observeThemeUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/ObserveThemeModeUseCase;", "getThemeUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetThemeUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/settings/ObserveThemeModeUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetThemeUseCase;)V", "currentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "getCurrentTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "theme", "Landroidx/lifecycle/LiveData;", "getTheme", "()Landroidx/lifecycle/LiveData;", "theme$delegate", "Lkotlin/Lazy;", "mobile_staging"})
public final class ThemedActivityDelegateImpl implements com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy theme$delegate = null;
    private final com.google.samples.apps.iosched.shared.domain.settings.ObserveThemeModeUseCase observeThemeUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase getThemeUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> getTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.Theme getCurrentTheme() {
        return null;
    }
    
    @javax.inject.Inject()
    public ThemedActivityDelegateImpl(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.ObserveThemeModeUseCase observeThemeUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetThemeUseCase getThemeUseCase) {
        super();
    }
}