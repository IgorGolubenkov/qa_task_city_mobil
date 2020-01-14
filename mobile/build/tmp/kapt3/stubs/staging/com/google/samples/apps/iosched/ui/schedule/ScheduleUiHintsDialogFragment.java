package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * Dialog that shows the hints for the schedule.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleUiHintsDialogFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "markScheduleUiHintsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/MarkScheduleUiHintsShownUseCase;", "getMarkScheduleUiHintsShownUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/prefs/MarkScheduleUiHintsShownUseCase;", "setMarkScheduleUiHintsShownUseCase", "(Lcom/google/samples/apps/iosched/shared/domain/prefs/MarkScheduleUiHintsShownUseCase;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "mobile_staging"})
public final class ScheduleUiHintsDialogFragment extends dagger.android.support.DaggerAppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.prefs.MarkScheduleUiHintsShownUseCase markScheduleUiHintsShownUseCase;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.prefs.MarkScheduleUiHintsShownUseCase getMarkScheduleUiHintsShownUseCase() {
        return null;
    }
    
    public final void setMarkScheduleUiHintsShownUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.MarkScheduleUiHintsShownUseCase p0) {
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
    
    public ScheduleUiHintsDialogFragment() {
        super();
    }
}