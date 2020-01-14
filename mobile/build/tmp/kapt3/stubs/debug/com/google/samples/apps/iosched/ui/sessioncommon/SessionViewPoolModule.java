package com.google.samples.apps.iosched.ui.sessioncommon;

import java.lang.System;

/**
 * Provides [RecyclerView.RecycledViewPool]s to share views between [RecyclerView]s.
 * E.g. Between different days of the schedule.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessioncommon/SessionViewPoolModule;", "", "()V", "providesSessionViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "providesTagViewPool", "mobile_debug"})
@dagger.Module()
public final class SessionViewPoolModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "sessionViewPool")
    @dagger.Provides()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public final androidx.recyclerview.widget.RecyclerView.RecycledViewPool providesSessionViewPool() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "tagViewPool")
    @dagger.Provides()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public final androidx.recyclerview.widget.RecyclerView.RecycledViewPool providesTagViewPool() {
        return null;
    }
    
    public SessionViewPoolModule() {
        super();
    }
}