package com.google.samples.apps.iosched.ui;

import java.lang.System;

/**
 * Fragment representing a main navigation destination. This class handles wiring up the [Toolbar]
 * navigation icon if the fragment is attached to a [NavigationHost].
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/google/samples/apps/iosched/ui/NavigationDestination;", "()V", "navigationHost", "Lcom/google/samples/apps/iosched/ui/NavigationHost;", "getNavigationHost", "()Lcom/google/samples/apps/iosched/ui/NavigationHost;", "setNavigationHost", "(Lcom/google/samples/apps/iosched/ui/NavigationHost;)V", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "mobile_staging"})
public class MainNavigationFragment extends dagger.android.support.DaggerFragment implements com.google.samples.apps.iosched.ui.NavigationDestination {
    @org.jetbrains.annotations.Nullable()
    private com.google.samples.apps.iosched.ui.NavigationHost navigationHost;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final com.google.samples.apps.iosched.ui.NavigationHost getNavigationHost() {
        return null;
    }
    
    protected final void setNavigationHost(@org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.ui.NavigationHost p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MainNavigationFragment() {
        super();
    }
    
    /**
     * Called by the host when the user interacts with it.
     */
    public void onUserInteraction() {
    }
}