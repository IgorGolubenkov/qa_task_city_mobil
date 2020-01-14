package com.google.samples.apps.iosched.ui.onboarding;

import java.lang.System;

/**
 * Module where classes needed to create the [OnboardingFragment] are defined.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\tH!\u00a2\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH!\u00a2\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u000fH!\u00a2\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0012H!\u00a2\u0006\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/onboarding/OnboardingModule;", "", "()V", "bindOnboardingViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/onboarding/OnboardingViewModel;", "bindOnboardingViewModel$mobile_staging", "contributeOnboardingFragment", "Lcom/google/samples/apps/iosched/ui/onboarding/OnboardingFragment;", "contributeOnboardingFragment$mobile_staging", "contributeOnboardingSignInFragment", "Lcom/google/samples/apps/iosched/ui/onboarding/OnboardingSignInFragment;", "contributeOnboardingSignInFragment$mobile_staging", "contributeWelcomeDuringConferenceFragment", "Lcom/google/samples/apps/iosched/ui/onboarding/WelcomeDuringConferenceFragment;", "contributeWelcomeDuringConferenceFragment$mobile_staging", "contributeWelcomePreConferenceFragment", "Lcom/google/samples/apps/iosched/ui/onboarding/WelcomePreConferenceFragment;", "contributeWelcomePreConferenceFragment$mobile_staging", "mobile_staging"})
@dagger.Module()
public abstract class OnboardingModule {
    
    /**
     * Generates an [AndroidInjector] for the [OnboardingFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.onboarding.OnboardingFragment contributeOnboardingFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [WelcomePreConferenceFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.onboarding.WelcomePreConferenceFragment contributeWelcomePreConferenceFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [WelcomeDuringConferenceFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.onboarding.WelcomeDuringConferenceFragment contributeWelcomeDuringConferenceFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [OnboardingSignInFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.onboarding.OnboardingSignInFragment contributeOnboardingSignInFragment$mobile_staging();
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [OnboardingViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindOnboardingViewModel$mobile_staging(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel viewModel);
    
    public OnboardingModule() {
        super();
    }
}