package com.google.samples.apps.iosched.ui.prefs;

import java.lang.System;

/**
 * Module that provides classes needed for SharedPreference.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/prefs/PreferenceModule;", "", "()V", "bindSnackbarPreferenceViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/prefs/SnackbarPreferenceViewModel;", "mobile_staging"})
@dagger.Module()
public abstract class PreferenceModule {
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [SnackbarPreferenceViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSnackbarPreferenceViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.prefs.SnackbarPreferenceViewModel viewModel);
    
    public PreferenceModule() {
        super();
    }
}