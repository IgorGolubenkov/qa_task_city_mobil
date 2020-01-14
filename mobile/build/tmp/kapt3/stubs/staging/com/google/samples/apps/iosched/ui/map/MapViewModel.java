package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010G\u001a\u00020HJ\t\u0010I\u001a\u00020HH\u0096\u0001J\t\u0010J\u001a\u00020HH\u0096\u0001J\u000b\u0010K\u001a\u0004\u0018\u00010+H\u0096\u0001J\u0010\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020+H\u0002J\t\u0010N\u001a\u000202H\u0096\u0001J\t\u0010O\u001a\u000202H\u0096\u0001J\u000e\u0010P\u001a\u00020H2\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020HJ\u000f\u0010T\u001a\b\u0012\u0004\u0012\u0002020\u001bH\u0096\u0001J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u0002020\u001bH\u0096\u0001J\u0006\u0010V\u001a\u00020HJ\u000e\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020.J\u0010\u0010Y\u001a\u00020H2\b\b\u0002\u0010Z\u001a\u000202J\u000e\u0010[\u001a\u00020H2\u0006\u0010M\u001a\u00020+J\u001c\u0010\\\u001a\u00020H2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0^H\u0002J\u000e\u0010_\u001a\u00020H2\u0006\u0010`\u001a\u00020\u0017J\u0010\u0010a\u001a\u00020H2\u0006\u0010X\u001a\u00020.H\u0002R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u001a\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001dR\u000e\u0010(\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u000e\u00101\u001a\u000202X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b7\u0010\u001dR\u001f\u00108\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u00170\u00170\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001dR\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202040\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u000f0\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8F\u00a2\u0006\u0006\u001a\u0004\bB\u0010\u001dR\u001e\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u000f0\u001bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bD\u0010\u001dR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u0002020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u001dR\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "loadGeoJsonFeaturesUseCase", "Lcom/google/samples/apps/iosched/ui/map/LoadGeoJsonFeaturesUseCase;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "signInViewModelDelegate", "optIntoMyLocationUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/OptIntoMyLocationUseCase;", "myLocationOptedInUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/MyLocationOptedInUseCase;", "(Lcom/google/samples/apps/iosched/ui/map/LoadGeoJsonFeaturesUseCase;Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/prefs/OptIntoMyLocationUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/MyLocationOptedInUseCase;)V", "_bottomSheetStateEvent", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_geoJsonLayer", "Lcom/google/maps/android/data/geojson/GeoJsonLayer;", "_mapCenterEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/android/gms/maps/CameraUpdate;", "_mapVariant", "Lcom/google/samples/apps/iosched/ui/map/MapVariant;", "_selectedMarkerInfo", "Lcom/google/samples/apps/iosched/ui/map/MarkerInfo;", "bottomSheetStateEvent", "Landroidx/lifecycle/LiveData;", "getBottomSheetStateEvent", "()Landroidx/lifecycle/LiveData;", "conferenceLocationBounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getConferenceLocationBounds", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "currentUserImageUri", "Landroid/net/Uri;", "getCurrentUserImageUri", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "currentZoomLevel", "featureLookup", "", "", "Lcom/google/maps/android/data/geojson/GeoJsonFeature;", "focusZoomLevel", "", "geoJsonLayer", "getGeoJsonLayer", "hasLoadedFeatures", "", "loadGeoJsonResult", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/ui/map/GeoJsonData;", "mapCenterEvent", "getMapCenterEvent", "mapVariant", "kotlin.jvm.PlatformType", "getMapVariant", "myLocationOptedIn", "performSignInEvent", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "requestedFeatureId", "selectedMarkerInfo", "getSelectedMarkerInfo", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showMyLocationOption", "getShowMyLocationOption", "dismissFeatureDetails", "", "emitSignInRequest", "emitSignOutRequest", "getUserId", "highlightFeature", "featureId", "isRegistered", "isSignedIn", "loadMapFeatures", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "logViewedMarkerDetails", "observeRegisteredUser", "observeSignedInUser", "onMapDestroyed", "onZoomChanged", "zoom", "optIntoMyLocation", "optIn", "requestHighlightFeature", "setMapFeatures", "features", "", "setMapVariant", "variant", "updateFeaturesVisiblity", "mobile_staging"})
public final class MapViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    
    /**
     * Area covered by the venue. Determines the viewport of the map.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.maps.model.LatLngBounds conferenceLocationBounds = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.ui.map.MapVariant> _mapVariant = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.map.MapVariant> mapVariant = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate>> _mapCenterEvent = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.ui.map.GeoJsonData>> loadGeoJsonResult = null;
    private final androidx.lifecycle.MediatorLiveData<com.google.maps.android.data.geojson.GeoJsonLayer> _geoJsonLayer = null;
    private final java.util.Map<java.lang.String, com.google.maps.android.data.geojson.GeoJsonFeature> featureLookup = null;
    private boolean hasLoadedFeatures;
    private java.lang.String requestedFeatureId;
    private final float focusZoomLevel = com.google.samples.apps.iosched.BuildConfig.MAP_CAMERA_FOCUS_ZOOM;
    private int currentZoomLevel;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer>> _bottomSheetStateEvent = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.ui.map.MarkerInfo> _selectedMarkerInfo = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> myLocationOptedIn = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showMyLocationOption = null;
    private final com.google.samples.apps.iosched.ui.map.LoadGeoJsonFeaturesUseCase loadGeoJsonFeaturesUseCase = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate = null;
    private final com.google.samples.apps.iosched.shared.domain.prefs.OptIntoMyLocationUseCase optIntoMyLocationUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLngBounds getConferenceLocationBounds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.map.MapVariant> getMapVariant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate>> getMapCenterEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.maps.android.data.geojson.GeoJsonLayer> getGeoJsonLayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer>> getBottomSheetStateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.map.MarkerInfo> getSelectedMarkerInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowMyLocationOption() {
        return null;
    }
    
    public final void optIntoMyLocation(boolean optIn) {
    }
    
    public final void setMapVariant(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.map.MapVariant variant) {
    }
    
    public final void onMapDestroyed() {
    }
    
    public final void loadMapFeatures(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void setMapFeatures(java.util.Map<java.lang.String, ? extends com.google.maps.android.data.geojson.GeoJsonFeature> features) {
    }
    
    public final void onZoomChanged(float zoom) {
    }
    
    private final void updateFeaturesVisiblity(float zoom) {
    }
    
    public final void requestHighlightFeature(@org.jetbrains.annotations.NotNull()
    java.lang.String featureId) {
    }
    
    private final void highlightFeature(java.lang.String featureId) {
    }
    
    public final void dismissFeatureDetails() {
    }
    
    public final void logViewedMarkerDetails() {
    }
    
    @javax.inject.Inject()
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.map.LoadGeoJsonFeaturesUseCase loadGeoJsonFeaturesUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.OptIntoMyLocationUseCase optIntoMyLocationUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.MyLocationOptedInUseCase myLocationOptedInUseCase) {
        super();
    }
    
    /**
     * Live updated value of the current firebase users image url
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    /**
     * Live updated value of the current firebase user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    /**
     * Emits Events when a sign-in event should be attempted
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    /**
     * Emits an non-null Event when the dialog to ask the user notifications preference should be
     * shown.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-in
     */
    @java.lang.Override()
    public void emitSignInRequest() {
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-out
     */
    @java.lang.Override()
    public void emitSignOutRequest() {
    }
    
    /**
     * Returns the current user ID or null if not available.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
}