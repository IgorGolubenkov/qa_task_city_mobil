package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/AnnouncementsEmptyViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/AnnouncementsEmpty;", "Lcom/google/samples/apps/iosched/ui/feed/EmptyViewHolder;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "bindViewHolder", "", "model", "viewHolder", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "getFeedItemType", "", "mobile_staging"})
public final class AnnouncementsEmptyViewBinder extends com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<com.google.samples.apps.iosched.ui.feed.AnnouncementsEmpty, com.google.samples.apps.iosched.ui.feed.EmptyViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsEmpty model, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.EmptyViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public int getFeedItemType() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsEmpty oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsEmpty newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsEmpty oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsEmpty newItem) {
        return false;
    }
    
    public AnnouncementsEmptyViewBinder() {
        super(null);
    }
}