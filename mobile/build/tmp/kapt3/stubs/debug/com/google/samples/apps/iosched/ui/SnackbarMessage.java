package com.google.samples.apps.iosched.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\b\u0010!\u001a\u00020\bH\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "", "messageId", "", "actionId", "longDuration", "", "requestChangeId", "", "session", "Lcom/google/samples/apps/iosched/model/Session;", "(ILjava/lang/Integer;ZLjava/lang/String;Lcom/google/samples/apps/iosched/model/Session;)V", "getActionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLongDuration", "()Z", "getMessageId", "()I", "getRequestChangeId", "()Ljava/lang/String;", "getSession", "()Lcom/google/samples/apps/iosched/model/Session;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;ZLjava/lang/String;Lcom/google/samples/apps/iosched/model/Session;)Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "equals", "other", "hashCode", "toString", "mobile_debug"})
public final class SnackbarMessage {
    
    /**
     * Resource string ID of the message to show
     */
    private final int messageId = 0;
    
    /**
     * Optional resource string ID for the action (example: "Got it!")
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer actionId = null;
    
    /**
     * Set to true for a Snackbar with long duration
     */
    private final boolean longDuration = false;
    
    /**
     * Optional change ID to avoid repetition of messages
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String requestChangeId = null;
    
    /**
     * Optional session
     */
    @org.jetbrains.annotations.Nullable()
    private final com.google.samples.apps.iosched.model.Session session = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Resource string ID of the message to show
     */
    public final int getMessageId() {
        return 0;
    }
    
    /**
     * Optional resource string ID for the action (example: "Got it!")
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getActionId() {
        return null;
    }
    
    /**
     * Set to true for a Snackbar with long duration
     */
    public final boolean getLongDuration() {
        return false;
    }
    
    /**
     * Optional change ID to avoid repetition of messages
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRequestChangeId() {
        return null;
    }
    
    /**
     * Optional session
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.model.Session getSession() {
        return null;
    }
    
    public SnackbarMessage(int messageId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer actionId, boolean longDuration, @org.jetbrains.annotations.Nullable()
    java.lang.String requestChangeId, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session session) {
        super();
    }
    
    /**
     * Resource string ID of the message to show
     */
    public final int component1() {
        return 0;
    }
    
    /**
     * Optional resource string ID for the action (example: "Got it!")
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    /**
     * Set to true for a Snackbar with long duration
     */
    public final boolean component3() {
        return false;
    }
    
    /**
     * Optional change ID to avoid repetition of messages
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Optional session
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.model.Session component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.SnackbarMessage copy(int messageId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer actionId, boolean longDuration, @org.jetbrains.annotations.Nullable()
    java.lang.String requestChangeId, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session session) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}