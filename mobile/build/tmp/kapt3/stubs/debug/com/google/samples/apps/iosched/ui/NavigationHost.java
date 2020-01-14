package com.google.samples.apps.iosched.ui;

import java.lang.System;

/**
 * To be implemented by components that host top-level navigation destinations.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/NavigationHost;", "", "registerToolbarWithNavigation", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "mobile_debug"})
public abstract interface NavigationHost {
    
    /**
     * Called by MainNavigationFragment to setup it's toolbar with the navigation controller.
     */
    public abstract void registerToolbarWithNavigation(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar);
}