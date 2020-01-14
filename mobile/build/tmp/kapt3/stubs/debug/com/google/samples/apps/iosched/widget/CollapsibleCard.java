package com.google.samples.apps.iosched.widget;

import java.lang.System;

/**
 * Collapsible card, description of which can be HTML.
 * In that case, the text specified as "cardDescription" needs to be wrapped with <![CDATA[ ... ]]>
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CollapsibleCard;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardDescriptionView", "Landroid/widget/TextView;", "cardTitle", "", "cardTitleView", "expandIcon", "Landroid/widget/ImageView;", "expanded", "", "root", "Landroid/view/View;", "titleContainer", "toggle", "Landroid/transition/Transition;", "onRestoreInstanceState", "", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "setTitleContentDescription", "toggleExpanded", "SavedState", "mobile_debug"})
public final class CollapsibleCard extends android.widget.FrameLayout {
    private boolean expanded;
    private final android.widget.TextView cardTitleView = null;
    private final android.widget.TextView cardDescriptionView = null;
    private final android.widget.ImageView expandIcon = null;
    private final android.view.View titleContainer = null;
    private final android.transition.Transition toggle = null;
    private final android.view.View root = null;
    private final java.lang.String cardTitle = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void setTitleContentDescription(java.lang.String cardTitle) {
    }
    
    private final void toggleExpanded() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    public CollapsibleCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public CollapsibleCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CollapsibleCard(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CollapsibleCard$SavedState;", "Landroid/view/View$BaseSavedState;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "expanded", "", "getExpanded", "()Z", "setExpanded", "(Z)V", "writeToParcel", "", "out", "flags", "", "Companion", "mobile_debug"})
    public static final class SavedState extends android.view.View.BaseSavedState {
        private boolean expanded;
        @org.jetbrains.annotations.NotNull()
        public static final android.os.Parcelable.Creator<com.google.samples.apps.iosched.widget.CollapsibleCard.SavedState> CREATOR = null;
        public static final com.google.samples.apps.iosched.widget.CollapsibleCard.SavedState.Companion Companion = null;
        
        public final boolean getExpanded() {
            return false;
        }
        
        public final void setExpanded(boolean p0) {
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel out, int flags) {
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcel source) {
            super(null);
        }
        
        public SavedState(@org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CollapsibleCard$SavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/samples/apps/iosched/widget/CollapsibleCard$SavedState;", "mobile_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}