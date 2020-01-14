package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

/**
 * Encapsulates logic to create and bind a ViewHolder for a type of item in the Feed.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "M", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getModelClass", "()Ljava/lang/Class;", "bindViewHolder", "", "model", "viewHolder", "(Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getFeedItemType", "", "onViewDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "onViewRecycled", "mobile_staging"})
public abstract class FeedItemViewBinder<M extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.DiffUtil.ItemCallback<M> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<? extends M> modelClass = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.recyclerview.widget.RecyclerView.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent);
    
    public abstract void bindViewHolder(M model, @org.jetbrains.annotations.NotNull()
    VH viewHolder);
    
    public abstract int getFeedItemType();
    
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    VH viewHolder) {
    }
    
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    VH viewHolder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<? extends M> getModelClass() {
        return null;
    }
    
    public FeedItemViewBinder(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends M> modelClass) {
        super();
    }
}