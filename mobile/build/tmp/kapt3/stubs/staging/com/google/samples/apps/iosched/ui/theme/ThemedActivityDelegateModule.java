package com.google.samples.apps.iosched.ui.theme;

import java.lang.System;

@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegateModule;", "", "()V", "provideThemeViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/theme/ThemeViewModel;", "provideThemedActivityDelegate", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "impl", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegateImpl;", "mobile_staging"})
@dagger.Module()
public abstract class ThemedActivityDelegateModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate provideThemedActivityDelegate(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegateImpl impl);
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.theme.ThemeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideThemeViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.theme.ThemeViewModel viewModel);
    
    public ThemedActivityDelegateModule() {
        super();
    }
}