package com.google.samples.apps.iosched.ui.prefs;

import java.lang.System;

/**
 * ViewModel for the dialog to ask the user whether they want to stop showing Snackbars.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/prefs/SnackbarPreferenceViewModel;", "Landroidx/lifecycle/ViewModel;", "stopSnackbarActionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/StopSnackbarActionUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/prefs/StopSnackbarActionUseCase;)V", "onStopClicked", "", "mobile_staging"})
public final class SnackbarPreferenceViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.samples.apps.iosched.shared.domain.prefs.StopSnackbarActionUseCase stopSnackbarActionUseCase = null;
    
    public final void onStopClicked() {
    }
    
    @javax.inject.Inject()
    public SnackbarPreferenceViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.StopSnackbarActionUseCase stopSnackbarActionUseCase) {
        super();
    }
}