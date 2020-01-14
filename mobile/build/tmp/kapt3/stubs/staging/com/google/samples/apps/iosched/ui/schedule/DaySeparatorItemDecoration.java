package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/DaySeparatorItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "indexer", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "zoneId", "Lorg/threeten/bp/ZoneId;", "(Landroid/content/Context;Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;Lorg/threeten/bp/ZoneId;)V", "decorHeight", "", "labels", "Landroid/util/SparseArray;", "Landroid/text/StaticLayout;", "paint", "Landroid/text/TextPaint;", "textWidth", "verticalBias", "", "buildLabels", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "child", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "mobile_staging"})
public final class DaySeparatorItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final android.util.SparseArray<android.text.StaticLayout> labels = null;
    private final android.text.TextPaint paint = null;
    private final int textWidth = 0;
    private final int decorHeight = 0;
    private final float verticalBias = 0.0F;
    
    private final android.util.SparseArray<android.text.StaticLayout> buildLabels(android.content.Context context, com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer indexer, org.threeten.bp.ZoneId zoneId) {
        return null;
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    public DaySeparatorItemDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer indexer, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId zoneId) {
        super();
    }
}