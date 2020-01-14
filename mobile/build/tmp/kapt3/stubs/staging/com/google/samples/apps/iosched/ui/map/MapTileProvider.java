package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapTileProvider;", "Lcom/google/android/gms/maps/model/UrlTileProvider;", "tileSize", "", "variant", "Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "(ILcom/google/samples/apps/iosched/ui/map/MapVariant;)V", "getTileUrl", "Ljava/net/URL;", "x", "y", "zoom", "Companion", "mobile_staging"})
public final class MapTileProvider extends com.google.android.gms.maps.model.UrlTileProvider {
    private final int tileSize = 0;
    private final com.google.samples.apps.iosched.ui.map.MapVariant variant = null;
    private static final java.lang.String BASE_URL = "https://storage.googleapis.com/io2019-festivus/images/maptiles/%s/%d/%d/%d_%d.png";
    private static final int BASE_TILE_SIZE = 256;
    public static final com.google.samples.apps.iosched.ui.map.MapTileProvider.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.URL getTileUrl(int x, int y, int zoom) {
        return null;
    }
    
    public MapTileProvider(int tileSize, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.map.MapVariant variant) {
        super(0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapTileProvider$Companion;", "", "()V", "BASE_TILE_SIZE", "", "BASE_URL", "", "forDensity", "Lcom/google/samples/apps/iosched/ui/map/MapTileProvider;", "densityDpi", "", "variant", "Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "mobile_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.map.MapTileProvider forDensity(float densityDpi, @org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.map.MapVariant variant) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}