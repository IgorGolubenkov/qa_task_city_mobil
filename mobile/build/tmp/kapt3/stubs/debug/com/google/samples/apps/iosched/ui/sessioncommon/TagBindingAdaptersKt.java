package com.google.samples.apps.iosched.ui.sessioncommon;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007\u00a8\u0006\u000e"}, d2 = {"tagTint", "", "textView", "Landroid/widget/TextView;", "color", "", "tagTintOrDefault", "context", "Landroid/content/Context;", "topicTags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "Lcom/google/samples/apps/iosched/model/Tag;", "mobile_debug"})
public final class TagBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"topicTags"})
    public static final void topicTags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.google.samples.apps.iosched.model.Tag> topicTags) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tagTint"})
    public static final void tagTint(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int color) {
    }
    
    public static final int tagTintOrDefault(int color, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
}