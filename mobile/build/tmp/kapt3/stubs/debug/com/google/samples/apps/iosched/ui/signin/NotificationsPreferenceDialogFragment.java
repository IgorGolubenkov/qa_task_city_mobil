package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

/**
 * Dialog that asks for the user's notifications preference.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/NotificationsPreferenceDialogFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "notificationsPrefSaveActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;", "getNotificationsPrefSaveActionUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;", "setNotificationsPrefSaveActionUseCase", "(Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;)V", "notificationsPrefShownActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefShownActionUseCase;", "getNotificationsPrefShownActionUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefShownActionUseCase;", "setNotificationsPrefShownActionUseCase", "(Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefShownActionUseCase;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "Companion", "mobile_debug"})
public final class NotificationsPreferenceDialogFragment extends dagger.android.support.DaggerAppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase notificationsPrefSaveActionUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefShownActionUseCase notificationsPrefShownActionUseCase;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIALOG_NOTIFICATIONS_PREFERENCE = "dialog_notifications_preference";
    public static final com.google.samples.apps.iosched.ui.signin.NotificationsPreferenceDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase getNotificationsPrefSaveActionUseCase() {
        return null;
    }
    
    public final void setNotificationsPrefSaveActionUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefSaveActionUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefShownActionUseCase getNotificationsPrefShownActionUseCase() {
        return null;
    }
    
    public final void setNotificationsPrefShownActionUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefShownActionUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    public NotificationsPreferenceDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/NotificationsPreferenceDialogFragment$Companion;", "", "()V", "DIALOG_NOTIFICATIONS_PREFERENCE", "", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}