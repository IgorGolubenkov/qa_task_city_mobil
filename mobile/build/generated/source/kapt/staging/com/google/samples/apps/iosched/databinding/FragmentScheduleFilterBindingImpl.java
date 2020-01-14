package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentScheduleFilterBindingImpl extends FragmentScheduleFilterBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guide_peek_height, 7);
        sViewsWithIds.put(R.id.filters_header_shadow, 8);
        sViewsWithIds.put(R.id.expand, 9);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentScheduleFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentScheduleFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageButton) bindings[6]
            , (android.view.View) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.view.View) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.Button) bindings[5]
            );
        this.clearFiltersShortcut.setTag(null);
        this.collapseArrow.setTag(null);
        this.filterDescriptionTags.setTag(null);
        this.filterSheet.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.recyclerviewFilter.setTag(null);
        this.reset.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 2);
        mCallback24 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.recyclerviewAlpha == variableId) {
            setRecyclerviewAlpha((androidx.databinding.ObservableFloat) variable);
        }
        else if (BR.descriptionAlpha == variableId) {
            setDescriptionAlpha((androidx.databinding.ObservableFloat) variable);
        }
        else if (BR.headerAlpha == variableId) {
            setHeaderAlpha((androidx.databinding.ObservableFloat) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRecyclerviewAlpha(@Nullable androidx.databinding.ObservableFloat RecyclerviewAlpha) {
        updateRegistration(0, RecyclerviewAlpha);
        this.mRecyclerviewAlpha = RecyclerviewAlpha;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.recyclerviewAlpha);
        super.requestRebind();
    }
    public void setDescriptionAlpha(@Nullable androidx.databinding.ObservableFloat DescriptionAlpha) {
        updateRegistration(1, DescriptionAlpha);
        this.mDescriptionAlpha = DescriptionAlpha;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.descriptionAlpha);
        super.requestRebind();
    }
    public void setHeaderAlpha(@Nullable androidx.databinding.ObservableFloat HeaderAlpha) {
        updateRegistration(3, HeaderAlpha);
        this.mHeaderAlpha = HeaderAlpha;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.headerAlpha);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRecyclerviewAlpha((androidx.databinding.ObservableFloat) object, fieldId);
            case 1 :
                return onChangeDescriptionAlpha((androidx.databinding.ObservableFloat) object, fieldId);
            case 2 :
                return onChangeViewModelHasAnyFilters((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeHeaderAlpha((androidx.databinding.ObservableFloat) object, fieldId);
            case 4 :
                return onChangeViewModelSelectedFilters((androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>>) object, fieldId);
            case 5 :
                return onChangeViewModelEventCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRecyclerviewAlpha(androidx.databinding.ObservableFloat RecyclerviewAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDescriptionAlpha(androidx.databinding.ObservableFloat DescriptionAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasAnyFilters(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelHasAnyFilters, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHeaderAlpha(androidx.databinding.ObservableFloat HeaderAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedFilters(androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> ViewModelSelectedFilters, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEventCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelEventCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        float descriptionAlphaGet = 0f;
        java.lang.Integer viewModelEventCountGetValue = null;
        float headerAlphaGet = 0f;
        androidx.databinding.ObservableFloat recyclerviewAlpha = mRecyclerviewAlpha;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue = false;
        androidx.databinding.ObservableFloat descriptionAlpha = mDescriptionAlpha;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelHasAnyFilters = null;
        androidx.databinding.ObservableFloat headerAlpha = mHeaderAlpha;
        float recyclerviewAlphaGet = 0f;
        java.lang.Boolean viewModelHasAnyFiltersGetValue = null;
        java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter> viewModelSelectedFiltersGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> viewModelSelectedFilters = null;
        boolean descriptionAlphaFloat0f = false;
        boolean headerAlphaFloat0f = false;
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelEventCount = null;

        if ((dirtyFlags & 0x81L) != 0) {



                if (recyclerviewAlpha != null) {
                    // read recyclerviewAlpha.get()
                    recyclerviewAlphaGet = recyclerviewAlpha.get();
                }
        }
        if ((dirtyFlags & 0x82L) != 0) {



                if (descriptionAlpha != null) {
                    // read descriptionAlpha.get()
                    descriptionAlphaGet = descriptionAlpha.get();
                }


                // read descriptionAlpha.get() > 0f
                descriptionAlphaFloat0f = (descriptionAlphaGet) > (0f);
        }
        if ((dirtyFlags & 0x88L) != 0) {



                if (headerAlpha != null) {
                    // read headerAlpha.get()
                    headerAlphaGet = headerAlpha.get();
                }


                // read headerAlpha.get() > 0f
                headerAlphaFloat0f = (headerAlphaGet) > (0f);
        }
        if ((dirtyFlags & 0xf4L) != 0) {


            if ((dirtyFlags & 0xe4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasAnyFilters
                        viewModelHasAnyFilters = viewModel.getHasAnyFilters();
                        // read viewModel.eventCount
                        viewModelEventCount = viewModel.getEventCount();
                    }
                    updateLiveDataRegistration(2, viewModelHasAnyFilters);
                    updateLiveDataRegistration(5, viewModelEventCount);


                    if (viewModelHasAnyFilters != null) {
                        // read viewModel.hasAnyFilters.getValue()
                        viewModelHasAnyFiltersGetValue = viewModelHasAnyFilters.getValue();
                    }
                    if (viewModelEventCount != null) {
                        // read viewModel.eventCount.getValue()
                        viewModelEventCountGetValue = viewModelEventCount.getValue();
                    }

                if ((dirtyFlags & 0xc4L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasAnyFilters.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasAnyFiltersGetValue);
                }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedFilters
                        viewModelSelectedFilters = viewModel.getSelectedFilters();
                    }
                    updateLiveDataRegistration(4, viewModelSelectedFilters);


                    if (viewModelSelectedFilters != null) {
                        // read viewModel.selectedFilters.getValue()
                        viewModelSelectedFiltersGetValue = viewModelSelectedFilters.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.clearFiltersShortcut.setAlpha(descriptionAlphaGet);
                this.filterDescriptionTags.setAlpha(descriptionAlphaGet);
            }
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.clearFiltersShortcut, mCallback24, descriptionAlphaFloat0f);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.clearFiltersShortcut, androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.filterDescriptionTags, androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.reset, androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.collapseArrow.setAlpha(headerAlphaGet);
                this.mboundView4.setAlpha(headerAlphaGet);
                this.reset.setAlpha(headerAlphaGet);
            }
            // api target 1

            this.collapseArrow.setClickable(headerAlphaFloat0f);
            this.reset.setClickable(headerAlphaFloat0f);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragmentKt.selectedFilters(this.filterDescriptionTags, viewModelSelectedFiltersGetValue);
        }
        if ((dirtyFlags & 0xe4L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragmentKt.filterHeader(this.mboundView4, viewModelHasAnyFiltersGetValue, viewModelEventCountGetValue);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.recyclerviewFilter.setAlpha(recyclerviewAlphaGet);
            }
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragmentKt.setResetFiltersClickListener(this.reset, recyclerviewFilter, mCallback25);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clearFilters();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clearFilters();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): recyclerviewAlpha
        flag 1 (0x2L): descriptionAlpha
        flag 2 (0x3L): viewModel.hasAnyFilters
        flag 3 (0x4L): headerAlpha
        flag 4 (0x5L): viewModel.selectedFilters
        flag 5 (0x6L): viewModel.eventCount
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}