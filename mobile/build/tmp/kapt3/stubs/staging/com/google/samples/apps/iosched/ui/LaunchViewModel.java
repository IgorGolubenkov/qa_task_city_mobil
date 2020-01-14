package com.google.samples.apps.iosched.ui;

import java.lang.System;

/**
 * Logic for determining which screen to send users to on app launch.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/ui/LaunchViewModel;", "Landroidx/lifecycle/ViewModel;", "onboardingCompletedUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/OnboardingCompletedUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/prefs/OnboardingCompletedUseCase;)V", "launchDestination", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/LaunchDestination;", "getLaunchDestination", "()Landroidx/lifecycle/LiveData;", "onboardingCompletedResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "mobile_staging"})
public final class LaunchViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> onboardingCompletedResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.LaunchDestination>> launchDestination = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.LaunchDestination>> getLaunchDestination() {
        return null;
    }
    
    @javax.inject.Inject()
    public LaunchViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompletedUseCase onboardingCompletedUseCase) {
        super();
    }
}