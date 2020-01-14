package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

/**
 * Module that provides classes needed for reservations.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/ReservationModule;", "", "()V", "bindRemoveReservationViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationViewModel;", "contributeRemoveReservationDialogFragment", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogFragment;", "contributeRemoveReservationDialogFragment$mobile_debug", "contributeSwapReservationDialogFragment", "Lcom/google/samples/apps/iosched/ui/reservation/SwapReservationDialogFragment;", "contributeSwapReservationDialogFragment$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class ReservationModule {
    
    /**
     * Generates an [AndroidInjector] for the [RemoveReservationDialogFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogFragment contributeRemoveReservationDialogFragment$mobile_debug();
    
    /**
     * Generates an [AndroidInjector] for the [SwapReservationDialogFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.reservation.SwapReservationDialogFragment contributeSwapReservationDialogFragment$mobile_debug();
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindRemoveReservationViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel viewModel);
    
    public ReservationModule() {
        super();
    }
}