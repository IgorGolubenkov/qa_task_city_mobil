package com.google.samples.apps.iosched.ui.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/agenda/AgendaAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/google/samples/apps/iosched/model/Block;", "Lcom/google/samples/apps/iosched/ui/agenda/AgendaViewHolder;", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "(Lorg/threeten/bp/ZoneId;)V", "getTimeZoneId", "()Lorg/threeten/bp/ZoneId;", "setTimeZoneId", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "mobile_staging"})
public final class AgendaAdapter extends androidx.recyclerview.widget.ListAdapter<com.google.samples.apps.iosched.model.Block, com.google.samples.apps.iosched.ui.agenda.AgendaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private org.threeten.bp.ZoneId timeZoneId;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.agenda.AgendaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.agenda.AgendaViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZoneId getTimeZoneId() {
        return null;
    }
    
    public final void setTimeZoneId(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId p0) {
    }
    
    public AgendaAdapter(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId timeZoneId) {
        super(null);
    }
    
    public AgendaAdapter() {
        super(null);
    }
}