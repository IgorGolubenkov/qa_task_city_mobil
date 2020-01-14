package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * Copy of material lib's BottomSheetBehavior that includes some bug fixes.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 {*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004z{|}B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0012J\b\u0010D\u001a\u00020\u000bH\u0002J\b\u0010E\u001a\u00020BH\u0002J\u0010\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u00020\u000bH\u0002J\u0018\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000bH\u0002J\b\u0010K\u001a\u00020\u000bH\u0002J\b\u0010L\u001a\u00020MH\u0002J%\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010R\u001a\u00020SH\u0016\u00a2\u0006\u0002\u0010TJ%\u0010U\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010V\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010WJ5\u0010X\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010Z\u001a\u00020\u00022\u0006\u0010[\u001a\u00020M2\u0006\u0010\\\u001a\u00020MH\u0016\u00a2\u0006\u0002\u0010]JE\u0010^\u001a\u00020B2\u0006\u0010Y\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010Z\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010dJ%\u0010e\u001a\u00020B2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010:\u001a\u00020fH\u0016\u00a2\u0006\u0002\u0010gJ\u001d\u0010h\u001a\u00020f2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010iJ=\u0010j\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010k\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010mJ-\u0010n\u001a\u00020B2\u0006\u0010Y\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010Z\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010oJ%\u0010p\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00028\u00002\u0006\u0010R\u001a\u00020SH\u0016\u00a2\u0006\u0002\u0010TJ\u000e\u0010q\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0012J\b\u0010r\u001a\u00020BH\u0002J\u0010\u0010s\u001a\u00020B2\u0006\u0010:\u001a\u00020\u000bH\u0002J \u0010t\u001a\u00020B2\u0006\u0010u\u001a\u00020\u00022\u0006\u0010v\u001a\u00020M2\u0006\u0010w\u001a\u00020\u000eH\u0002J\u0018\u0010x\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u00022\u0006\u0010v\u001a\u00020MH\u0002J\u0018\u0010y\u001a\u00020B2\u0006\u0010Q\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR$\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR$\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u000e\u0010\'\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00100\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR*\u0010:\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\u0012\u0012\u0004\b;\u0010\u0004\u001a\u0004\b<\u00102\"\u0004\b=\u00104R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006~"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior;", "V", "Landroid/view/View;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "()V", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_peekHeight", "", "_state", "acceptTouches", "", "activePointerId", "callbacks", "", "Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$BottomSheetCallback;", "collapsedOffset", "dragCallback", "Landroidx/customview/widget/ViewDragHelper$Callback;", "dragHelper", "Landroidx/customview/widget/ViewDragHelper;", "fitToContentsOffset", "halfExpandedOffset", "initialTouchY", "isAnimationDisabled", "isAnimationDisabled$annotations", "()Z", "setAnimationDisabled", "(Z)V", "isDraggable", "setDraggable", "value", "isFitToContents", "setFitToContents", "isHideable", "setHideable", "lastPeekHeight", "lastTouchX", "lastTouchY", "maximumVelocity", "minimumVelocity", "nestedScrolled", "nestedScrollingChildRef", "Ljava/lang/ref/WeakReference;", "parentHeight", "peekHeight", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeightAuto", "peekHeightMin", "skipCollapsed", "getSkipCollapsed", "setSkipCollapsed", "state", "state$annotations", "getState", "setState", "velocityTracker", "Landroid/view/VelocityTracker;", "viewRef", "addBottomSheetCallback", "", "callback", "calculateCollapsedOffset", "clearNestedScroll", "dispatchOnSlide", "top", "exceedsTouchSlop", "p1", "p2", "getExpandedOffset", "getYVelocity", "", "onInterceptTouchEvent", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "event", "Landroid/view/MotionEvent;", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onLayoutChild", "layoutDirection", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z", "onNestedPreFling", "coordinatorLayout", "target", "velocityX", "velocityY", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "onNestedPreScroll", "dx", "dy", "consumed", "", "type", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "onRestoreInstanceState", "Landroid/os/Parcelable;", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V", "onSaveInstanceState", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;", "onStartNestedScroll", "directTargetChild", "axes", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "onTouchEvent", "removeBottomSheetCallback", "resetVelocityTracker", "setStateInternal", "settleBottomSheet", "sheet", "yVelocity", "isNestedScroll", "shouldHide", "startSettlingAnimation", "BottomSheetCallback", "Companion", "SavedState", "SettleRunnable", "mobile_staging"})
public final class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    
    /**
     * The current state of the bottom sheet, backing property
     */
    private int _state;
    
    /**
     * Whether to fit to contents. If false, the behavior will include [STATE_HALF_EXPANDED].
     */
    private boolean isFitToContents;
    
    /**
     * Real peek height in pixels
     */
    private int _peekHeight;
    
    /**
     * Whether the bottom sheet can be hidden.
     */
    private boolean isHideable;
    
    /**
     * Whether the bottom sheet can be dragged or not.
     */
    private boolean isDraggable;
    
    /**
     * Whether the bottom sheet should skip collapsed state after being expanded once.
     */
    private boolean skipCollapsed;
    
    /**
     * Whether animations should be disabled, to be used from UI tests.
     */
    private boolean isAnimationDisabled;
    
    /**
     * Whether or not to use automatic peek height
     */
    private boolean peekHeightAuto;
    
    /**
     * Minimum peek height allowed
     */
    private int peekHeightMin;
    
    /**
     * The last peek height calculated in onLayoutChild
     */
    private int lastPeekHeight;
    private int parentHeight;
    
    /**
     * Bottom sheet's top offset in [STATE_EXPANDED] state.
     */
    private int fitToContentsOffset;
    
    /**
     * Bottom sheet's top offset in [STATE_HALF_EXPANDED] state.
     */
    private int halfExpandedOffset;
    
    /**
     * Bottom sheet's top offset in [STATE_COLLAPSED] state.
     */
    private int collapsedOffset;
    
    /**
     * Keeps reference to the bottom sheet outside of Behavior callbacks
     */
    private java.lang.ref.WeakReference<android.view.View> viewRef;
    
    /**
     * Controls movement of the bottom sheet
     */
    private androidx.customview.widget.ViewDragHelper dragHelper;
    private int lastTouchX;
    private int lastTouchY;
    private int initialTouchY;
    private int activePointerId;
    private boolean acceptTouches;
    private int minimumVelocity;
    private int maximumVelocity;
    private android.view.VelocityTracker velocityTracker;
    private boolean nestedScrolled;
    private java.lang.ref.WeakReference<android.view.View> nestedScrollingChildRef;
    private final java.util.Set<com.google.samples.apps.iosched.widget.BottomSheetBehavior.BottomSheetCallback> callbacks = null;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback = null;
    
    /**
     * The bottom sheet is dragging.
     */
    public static final int STATE_DRAGGING = 1;
    
    /**
     * The bottom sheet is settling.
     */
    public static final int STATE_SETTLING = 2;
    
    /**
     * The bottom sheet is expanded.
     */
    public static final int STATE_EXPANDED = 3;
    
    /**
     * The bottom sheet is collapsed.
     */
    public static final int STATE_COLLAPSED = 4;
    
    /**
     * The bottom sheet is hidden.
     */
    public static final int STATE_HIDDEN = 5;
    
    /**
     * The bottom sheet is half-expanded (used when behavior_fitToContents is false).
     */
    public static final int STATE_HALF_EXPANDED = 6;
    
    /**
     * Peek at the 16:9 ratio keyline of its parent. This can be used as a parameter for
     * [setPeekHeight(Int)]. [getPeekHeight()] will return this when the value is set.
     */
    public static final int PEEK_HEIGHT_AUTO = -1;
    private static final float HIDE_THRESHOLD = 0.5F;
    private static final float HIDE_FRICTION = 0.1F;
    public static final com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion Companion = null;
    
    /**
     * The current state of the bottom sheet
     */
    @com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion.State()
    public static void state$annotations() {
    }
    
    public final int getState() {
        return 0;
    }
    
    public final void setState(@com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion.State()
    int value) {
    }
    
    public final boolean isFitToContents() {
        return false;
    }
    
    public final void setFitToContents(boolean value) {
    }
    
    public final int getPeekHeight() {
        return 0;
    }
    
    public final void setPeekHeight(int value) {
    }
    
    public final boolean isHideable() {
        return false;
    }
    
    public final void setHideable(boolean value) {
    }
    
    public final boolean isDraggable() {
        return false;
    }
    
    public final void setDraggable(boolean p0) {
    }
    
    public final boolean getSkipCollapsed() {
        return false;
    }
    
    public final void setSkipCollapsed(boolean p0) {
    }
    
    /**
     * Whether animations should be disabled, to be used from UI tests.
     */
    @androidx.annotation.VisibleForTesting()
    public static void isAnimationDisabled$annotations() {
    }
    
    public final boolean isAnimationDisabled() {
        return false;
    }
    
    public final void setAnimationDisabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    V child) {
        return null;
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    public final void addBottomSheetCallback(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.widget.BottomSheetBehavior.BottomSheetCallback callback) {
    }
    
    public final void removeBottomSheetCallback(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.widget.BottomSheetBehavior.BottomSheetCallback callback) {
    }
    
    private final void setStateInternal(@com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion.State()
    int state) {
    }
    
    @java.lang.Override()
    public boolean onLayoutChild(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    V child, int layoutDirection) {
        return false;
    }
    
    private final int calculateCollapsedOffset() {
        return 0;
    }
    
    private final int getExpandedOffset() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final void resetVelocityTracker() {
    }
    
    private final boolean exceedsTouchSlop(int p1, int p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int axes, int type) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull()
    int[] consumed, int type) {
    }
    
    @java.lang.Override()
    public void onStopNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int type) {
    }
    
    @java.lang.Override()
    public boolean onNestedPreFling(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    V child, @org.jetbrains.annotations.NotNull()
    android.view.View target, float velocityX, float velocityY) {
        return false;
    }
    
    private final void clearNestedScroll() {
    }
    
    private final float getYVelocity() {
        return 0.0F;
    }
    
    private final void settleBottomSheet(android.view.View sheet, float yVelocity, boolean isNestedScroll) {
    }
    
    private final boolean shouldHide(android.view.View child, float yVelocity) {
        return false;
    }
    
    private final void startSettlingAnimation(android.view.View child, int state) {
    }
    
    private final void dispatchOnSlide(int top) {
    }
    
    public BottomSheetBehavior() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"PrivateResource"})
    public BottomSheetBehavior(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
    
    /**
     * Utility to get the [BottomSheetBehavior] from a [view].
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.google.samples.apps.iosched.widget.BottomSheetBehavior<?> from(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    /**
     * Callback for monitoring events about bottom sheets.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$BottomSheetCallback;", "", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "mobile_staging"})
    public static abstract interface BottomSheetCallback {
        
        /**
         * Called when the bottom sheet changes its state.
         *
         * @param bottomSheet The bottom sheet view.
         * @param newState The new state. This will be one of link [STATE_DRAGGING],
         * [STATE_SETTLING], [STATE_EXPANDED], [STATE_COLLAPSED], [STATE_HIDDEN], or
         * [STATE_HALF_EXPANDED].
         */
        public abstract void onStateChanged(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, int newState);
        
        /**
         * Called when the bottom sheet is being dragged.
         *
         * @param bottomSheet The bottom sheet view.
         * @param slideOffset The new offset of this bottom sheet within [-1,1] range. Offset
         * increases as this bottom sheet is moving upward. From 0 to 1 the sheet is between
         * collapsed and expanded states and from -1 to 0 it is between hidden and collapsed states.
         */
        public abstract void onSlide(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, float slideOffset);
        
        /**
         * Callback for monitoring events about bottom sheets.
         */
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * Called when the bottom sheet changes its state.
             *
             * @param bottomSheet The bottom sheet view.
             * @param newState The new state. This will be one of link [STATE_DRAGGING],
             * [STATE_SETTLING], [STATE_EXPANDED], [STATE_COLLAPSED], [STATE_HIDDEN], or
             * [STATE_HALF_EXPANDED].
             */
            public static void onStateChanged(com.google.samples.apps.iosched.widget.BottomSheetBehavior.BottomSheetCallback $this, @org.jetbrains.annotations.NotNull()
            android.view.View bottomSheet, int newState) {
            }
            
            /**
             * Called when the bottom sheet is being dragged.
             *
             * @param bottomSheet The bottom sheet view.
             * @param slideOffset The new offset of this bottom sheet within [-1,1] range. Offset
             * increases as this bottom sheet is moving upward. From 0 to 1 the sheet is between
             * collapsed and expanded states and from -1 to 0 it is between hidden and collapsed states.
             */
            public static void onSlide(com.google.samples.apps.iosched.widget.BottomSheetBehavior.BottomSheetCallback $this, @org.jetbrains.annotations.NotNull()
            android.view.View bottomSheet, float slideOffset) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$SettleRunnable;", "Ljava/lang/Runnable;", "view", "Landroid/view/View;", "state", "", "(Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior;Landroid/view/View;I)V", "run", "", "mobile_staging"})
    final class SettleRunnable implements java.lang.Runnable {
        private final android.view.View view = null;
        private final int state = 0;
        
        @java.lang.Override()
        public void run() {
        }
        
        public SettleRunnable(@org.jetbrains.annotations.NotNull()
        android.view.View view, @com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion.State()
        int state) {
            super();
        }
    }
    
    /**
     * SavedState implementation
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B?\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\f\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$SavedState;", "Landroidx/customview/view/AbsSavedState;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "superState", "Landroid/os/Parcelable;", "state", "", "peekHeight", "isFitToContents", "", "isHideable", "skipCollapsed", "isDraggable", "(Landroid/os/Parcelable;IIZZZZ)V", "isDraggable$mobile_staging", "()Z", "isFitToContents$mobile_staging", "isHideable$mobile_staging", "getPeekHeight$mobile_staging", "()I", "getSkipCollapsed$mobile_staging", "state$annotations", "()V", "getState$mobile_staging", "writeToParcel", "", "dest", "flags", "Companion", "mobile_staging"})
    public static final class SavedState extends androidx.customview.view.AbsSavedState {
        private final int state = 0;
        private final int peekHeight = 0;
        private final boolean isFitToContents = false;
        private final boolean isHideable = false;
        private final boolean skipCollapsed = false;
        private final boolean isDraggable = false;
        @org.jetbrains.annotations.NotNull()
        public static final android.os.Parcelable.Creator<com.google.samples.apps.iosched.widget.BottomSheetBehavior.SavedState> CREATOR = null;
        public static final com.google.samples.apps.iosched.widget.BottomSheetBehavior.SavedState.Companion Companion = null;
        
        @com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion.State()
        public static void state$annotations() {
        }
        
        public final int getState$mobile_staging() {
            return 0;
        }
        
        public final int getPeekHeight$mobile_staging() {
            return 0;
        }
        
        public final boolean isFitToContents$mobile_staging() {
            return false;
        }
        
        public final boolean isHideable$mobile_staging() {
            return false;
        }
        
        public final boolean getSkipCollapsed$mobile_staging() {
            return false;
        }
        
        public final boolean isDraggable$mobile_staging() {
            return false;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel dest, int flags) {
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcel source) {
            super(null);
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcel source, @org.jetbrains.annotations.Nullable()
        java.lang.ClassLoader loader) {
            super(null);
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcelable superState, @com.google.samples.apps.iosched.widget.BottomSheetBehavior.Companion.State()
        int state, int peekHeight, boolean isFitToContents, boolean isHideable, boolean skipCollapsed, boolean isDraggable) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$SavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$SavedState;", "mobile_staging"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$Companion;", "", "()V", "HIDE_FRICTION", "", "HIDE_THRESHOLD", "PEEK_HEIGHT_AUTO", "", "STATE_COLLAPSED", "STATE_DRAGGING", "STATE_EXPANDED", "STATE_HALF_EXPANDED", "STATE_HIDDEN", "STATE_SETTLING", "from", "Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior;", "view", "Landroid/view/View;", "State", "mobile_staging"})
    public static final class Companion {
        
        /**
         * Utility to get the [BottomSheetBehavior] from a [view].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.widget.BottomSheetBehavior<?> from(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.IntDef(value = {1, 2, 3, 4, 5, 6})
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior$Companion$State;", "", "mobile_staging"})
        @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
        public static abstract @interface State {
        }
    }
}