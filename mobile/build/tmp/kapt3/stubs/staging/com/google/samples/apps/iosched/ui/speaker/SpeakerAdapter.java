package com.google.samples.apps.iosched.ui.speaker;

import java.lang.System;

/**
 * [RecyclerView.Adapter] for presenting a speaker details, composed of information about the
 * speaker and any sessions that the speaker presents.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/ui/speaker/SpeakerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/google/samples/apps/iosched/ui/speaker/SpeakerViewHolder;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "speakerViewModel", "Lcom/google/samples/apps/iosched/ui/speaker/SpeakerViewModel;", "tagRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "(Landroidx/lifecycle/LifecycleOwner;Lcom/google/samples/apps/iosched/ui/speaker/SpeakerViewModel;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "", "value", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "speakerSessions", "getSpeakerSessions", "()Ljava/util/List;", "setSpeakerSessions", "(Ljava/util/List;)V", "buildMergedList", "sessions", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "mobile_staging"})
public final class SpeakerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.samples.apps.iosched.ui.speaker.SpeakerViewHolder> {
    private final androidx.recyclerview.widget.AsyncListDiffer<java.lang.Object> differ = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> speakerSessions;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel speakerViewModel = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagRecycledViewPool = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> getSpeakerSessions() {
        return null;
    }
    
    public final void setSpeakerSessions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.speaker.SpeakerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.speaker.SpeakerViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * This adapter displays heterogeneous data types but `RecyclerView` & `AsyncListDiffer` deal in
     * a single list of items. We therefore combine them into a merged list, using marker objects
     * for static items. We still hold separate lists of [speakerSessions] so that
     * we can provide them individually, as they're loaded.
     */
    private final java.util.List<java.lang.Object> buildMergedList(java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> sessions) {
        return null;
    }
    
    public SpeakerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel speakerViewModel, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.RecycledViewPool tagRecycledViewPool) {
        super();
    }
}