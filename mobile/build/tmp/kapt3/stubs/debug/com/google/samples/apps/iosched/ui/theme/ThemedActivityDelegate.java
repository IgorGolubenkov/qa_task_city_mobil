package com.google.samples.apps.iosched.ui.theme;

import java.lang.System;

/**
 * Interface to implement activity theming via a ViewModel.
 *
 * You can inject a implementation of this via Dagger2, then use the implementation as an interface
 * delegate to add the functionality without writing any code
 *
 * Example usage:
 * ```
 * class MyViewModel @Inject constructor(
 *    themedActivityDelegate: ThemedActivityDelegate
 * ) : ViewModel(), ThemedActivityDelegate by themedActivityDelegate {
 * ```
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/theme/ThemedActivityDelegate;", "", "currentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "getCurrentTheme", "()Lcom/google/samples/apps/iosched/model/Theme;", "theme", "Landroidx/lifecycle/LiveData;", "getTheme", "()Landroidx/lifecycle/LiveData;", "mobile_debug"})
public abstract interface ThemedActivityDelegate {
    
    /**
     * Allows observing of the current theme
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> getTheme();
    
    /**
     * Allows querying of the current theme synchronously
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.model.Theme getCurrentTheme();
}