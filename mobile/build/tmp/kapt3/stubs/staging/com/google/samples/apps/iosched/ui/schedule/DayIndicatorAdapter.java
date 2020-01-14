package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/DayIndicatorAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/google/samples/apps/iosched/ui/schedule/DayIndicator;", "Lcom/google/samples/apps/iosched/ui/schedule/DayIndicatorViewHolder;", "scheduleViewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "mobile_staging"})
public final class DayIndicatorAdapter extends androidx.recyclerview.widget.ListAdapter<com.google.samples.apps.iosched.ui.schedule.DayIndicator, com.google.samples.apps.iosched.ui.schedule.DayIndicatorViewHolder> {
    private final com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel scheduleViewModel = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.schedule.DayIndicatorViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.DayIndicatorViewHolder holder, int position) {
    }
    
    public DayIndicatorAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel scheduleViewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super(null);
    }
}