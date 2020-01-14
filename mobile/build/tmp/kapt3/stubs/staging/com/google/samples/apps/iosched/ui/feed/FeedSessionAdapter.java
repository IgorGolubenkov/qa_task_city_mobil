package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

/**
 * Adapter which provides views for sessions inside the FeedSessionsContainer
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedSessionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "Lcom/google/samples/apps/iosched/ui/feed/FeedSessionItemViewHolder;", "eventListener", "Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "(Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;Lorg/threeten/bp/ZoneId;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "mobile_staging"})
public final class FeedSessionAdapter extends androidx.recyclerview.widget.ListAdapter<com.google.samples.apps.iosched.model.userdata.UserSession, com.google.samples.apps.iosched.ui.feed.FeedSessionItemViewHolder> {
    private final com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = null;
    private final org.threeten.bp.ZoneId timeZoneId = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.feed.FeedSessionItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedSessionItemViewHolder holder, int position) {
    }
    
    public FeedSessionAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId timeZoneId) {
        super(null);
    }
}