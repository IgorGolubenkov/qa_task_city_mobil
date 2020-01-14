package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/SessionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemSessionBinding;", "eventListener", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;", "showReservations", "Landroidx/lifecycle/LiveData;", "", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lcom/google/samples/apps/iosched/databinding/ItemSessionBinding;Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;)V", "bind", "", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "mobile_debug"})
public final class SessionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.google.samples.apps.iosched.databinding.ItemSessionBinding binding = null;
    private final com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener eventListener = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showReservations = null;
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    public SessionViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.databinding.ItemSessionBinding binding, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener eventListener, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> showReservations, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super(null);
    }
}