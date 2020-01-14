package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/MomentViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "Lcom/google/samples/apps/iosched/model/Moment;", "Lcom/google/samples/apps/iosched/ui/feed/MomentViewHolder;", "eventListener", "Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "userInfoLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "themeLiveData", "Lcom/google/samples/apps/iosched/model/Theme;", "(Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "bindViewHolder", "", "model", "viewHolder", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getFeedItemType", "", "mobile_debug"})
public final class MomentViewBinder extends com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<com.google.samples.apps.iosched.model.Moment, com.google.samples.apps.iosched.ui.feed.MomentViewHolder> {
    private final com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> userInfoLiveData = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> themeLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.feed.MomentViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment model, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.MomentViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public int getFeedItemType() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment newItem) {
        return false;
    }
    
    public MomentViewBinder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> userInfoLiveData, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> themeLiveData) {
        super(null);
    }
}