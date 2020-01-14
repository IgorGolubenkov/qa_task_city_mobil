package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a \u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\u0007\u001a\u001a\u0010\u0011\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007\u001a$\u0010\u0017\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u0007\u00a8\u0006\u001a"}, d2 = {"bottomSheetState", "", "view", "Landroid/view/View;", "event", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "isIndoorEnabled", "mapView", "Lcom/google/android/gms/maps/MapView;", "", "(Lcom/google/android/gms/maps/MapView;Ljava/lang/Boolean;)V", "isMapToolbarEnabled", "mapCenter", "Lcom/google/android/gms/maps/CameraUpdate;", "mapStyle", "resId", "mapTileProvider", "mapVariant", "Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "mapViewport", "bounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "mapZoomLevels", "minZoomResId", "maxZoomResId", "mobile_staging"})
public final class MapViewBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"mapStyle"})
    public static final void mapStyle(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @androidx.annotation.RawRes()
    int resId) {
    }
    
    /**
     * Sets the map viewport to a specific rectangle specified by two Latitude/Longitude points.
     */
    @androidx.databinding.BindingAdapter(value = {"mapViewport"})
    public static final void mapViewport(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLngBounds bounds) {
    }
    
    /**
     * Sets the center of the map's camera. Call this every time the user selects a marker.
     */
    @androidx.databinding.BindingAdapter(value = {"mapCenter"})
    public static final void mapCenter(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate> event) {
    }
    
    /**
     * Sets the minimum zoom level of the map (how far out the user is allowed to zoom).
     */
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"mapMinZoom", "mapMaxZoom"})
    public static final void mapZoomLevels(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @androidx.annotation.DimenRes()
    int minZoomResId, @androidx.annotation.DimenRes()
    int maxZoomResId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isIndoorEnabled"})
    public static final void isIndoorEnabled(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isIndoorEnabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isMapToolbarEnabled"})
    public static final void isMapToolbarEnabled(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isMapToolbarEnabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mapTileProvider"})
    public static final void mapTileProvider(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.ui.map.MapVariant mapVariant) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bottomSheetState"})
    public static final void bottomSheetState(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer> event) {
    }
}