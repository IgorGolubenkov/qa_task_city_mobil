package com.google.samples.apps.iosched.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/util/CrashlyticsTree;", "Ltimber/log/Timber$Tree;", "()V", "log", "", "priority", "", "tag", "", "message", "t", "", "Companion", "mobile_staging"})
public final class CrashlyticsTree extends timber.log.Timber.Tree {
    private static final java.lang.String CRASHLYTICS_KEY_PRIORITY = "priority";
    private static final java.lang.String CRASHLYTICS_KEY_TAG = "tag";
    private static final java.lang.String CRASHLYTICS_KEY_MESSAGE = "message";
    public static final com.google.samples.apps.iosched.util.CrashlyticsTree.Companion Companion = null;
    
    @java.lang.Override()
    protected void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    public CrashlyticsTree() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/util/CrashlyticsTree$Companion;", "", "()V", "CRASHLYTICS_KEY_MESSAGE", "", "CRASHLYTICS_KEY_PRIORITY", "CRASHLYTICS_KEY_TAG", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}