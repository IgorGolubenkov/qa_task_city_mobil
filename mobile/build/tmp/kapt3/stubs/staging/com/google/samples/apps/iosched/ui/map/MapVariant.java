package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

/**
 * A variant of the map UI. Depending on the variant, Map UI may show different markers, tile
 * overlays, etc.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dBG\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u00a8\u0006\u001e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "", "start", "Lorg/threeten/bp/Instant;", "end", "labelResId", "", "iconResId", "markersResId", "styleResId", "mapTilePrefix", "", "(Ljava/lang/String;ILorg/threeten/bp/Instant;Lorg/threeten/bp/Instant;IIIILjava/lang/String;)V", "getEnd", "()Lorg/threeten/bp/Instant;", "getIconResId", "()I", "getLabelResId", "getMapTilePrefix", "()Ljava/lang/String;", "getMarkersResId", "getStart", "getStyleResId", "contains", "", "time", "AFTER_DARK", "CONCERT", "DAY", "Companion", "mobile_staging"})
public enum MapVariant {
    /*public static final*/ AFTER_DARK /* = new AFTER_DARK(null, null, 0, 0, 0, 0, null) */,
    /*public static final*/ CONCERT /* = new CONCERT(null, null, 0, 0, 0, 0, null) */,
    /*public static final*/ DAY /* = new DAY(null, null, 0, 0, 0, 0, null) */;
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.Instant start = null;
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.Instant end = null;
    private final int labelResId = 0;
    private final int iconResId = 0;
    private final int markersResId = 0;
    private final int styleResId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mapTilePrefix = null;
    public static final com.google.samples.apps.iosched.ui.map.MapVariant.Companion Companion = null;
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.Instant time) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.Instant getStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.Instant getEnd() {
        return null;
    }
    
    public final int getLabelResId() {
        return 0;
    }
    
    public final int getIconResId() {
        return 0;
    }
    
    public final int getMarkersResId() {
        return 0;
    }
    
    public final int getStyleResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMapTilePrefix() {
        return null;
    }
    
    MapVariant(org.threeten.bp.Instant start, org.threeten.bp.Instant end, @androidx.annotation.StringRes()
    int labelResId, @androidx.annotation.DrawableRes()
    int iconResId, @androidx.annotation.RawRes()
    int markersResId, @androidx.annotation.RawRes()
    int styleResId, java.lang.String mapTilePrefix) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapVariant$Companion;", "", "()V", "forTime", "Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "time", "Lorg/threeten/bp/Instant;", "mobile_staging"})
    public static final class Companion {
        
        /**
         * Returns the first variant containing the specified time, or [DAY] if none is found.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.map.MapVariant forTime(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.Instant time) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}