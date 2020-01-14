package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

/**
 * Use case that loads a GeoJsonLayer and its features.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/LoadGeoJsonFeaturesUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/GoogleMap;", "", "Lcom/google/samples/apps/iosched/ui/map/LoadGeoJsonParams;", "Lcom/google/samples/apps/iosched/ui/map/GeoJsonData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildFeatureMap", "", "", "Lcom/google/maps/android/data/geojson/GeoJsonFeature;", "layer", "Lcom/google/maps/android/data/geojson/GeoJsonLayer;", "execute", "parameters", "mobile_debug"})
public final class LoadGeoJsonFeaturesUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<kotlin.Pair<? extends com.google.android.gms.maps.GoogleMap, ? extends java.lang.Integer>, com.google.samples.apps.iosched.ui.map.GeoJsonData> {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.samples.apps.iosched.ui.map.GeoJsonData execute(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.google.android.gms.maps.GoogleMap, java.lang.Integer> parameters) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, com.google.maps.android.data.geojson.GeoJsonFeature> buildFeatureMap(com.google.maps.android.data.geojson.GeoJsonLayer layer) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadGeoJsonFeaturesUseCase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}