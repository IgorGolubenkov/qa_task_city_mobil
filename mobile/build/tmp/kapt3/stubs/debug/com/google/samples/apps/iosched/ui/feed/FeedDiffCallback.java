package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012.\u0010\u0003\u001a*\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005j\u0002`\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0004\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R6\u0010\u0003\u001a*\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005j\u0002`\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "viewBinders", "", "Ljava/lang/Class;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemClass;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemBinder;", "(Ljava/util/Map;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "mobile_debug"})
public final class FeedDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.Object> {
    private final java.util.Map<java.lang.Class<? extends java.lang.Object>, com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<java.lang.Object, androidx.recyclerview.widget.RecyclerView.ViewHolder>> viewBinders = null;
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    java.lang.Object oldItem, @org.jetbrains.annotations.NotNull()
    java.lang.Object newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    java.lang.Object oldItem, @org.jetbrains.annotations.NotNull()
    java.lang.Object newItem) {
        return false;
    }
    
    public FeedDiffCallback(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends java.lang.Object>, ? extends com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<java.lang.Object, ? super androidx.recyclerview.widget.RecyclerView.ViewHolder>> viewBinders) {
        super();
    }
}