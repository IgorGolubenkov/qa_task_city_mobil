package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 A2\u00020\u0001:\u0002ABB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J-\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u000e2\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\b\u00103\u001a\u00020\u001cH\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u0012H\u0016J\b\u00106\u001a\u00020\u001cH\u0016J\b\u00107\u001a\u00020\u001cH\u0016J\u001a\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020#2\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010:\u001a\u00020\u001cH\u0002J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020@H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006C"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapFragment;", "Lcom/google/samples/apps/iosched/ui/MainNavigationFragment;", "()V", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "getAnalyticsHelper", "()Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "setAnalyticsHelper", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;)V", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentMapBinding;", "bottomSheetBehavior", "Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior;", "fabBaseMarginBottom", "", "mapView", "Lcom/google/android/gms/maps/MapView;", "mapViewBundle", "Landroid/os/Bundle;", "viewModel", "Lcom/google/samples/apps/iosched/ui/map/MapViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "enableMyLocation", "", "requestPermission", "", "onBackPressed", "onCreate", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onLowMemory", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "requestLocationPermission", "updateInfoSheet", "markerInfo", "Lcom/google/samples/apps/iosched/ui/map/MarkerInfo;", "updateMarkers", "geoJsonLayer", "Lcom/google/maps/android/data/geojson/GeoJsonLayer;", "Companion", "MyLocationRationaleFragment", "mobile_staging"})
public final class MapFragment extends com.google.samples.apps.iosched.ui.MainNavigationFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper;
    private com.google.samples.apps.iosched.ui.map.MapViewModel viewModel;
    private android.os.Bundle mapViewBundle;
    private com.google.android.gms.maps.MapView mapView;
    private com.google.samples.apps.iosched.databinding.FragmentMapBinding binding;
    private com.google.samples.apps.iosched.widget.BottomSheetBehavior<?> bottomSheetBehavior;
    private int fabBaseMarginBottom;
    private static final java.lang.String FRAGMENT_MY_LOCATION_RATIONALE = "my_location_rationale";
    private static final java.lang.String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";
    private static final java.lang.String ARG_FEATURE_ID = "arg.FEATURE_ID";
    private static final java.lang.String ARG_FEATURE_START_TIME = "arg.FEATURE_START_TIME";
    private static final int REQUEST_LOCATION_PERMISSION = 1;
    private static final float ALPHA_TRANSITION_END = 0.5F;
    private static final float ALPHA_TRANSITION_START = 0.1F;
    public static final com.google.samples.apps.iosched.ui.map.MapFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper getAnalyticsHelper() {
        return null;
    }
    
    public final void setAnalyticsHelper(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateInfoSheet(com.google.samples.apps.iosched.ui.map.MarkerInfo markerInfo) {
    }
    
    private final boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    private final void updateMarkers(com.google.maps.android.data.geojson.GeoJsonLayer geoJsonLayer) {
    }
    
    private final void requestLocationPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void enableMyLocation(boolean requestPermission) {
    }
    
    public MapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapFragment$MyLocationRationaleFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "mobile_staging"})
    public static final class MyLocationRationaleFragment extends androidx.fragment.app.DialogFragment {
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        public MyLocationRationaleFragment() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapFragment$Companion;", "", "()V", "ALPHA_TRANSITION_END", "", "ALPHA_TRANSITION_START", "ARG_FEATURE_ID", "", "ARG_FEATURE_START_TIME", "FRAGMENT_MY_LOCATION_RATIONALE", "MAPVIEW_BUNDLE_KEY", "REQUEST_LOCATION_PERMISSION", "", "newInstance", "Lcom/google/samples/apps/iosched/ui/map/MapFragment;", "featureId", "featureStartTime", "", "mobile_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.map.MapFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, long featureStartTime) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}