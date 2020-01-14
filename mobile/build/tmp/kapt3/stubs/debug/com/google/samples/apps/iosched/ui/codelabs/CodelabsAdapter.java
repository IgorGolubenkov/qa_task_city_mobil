package com.google.samples.apps.iosched.ui.codelabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000bJ\u0018\u0010 \u001a\u00020\u00112\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsViewHolder;", "codelabsActionsHandler", "Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsActionsHandler;", "tagViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "isMapEnabled", "", "savedState", "Landroid/os/Bundle;", "(Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsActionsHandler;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;ZLandroid/os/Bundle;)V", "expandedIds", "", "", "bindCodelabItemHolder", "", "holder", "Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsViewHolder$CodelabItemHolder;", "item", "Lcom/google/samples/apps/iosched/model/Codelab;", "getItemViewType", "", "position", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSaveInstanceState", "state", "submitList", "list", "", "Companion", "mobile_debug"})
public final class CodelabsAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.Object, com.google.samples.apps.iosched.ui.codelabs.CodelabsViewHolder> {
    private java.util.Set<java.lang.String> expandedIds;
    private final com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler codelabsActionsHandler = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagViewPool = null;
    private final boolean isMapEnabled = false;
    private static final java.lang.String STATE_KEY_EXPANDED_IDS = "CodelabsAdapter:expandedIds";
    public static final com.google.samples.apps.iosched.ui.codelabs.CodelabsAdapter.Companion Companion = null;
    
    public final void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle state) {
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> list) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.codelabs.CodelabsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.codelabs.CodelabsViewHolder holder, int position) {
    }
    
    private final void bindCodelabItemHolder(com.google.samples.apps.iosched.ui.codelabs.CodelabsViewHolder.CodelabItemHolder holder, com.google.samples.apps.iosched.model.Codelab item) {
    }
    
    public CodelabsAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler codelabsActionsHandler, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagViewPool, boolean isMapEnabled, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedState) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsAdapter$Companion;", "", "()V", "STATE_KEY_EXPANDED_IDS", "", "mobile_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}