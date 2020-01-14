package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedSessionsViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedSessions;", "Lcom/google/samples/apps/iosched/ui/feed/FeedSessionsViewHolder;", "eventListener", "Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "recyclerViewManagerState", "Landroid/os/Parcelable;", "(Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;Landroid/os/Parcelable;)V", "getRecyclerViewManagerState", "()Landroid/os/Parcelable;", "setRecyclerViewManagerState", "(Landroid/os/Parcelable;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "bindViewHolder", "", "model", "viewHolder", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getFeedItemType", "", "onViewDetachedFromWindow", "onViewRecycled", "saveInstanceState", "mobile_debug"})
public final class FeedSessionsViewBinder extends com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<com.google.samples.apps.iosched.ui.feed.FeedSessions, com.google.samples.apps.iosched.ui.feed.FeedSessionsViewHolder> {
    private final com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = null;
    @org.jetbrains.annotations.Nullable()
    private android.os.Parcelable recyclerViewManagerState;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.feed.FeedSessionsViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessions model, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessionsViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public int getFeedItemType() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessions oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessions newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessions oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessions newItem) {
        return false;
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessionsViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessionsViewHolder viewHolder) {
    }
    
    public final void saveInstanceState(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessionsViewHolder viewHolder) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.Parcelable getRecyclerViewManagerState() {
        return null;
    }
    
    public final void setRecyclerViewManagerState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable p0) {
    }
    
    public FeedSessionsViewBinder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener, @org.jetbrains.annotations.Nullable()
    android.os.Parcelable recyclerViewManagerState) {
        super(null);
    }
}