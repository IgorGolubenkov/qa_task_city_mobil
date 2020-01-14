package com.google.samples.apps.iosched.ui.ar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/ui/ar/ArCoreAvailabilityLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/google/ar/core/ArCoreApk$Availability;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "checkerRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "onActive", "", "onInactive", "Companion", "mobile_debug"})
public final class ArCoreAvailabilityLiveData extends androidx.lifecycle.LiveData<com.google.ar.core.ArCoreApk.Availability> {
    private final android.content.Context appContext = null;
    private final android.os.Handler handler = null;
    private final java.lang.Runnable checkerRunnable = null;
    private static final long INTERVAL_SECOND = 1L;
    public static final com.google.samples.apps.iosched.ui.ar.ArCoreAvailabilityLiveData.Companion Companion = null;
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    public ArCoreAvailabilityLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/ui/ar/ArCoreAvailabilityLiveData$Companion;", "", "()V", "INTERVAL_SECOND", "", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}