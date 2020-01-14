package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "Lcom/google/samples/apps/iosched/ui/schedule/SessionViewHolder;", "eventListener", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;", "tagViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "showReservations", "Landroidx/lifecycle/LiveData;", "", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "mobile_debug"})
public final class ScheduleAdapter extends androidx.recyclerview.widget.ListAdapter<com.google.samples.apps.iosched.model.userdata.UserSession, com.google.samples.apps.iosched.ui.schedule.SessionViewHolder> {
    private final com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener eventListener = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagViewPool = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showReservations = null;
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.schedule.SessionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.SessionViewHolder holder, int position) {
    }
    
    public ScheduleAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener eventListener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagViewPool, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> showReservations, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super(null);
    }
}