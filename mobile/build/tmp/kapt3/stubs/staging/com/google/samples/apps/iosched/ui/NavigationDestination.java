package com.google.samples.apps.iosched.ui;

import java.lang.System;

/**
 * To be implemented by main navigation destinations shown by a [NavigationHost].
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/ui/NavigationDestination;", "", "onUserInteraction", "", "mobile_staging"})
public abstract interface NavigationDestination {
    
    /**
     * Called by the host when the user interacts with it.
     */
    public abstract void onUserInteraction();
    
    /**
     * To be implemented by main navigation destinations shown by a [NavigationHost].
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Called by the host when the user interacts with it.
         */
        public static void onUserInteraction(com.google.samples.apps.iosched.ui.NavigationDestination $this) {
        }
    }
}