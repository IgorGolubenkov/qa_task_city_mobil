package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/AnnouncementViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "Lcom/google/samples/apps/iosched/model/Announcement;", "Lcom/google/samples/apps/iosched/ui/feed/AnnouncementViewHolder;", "timeZoneId", "Landroidx/lifecycle/LiveData;", "Lorg/threeten/bp/ZoneId;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "bindViewHolder", "", "model", "viewHolder", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getFeedItemType", "", "mobile_staging"})
public final class AnnouncementViewBinder extends com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<com.google.samples.apps.iosched.model.Announcement, com.google.samples.apps.iosched.ui.feed.AnnouncementViewHolder> {
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.feed.AnnouncementViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Announcement model, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public int getFeedItemType() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Announcement oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Announcement newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Announcement oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Announcement newItem) {
        return false;
    }
    
    public AnnouncementViewBinder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super(null);
    }
}