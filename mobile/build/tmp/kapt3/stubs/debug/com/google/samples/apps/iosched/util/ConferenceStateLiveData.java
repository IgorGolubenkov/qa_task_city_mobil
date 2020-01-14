package com.google.samples.apps.iosched.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/util/ConferenceStateLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/util/ConferenceState;", "handler", "Lcom/google/samples/apps/iosched/shared/domain/internal/IOSchedHandler;", "timeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "(Lcom/google/samples/apps/iosched/shared/domain/internal/IOSchedHandler;Lcom/google/samples/apps/iosched/shared/time/TimeProvider;)V", "updateRunnable", "Ljava/lang/Runnable;", "checkTime", "", "onActive", "onInactive", "mobile_debug"})
public final class ConferenceStateLiveData extends androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.util.ConferenceState> {
    private final java.lang.Runnable updateRunnable = null;
    private final com.google.samples.apps.iosched.shared.domain.internal.IOSchedHandler handler = null;
    private final com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider = null;
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    private final void checkTime() {
    }
    
    @javax.inject.Inject()
    public ConferenceStateLiveData(@org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainThreadHandler()
    com.google.samples.apps.iosched.shared.domain.internal.IOSchedHandler handler, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider) {
        super(null);
    }
}