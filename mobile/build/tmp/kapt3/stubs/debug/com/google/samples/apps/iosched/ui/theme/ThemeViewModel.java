package com.google.samples.apps.iosched.ui.theme;

import java.lang.System;

/**
 * Thin ViewModel for themed Activities that don't have another ViewModel to use with
 * [ThemedActivityDelegate].
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/theme/ThemeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "themedActivityDelegate", "(Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;)V", "currentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "getCurrentTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "theme", "Landroidx/lifecycle/LiveData;", "getTheme", "()Landroidx/lifecycle/LiveData;", "mobile_debug"})
public final class ThemeViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate {
    
    @javax.inject.Inject()
    public ThemeViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate themedActivityDelegate) {
        super();
    }
    
    /**
     * Allows querying of the current theme synchronously
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.Theme getCurrentTheme() {
        return null;
    }
    
    /**
     * Allows observing of the current theme
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> getTheme() {
        return null;
    }
}