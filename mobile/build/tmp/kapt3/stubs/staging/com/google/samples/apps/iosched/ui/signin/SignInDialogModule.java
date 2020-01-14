package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

/**
 * Module that defines the child fragments related to sign in/out.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/SignInDialogModule;", "", "()V", "bindSignInViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModel;", "contributeNotificationsPreferenceDialogFragment", "Lcom/google/samples/apps/iosched/ui/signin/NotificationsPreferenceDialogFragment;", "contributeNotificationsPreferenceDialogFragment$mobile_staging", "contributeSignInDialogFragment", "Lcom/google/samples/apps/iosched/ui/signin/SignInDialogFragment;", "contributeSignInDialogFragment$mobile_staging", "contributeSignOutDialogFragment", "Lcom/google/samples/apps/iosched/ui/signin/SignOutDialogFragment;", "contributeSignOutDialogFragment$mobile_staging", "mobile_staging"})
@dagger.Module()
public abstract class SignInDialogModule {
    
    /**
     * Generates an [AndroidInjector] for the [SignInDialogFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.signin.SignInDialogFragment contributeSignInDialogFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [SignOutDialogFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.signin.SignOutDialogFragment contributeSignOutDialogFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [NotificationsPreferenceDialogFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment contributeNotificationsPreferenceDialogFragment$mobile_staging();
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [SignInViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.signin.SignInViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSignInViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModel viewModel);
    
    public SignInDialogModule() {
        super();
    }
}