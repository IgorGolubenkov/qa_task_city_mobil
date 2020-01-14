package com.google.samples.apps.iosched.ui.messages;

import java.lang.System;

/**
 * A single source of Snackbar messages related to reservations.
 *
 * Only shows one Snackbar related to one change across all screens
 *
 * Emits new values on request (when a Snackbar is dismissed and ready to show a new message)
 *
 * It keeps a list of [MAX_ITEMS] items, enough to figure out if a message has already been shown,
 * but limited to avoid wasting resources.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0006\u0010\u0010\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager;", "", "preferenceStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "(Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;)V", "messages", "", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/SnackbarMessage;", "result", "Landroidx/lifecycle/MutableLiveData;", "addMessage", "", "msg", "isSnackbarShouldBeIgnored", "", "loadNextMessage", "observeNextMessage", "Companion", "mobile_debug"})
@javax.inject.Singleton()
public class SnackbarMessageManager {
    private final java.util.List<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> messages = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> result = null;
    private final com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage = null;
    public static final int MAX_ITEMS = 10;
    public static final com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager.Companion Companion = null;
    
    public final void addMessage(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.SnackbarMessage msg) {
    }
    
    public final void loadNextMessage() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.SnackbarMessage>> observeNextMessage() {
        return null;
    }
    
    private final boolean isSnackbarShouldBeIgnored(com.google.samples.apps.iosched.ui.SnackbarMessage msg) {
        return false;
    }
    
    @javax.inject.Inject()
    public SnackbarMessageManager(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/messages/SnackbarMessageManager$Companion;", "", "()V", "MAX_ITEMS", "", "MAX_ITEMS$annotations", "mobile_debug"})
    public static final class Companion {
        
        @androidx.annotation.VisibleForTesting()
        public static void MAX_ITEMS$annotations() {
        }
        
        private Companion() {
            super();
        }
    }
}