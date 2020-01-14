package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * Data model for the list.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/Question;", "", "key", "", "text", "", "currentRating", "labelStart", "labelEnd", "(Ljava/lang/String;IIII)V", "getCurrentRating", "()I", "getKey", "()Ljava/lang/String;", "getLabelEnd", "getLabelStart", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "mobile_staging"})
public final class Question {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    private final int text = 0;
    
    /**
     * 0 means unrated. Actual ratings are 1-5.
     */
    private final int currentRating = 0;
    private final int labelStart = 0;
    private final int labelEnd = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final int getText() {
        return 0;
    }
    
    /**
     * 0 means unrated. Actual ratings are 1-5.
     */
    public final int getCurrentRating() {
        return 0;
    }
    
    public final int getLabelStart() {
        return 0;
    }
    
    public final int getLabelEnd() {
        return 0;
    }
    
    public Question(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @androidx.annotation.StringRes()
    int text, @androidx.annotation.IntRange(from = 0L, to = 5L)
    int currentRating, @androidx.annotation.StringRes()
    int labelStart, @androidx.annotation.StringRes()
    int labelEnd) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    /**
     * 0 means unrated. Actual ratings are 1-5.
     */
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    /**
     * Data model for the list.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.sessiondetail.Question copy(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @androidx.annotation.StringRes()
    int text, @androidx.annotation.IntRange(from = 0L, to = 5L)
    int currentRating, @androidx.annotation.StringRes()
    int labelStart, @androidx.annotation.StringRes()
    int labelEnd) {
        return null;
    }
    
    /**
     * Data model for the list.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Data model for the list.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Data model for the list.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}