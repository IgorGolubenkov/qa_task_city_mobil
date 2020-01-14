package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0015"}, d2 = {"createIconMarker", "Lcom/google/maps/android/data/geojson/GeoJsonPointStyle;", "context", "Landroid/content/Context;", "drawableRes", "", "title", "", "createLabelMarker", "iconGenerator", "Lcom/google/maps/android/ui/IconGenerator;", "drawableToBitmap", "Landroid/graphics/Bitmap;", "resId", "getDrawableResourceForIcon", "iconType", "getLabelIconGenerator", "processGeoJsonLayer", "", "layer", "Lcom/google/maps/android/data/geojson/GeoJsonLayer;", "mobile_staging"})
public final class MapUtilsKt {
    
    /**
     * Process a [GeoJsonLayer] for display on a Map.
     */
    public static final void processGeoJsonLayer(@org.jetbrains.annotations.NotNull()
    com.google.maps.android.data.geojson.GeoJsonLayer layer, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Creates a new IconGenerator for labels on the map.
     */
    private static final com.google.maps.android.ui.IconGenerator getLabelIconGenerator(android.content.Context context) {
        return null;
    }
    
    /**
     * Returns the drawable resource id for an icon marker, or 0 if no resource with this name exists.
     */
    @androidx.annotation.DrawableRes()
    public static final int getDrawableResourceForIcon(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String iconType) {
        return 0;
    }
    
    /**
     * Creates a GeoJsonPointStyle for a label.
     */
    private static final com.google.maps.android.data.geojson.GeoJsonPointStyle createLabelMarker(com.google.maps.android.ui.IconGenerator iconGenerator, java.lang.String title) {
        return null;
    }
    
    /**
     * Creates a GeoJsonPointStyle for a map icon. The icon is chosen based on the marker type and is
     * anchored at the bottom center of the marker's location.
     */
    private static final com.google.maps.android.data.geojson.GeoJsonPointStyle createIconMarker(android.content.Context context, int drawableRes, java.lang.String title) {
        return null;
    }
    
    /**
     * Convert a drawable resource to a Bitmap.
     */
    private static final android.graphics.Bitmap drawableToBitmap(android.content.Context context, @androidx.annotation.DrawableRes()
    int resId) {
        return null;
    }
}