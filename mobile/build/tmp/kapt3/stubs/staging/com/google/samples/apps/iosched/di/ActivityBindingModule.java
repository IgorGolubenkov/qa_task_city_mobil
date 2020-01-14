package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * We want Dagger.Android to create a Subcomponent which has a parent Component of whichever module
 * ActivityBindingModule is on, in our case that will be [AppComponent]. You never
 * need to tell [AppComponent] that it is going to have all these subcomponents
 * nor do you need to tell these subcomponents that [AppComponent] exists.
 * We are also telling Dagger.Android that this generated SubComponent needs to include the
 * specified modules and be aware of a scope annotation [@ActivityScoped].
 * When Dagger.Android annotation processor runs it will create 2 subcomponents for us.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\b\bJ\r\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH!\u00a2\u0006\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/di/ActivityBindingModule;", "", "()V", "launcherActivity", "Lcom/google/samples/apps/iosched/ui/LauncherActivity;", "launcherActivity$mobile_staging", "mainActivity", "Lcom/google/samples/apps/iosched/ui/MainActivity;", "mainActivity$mobile_staging", "onboardingActivity", "Lcom/google/samples/apps/iosched/ui/onboarding/OnboardingActivity;", "onboardingActivity$mobile_staging", "sessionDetailActivity", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailActivity;", "sessionDetailActivity$mobile_staging", "mobile_staging"})
@dagger.Module()
public abstract class ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.LaunchModule.class})
    @com.google.samples.apps.iosched.shared.di.ActivityScoped()
    public abstract com.google.samples.apps.iosched.ui.LauncherActivity launcherActivity$mobile_staging();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.onboarding.OnboardingModule.class, com.google.samples.apps.iosched.ui.signin.SignInDialogModule.class})
    @com.google.samples.apps.iosched.shared.di.ActivityScoped()
    public abstract com.google.samples.apps.iosched.ui.onboarding.OnboardingActivity onboardingActivity$mobile_staging();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.MainActivityModule.class, com.google.samples.apps.iosched.ui.agenda.AgendaModule.class, com.google.samples.apps.iosched.ui.codelabs.CodelabsModule.class, com.google.samples.apps.iosched.ui.feed.FeedModule.class, com.google.samples.apps.iosched.ui.info.InfoModule.class, com.google.samples.apps.iosched.ui.map.MapModule.class, com.google.samples.apps.iosched.ui.schedule.ScheduleModule.class, com.google.samples.apps.iosched.ui.search.SearchModule.class, com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailModule.class, com.google.samples.apps.iosched.ui.settings.SettingsModule.class, com.google.samples.apps.iosched.ui.speaker.SpeakerModule.class, com.google.samples.apps.iosched.ui.prefs.PreferenceModule.class, com.google.samples.apps.iosched.ui.reservation.ReservationModule.class, com.google.samples.apps.iosched.ui.prefs.PreferenceModule.class, com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackModule.class, com.google.samples.apps.iosched.ui.signin.SignInDialogModule.class, com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegateModule.class})
    @com.google.samples.apps.iosched.shared.di.ActivityScoped()
    public abstract com.google.samples.apps.iosched.ui.MainActivity mainActivity$mobile_staging();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailModule.class, com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackModule.class, com.google.samples.apps.iosched.ui.signin.SignInDialogModule.class, com.google.samples.apps.iosched.ui.reservation.ReservationModule.class, com.google.samples.apps.iosched.ui.prefs.PreferenceModule.class})
    @com.google.samples.apps.iosched.shared.di.ActivityScoped()
    public abstract com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity sessionDetailActivity$mobile_staging();
    
    public ActivityBindingModule() {
        super();
    }
}