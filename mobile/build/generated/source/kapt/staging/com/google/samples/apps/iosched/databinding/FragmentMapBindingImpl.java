package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMapBindingImpl extends FragmentMapBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.status_bar, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.coordinatorLayout, 5);
        sViewsWithIds.put(R.id.map_mode_fab, 6);
        sViewsWithIds.put(R.id.guide_peek_height, 7);
        sViewsWithIds.put(R.id.description_scrollview, 8);
        sViewsWithIds.put(R.id.marker_description, 9);
        sViewsWithIds.put(R.id.clickable, 10);
        sViewsWithIds.put(R.id.marker_icon, 11);
        sViewsWithIds.put(R.id.expand_icon, 12);
        sViewsWithIds.put(R.id.marker_title, 13);
        sViewsWithIds.put(R.id.marker_subtitle, 14);
        sViewsWithIds.put(R.id.sheet_header_shadow, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMapBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentMapBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.view.View) bindings[10]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (android.widget.ImageView) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (com.google.android.gms.maps.MapView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.bottomSheet.setTag(null);
        this.map.setTag(null);
        this.mapContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.map.MapViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.map.MapViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMapVariant((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.map.MapVariant>) object, fieldId);
            case 1 :
                return onChangeViewModelBottomSheetStateEvent((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer>>) object, fieldId);
            case 2 :
                return onChangeViewModelMapCenterEvent((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMapVariant(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.map.MapVariant> ViewModelMapVariant, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBottomSheetStateEvent(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer>> ViewModelBottomSheetStateEvent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMapCenterEvent(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate>> ViewModelMapCenterEvent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.ui.map.MapVariant> viewModelMapVariant = null;
        com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer> viewModelBottomSheetStateEventGetValue = null;
        com.google.android.gms.maps.model.LatLngBounds viewModelConferenceLocationBounds = null;
        com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate> viewModelMapCenterEventGetValue = null;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Integer>> viewModelBottomSheetStateEvent = null;
        int viewModelMapVariantStyleResId = 0;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.android.gms.maps.CameraUpdate>> viewModelMapCenterEvent = null;
        com.google.samples.apps.iosched.ui.map.MapVariant viewModelMapVariantGetValue = null;
        com.google.samples.apps.iosched.ui.map.MapViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mapVariant
                        viewModelMapVariant = viewModel.getMapVariant();
                    }
                    updateLiveDataRegistration(0, viewModelMapVariant);


                    if (viewModelMapVariant != null) {
                        // read viewModel.mapVariant.getValue()
                        viewModelMapVariantGetValue = viewModelMapVariant.getValue();
                    }


                    if (viewModelMapVariantGetValue != null) {
                        // read viewModel.mapVariant.getValue().styleResId
                        viewModelMapVariantStyleResId = viewModelMapVariantGetValue.getStyleResId();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceLocationBounds
                        viewModelConferenceLocationBounds = viewModel.getConferenceLocationBounds();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.bottomSheetStateEvent
                        viewModelBottomSheetStateEvent = viewModel.getBottomSheetStateEvent();
                    }
                    updateLiveDataRegistration(1, viewModelBottomSheetStateEvent);


                    if (viewModelBottomSheetStateEvent != null) {
                        // read viewModel.bottomSheetStateEvent.getValue()
                        viewModelBottomSheetStateEventGetValue = viewModelBottomSheetStateEvent.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mapCenterEvent
                        viewModelMapCenterEvent = viewModel.getMapCenterEvent();
                    }
                    updateLiveDataRegistration(2, viewModelMapCenterEvent);


                    if (viewModelMapCenterEvent != null) {
                        // read viewModel.mapCenterEvent.getValue()
                        viewModelMapCenterEventGetValue = viewModelMapCenterEvent.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.bottomSheetState(this.bottomSheet, viewModelBottomSheetStateEventGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.isIndoorEnabled(this.map, false);
            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.isMapToolbarEnabled(this.map, false);
            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.mapZoomLevels(this.map, com.google.samples.apps.iosched.R.dimen.map_viewport_min_zoom, com.google.samples.apps.iosched.R.dimen.map_viewport_max_zoom);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.mapCenter(this.map, viewModelMapCenterEventGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.mapStyle(this.map, viewModelMapVariantStyleResId);
            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.mapTileProvider(this.map, viewModelMapVariantGetValue);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.mapViewport(this.map, viewModelConferenceLocationBounds);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.mapVariant
        flag 1 (0x2L): viewModel.bottomSheetStateEvent
        flag 2 (0x3L): viewModel.mapCenterEvent
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}