package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapVariantAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/google/samples/apps/iosched/ui/map/MapVariantViewHolder;", "callback", "Lkotlin/Function1;", "Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "currentSelection", "getCurrentSelection", "()Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "setCurrentSelection", "(Lcom/google/samples/apps/iosched/ui/map/MapVariant;)V", "items", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "mobile_debug"})
public final class MapVariantAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.samples.apps.iosched.ui.map.MapVariantViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.google.samples.apps.iosched.ui.map.MapVariant currentSelection;
    private final java.util.List<com.google.samples.apps.iosched.ui.map.MapVariant> items = null;
    private final kotlin.jvm.functions.Function1<com.google.samples.apps.iosched.ui.map.MapVariant, kotlin.Unit> callback = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.ui.map.MapVariant getCurrentSelection() {
        return null;
    }
    
    public final void setCurrentSelection(@org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.ui.map.MapVariant value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.map.MapVariantViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.map.MapVariantViewHolder holder, int position) {
    }
    
    public MapVariantAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.samples.apps.iosched.ui.map.MapVariant, kotlin.Unit> callback) {
        super();
    }
}