package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * A [RecyclerView.ItemDecoration] which draws sticky headers for a given list of sessions.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J8\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u00192\u0006\u0010-\u001a\u00020\u0010H\u0002J \u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleTimeHeadersDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "sessions", "", "Lcom/google/samples/apps/iosched/model/Session;", "zoneId", "Lorg/threeten/bp/ZoneId;", "(Landroid/content/Context;Ljava/util/List;Lorg/threeten/bp/ZoneId;)V", "boldSpan", "Landroid/text/style/StyleSpan;", "meridiemFormatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "meridiemTextSize", "", "meridiemTextSizeSpan", "Landroid/text/style/AbsoluteSizeSpan;", "padding", "paint", "Landroid/text/TextPaint;", "timeFormatter", "timeSlots", "", "Landroid/text/StaticLayout;", "timeTextSize", "timeTextSizeSpan", "width", "createHeader", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "drawHeader", "", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "parentPadding", "header", "headerAlpha", "", "previousHasHeader", "", "findHeaderBeforePosition", "position", "onDrawOver", "c", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "mobile_staging"})
public final class ScheduleTimeHeadersDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final android.text.TextPaint paint = null;
    private final int width = 0;
    private final int padding = 0;
    private final int timeTextSize = 0;
    private final int meridiemTextSize = 0;
    private final org.threeten.bp.format.DateTimeFormatter timeFormatter = null;
    private final org.threeten.bp.format.DateTimeFormatter meridiemFormatter = null;
    private final android.text.style.AbsoluteSizeSpan timeTextSizeSpan = null;
    private final android.text.style.AbsoluteSizeSpan meridiemTextSizeSpan = null;
    private final android.text.style.StyleSpan boldSpan = null;
    private final java.util.Map<java.lang.Integer, android.text.StaticLayout> timeSlots = null;
    
    /**
     * Loop over each child and draw any corresponding headers i.e. items who's position is a key in
     * [timeSlots]. We also look back to see if there are any headers _before_ the first header we
     * found i.e. which needs to be sticky.
     */
    @java.lang.Override()
    public void onDrawOver(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final android.text.StaticLayout findHeaderBeforePosition(int position) {
        return null;
    }
    
    private final void drawHeader(android.graphics.Canvas canvas, android.view.View child, int parentPadding, android.text.StaticLayout header, float headerAlpha, boolean previousHasHeader) {
    }
    
    /**
     * Create a header layout for the given [startTime].
     */
    private final android.text.StaticLayout createHeader(org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    public ScheduleTimeHeadersDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Session> sessions, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId zoneId) {
        super();
    }
}