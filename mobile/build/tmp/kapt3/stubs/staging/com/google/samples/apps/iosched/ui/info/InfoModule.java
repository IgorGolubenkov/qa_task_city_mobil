package com.google.samples.apps.iosched.ui.info;

import java.lang.System;

/**
 * Module where classes needed to create the [InfoFragment] are defined.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/info/InfoModule;", "", "()V", "bindEventInfoFragmentViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/info/EventInfoViewModel;", "contributeInfoFragment", "Lcom/google/samples/apps/iosched/ui/info/InfoFragment;", "contributeInfoFragment$mobile_staging", "mobile_staging"})
@dagger.Module()
public abstract class InfoModule {
    
    /**
     * Generates an [AndroidInjector] for the [InfoFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.info.InfoFragmentsModule.class})
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.info.InfoFragment contributeInfoFragment$mobile_staging();
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [EventInfoViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.info.EventInfoViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindEventInfoFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.info.EventInfoViewModel viewModel);
    
    public InfoModule() {
        super();
    }
}