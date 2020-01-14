package com.google.samples.apps.iosched.ui.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\b\bJ\r\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/ui/info/InfoFragmentsModule;", "", "()V", "contributeEventFragment", "Lcom/google/samples/apps/iosched/ui/info/EventFragment;", "contributeEventFragment$mobile_staging", "contributeFaqFragment", "Lcom/google/samples/apps/iosched/ui/info/FaqFragment;", "contributeFaqFragment$mobile_staging", "contributeTravelFragment", "Lcom/google/samples/apps/iosched/ui/info/TravelFragment;", "contributeTravelFragment$mobile_staging", "mobile_staging"})
@dagger.Module()
public abstract class InfoFragmentsModule {
    
    /**
     * Generates an [AndroidInjector] for the [EventFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.info.EventFragment contributeEventFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [TravelFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.info.TravelFragment contributeTravelFragment$mobile_staging();
    
    /**
     * Generates an [AndroidInjector] for the [FaqFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.ChildFragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.info.FaqFragment contributeFaqFragment$mobile_staging();
    
    public InfoFragmentsModule() {
        super();
    }
}