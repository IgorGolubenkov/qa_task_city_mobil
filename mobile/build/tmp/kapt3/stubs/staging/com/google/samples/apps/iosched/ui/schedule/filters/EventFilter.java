package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0002\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "", "isChecked", "", "(Z)V", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "getColor", "", "getFilterCategory", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$EventFilterCategory;", "getSelectedTextColor", "getShortText", "", "getShortTextResId", "getText", "getTextResId", "EventFilterCategory", "MyEventsFilter", "TagFilter", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$MyEventsFilter;", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$TagFilter;", "mobile_staging"})
public abstract class EventFilter {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isChecked = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isChecked() {
        return null;
    }
    
    /**
     * Determines the category heading to show in the filters sheet.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.ui.schedule.filters.EventFilter.EventFilterCategory getFilterCategory();
    
    /**
     * Return the background color when filled.
     */
    public abstract int getColor();
    
    /**
     * Return a color to use when the filter is selected, or TRANSPARENT to use the default.
     */
    public int getSelectedTextColor() {
        return 0;
    }
    
    /**
     * Return a string resource to display, or 0 to use the value of [getText].
     */
    public int getTextResId() {
        return 0;
    }
    
    /**
     * Return a string to display when [getTextResId] returns 0.
     */
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getText() {
        return null;
    }
    
    /**
     * Return a short string resource to display, or 0 to use the value of [getShortText].
     */
    public int getShortTextResId() {
        return 0;
    }
    
    /**
     * Return a short string string to display when [getShortTextResId] returns 0.
     */
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getShortText() {
        return null;
    }
    
    private EventFilter(boolean isChecked) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$EventFilterCategory;", "", "labelResId", "", "(Ljava/lang/String;II)V", "getLabelResId", "()I", "NONE", "TOPICS", "EVENT_TYPES", "mobile_staging"})
    public static enum EventFilterCategory {
        /*public static final*/ NONE /* = new NONE(0) */,
        /*public static final*/ TOPICS /* = new TOPICS(0) */,
        /*public static final*/ EVENT_TYPES /* = new EVENT_TYPES(0) */;
        private final int labelResId = 0;
        
        public final int getLabelResId() {
            return 0;
        }
        
        EventFilterCategory(@androidx.annotation.StringRes()
        int labelResId) {
        }
    }
    
    /**
     * Filter for user's starred and reserved events.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$MyEventsFilter;", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "isChecked", "", "(Z)V", "equals", "other", "", "getColor", "", "getFilterCategory", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$EventFilterCategory;", "getSelectedTextColor", "getShortTextResId", "getTextResId", "hashCode", "mobile_staging"})
    public static final class MyEventsFilter extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.google.samples.apps.iosched.ui.schedule.filters.EventFilter.EventFilterCategory getFilterCategory() {
            return null;
        }
        
        @java.lang.Override()
        public int getColor() {
            return 0;
        }
        
        @java.lang.Override()
        public int getSelectedTextColor() {
            return 0;
        }
        
        @java.lang.Override()
        public int getTextResId() {
            return 0;
        }
        
        @java.lang.Override()
        public int getShortTextResId() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public MyEventsFilter(boolean isChecked) {
            super(false);
        }
    }
    
    /**
     * Filter for event tags.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$TagFilter;", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "tag", "Lcom/google/samples/apps/iosched/model/Tag;", "isChecked", "", "(Lcom/google/samples/apps/iosched/model/Tag;Z)V", "getTag", "()Lcom/google/samples/apps/iosched/model/Tag;", "equals", "other", "", "getColor", "", "getFilterCategory", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter$EventFilterCategory;", "getSelectedTextColor", "getShortText", "", "getShortTextResId", "getText", "getTextResId", "hashCode", "isUiContentEqual", "mobile_staging"})
    public static final class TagFilter extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.model.Tag tag = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.google.samples.apps.iosched.ui.schedule.filters.EventFilter.EventFilterCategory getFilterCategory() {
            return null;
        }
        
        @java.lang.Override()
        public int getColor() {
            return 0;
        }
        
        @java.lang.Override()
        public int getSelectedTextColor() {
            return 0;
        }
        
        @java.lang.Override()
        public int getTextResId() {
            return 0;
        }
        
        @java.lang.Override()
        public int getShortTextResId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getShortText() {
            return null;
        }
        
        /**
         * Only the tag is used for equality.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Only the tag is used for equality.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        public final boolean isUiContentEqual(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.schedule.filters.EventFilter.TagFilter other) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.model.Tag getTag() {
            return null;
        }
        
        public TagFilter(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.model.Tag tag, boolean isChecked) {
            super(false);
        }
    }
}