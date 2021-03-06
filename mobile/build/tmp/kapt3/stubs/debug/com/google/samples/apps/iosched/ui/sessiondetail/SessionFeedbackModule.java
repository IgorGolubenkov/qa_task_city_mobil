package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * Module where classes needed to create the [SessionFeedbackFragment] are defined.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackModule;", "", "()V", "bindSessionFeedbackFragmentViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackViewModel;", "contributeSessionFeedbackFragment", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackFragment;", "contributeSessionFeedbackFragment$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class SessionFeedbackModule {
    
    /**
     * Generates an AndroidInjector for the [SessionFeedbackFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.sessioncommon.SessionViewPoolModule.class})
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackFragment contributeSessionFeedbackFragment$mobile_debug();
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [SessionFeedbackViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSessionFeedbackFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel viewModel);
    
    public SessionFeedbackModule() {
        super();
    }
}