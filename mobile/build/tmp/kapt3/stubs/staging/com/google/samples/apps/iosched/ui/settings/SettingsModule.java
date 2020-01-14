package com.google.samples.apps.iosched.ui.settings;

import java.lang.System;

/**
 * Module where classes needed to create the [SettingsFragment] are defined.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/settings/SettingsModule;", "", "()V", "bindSettingsFragmentViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/settings/SettingsViewModel;", "contributeSettingsFragment", "Lcom/google/samples/apps/iosched/ui/settings/SettingsFragment;", "contributeSettingsFragment$mobile_staging", "contributeThemeSettingFragment", "Lcom/google/samples/apps/iosched/ui/settings/ThemeSettingDialogFragment;", "contributeThemeSettingFragment$mobile_staging", "mobile_staging"})
@dagger.Module()
public abstract class SettingsModule {
    
    /**
     * Generates an [AndroidInjector] for the [SettingsFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.settings.SettingsFragment contributeSettingsFragment$mobile_staging();
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [SettingsViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.settings.SettingsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSettingsFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.settings.SettingsViewModel viewModel);
    
    /**
     * Generates an [AndroidInjector] for the [ThemeSettingDialogFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.settings.ThemeSettingDialogFragment contributeThemeSettingFragment$mobile_staging();
    
    public SettingsModule() {
        super();
    }
}