package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentScheduleBindingImpl extends FragmentScheduleBinding implements com.google.samples.apps.iosched.generated.callback.OnRefreshListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"include_schedule_appbar"},
            new int[] {4},
            new int[] {com.google.samples.apps.iosched.R.layout.include_schedule_appbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerview_schedule, 5);
        sViewsWithIds.put(R.id.snackbar, 6);
        sViewsWithIds.put(R.id.filter_fab, 7);
    }
    // views
    @NonNull
    private final com.google.samples.apps.iosched.widget.CustomSwipeRefreshLayout mboundView1;
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentScheduleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentScheduleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[7]
            , (com.google.samples.apps.iosched.databinding.IncludeScheduleAppbarBinding) bindings[4]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.google.samples.apps.iosched.widget.FadingSnackbar) bindings[6]
            );
        this.coordinatorLayout.setTag(null);
        this.empty.setTag(null);
        this.loading.setTag(null);
        this.mboundView1 = (com.google.samples.apps.iosched.widget.CustomSwipeRefreshLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.google.samples.apps.iosched.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        includeScheduleAppbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeScheduleAppbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isEmpty == variableId) {
            setIsEmpty((boolean) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsEmpty(boolean IsEmpty) {
        this.mIsEmpty = IsEmpty;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isEmpty);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeScheduleAppbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeScheduleAppbar((com.google.samples.apps.iosched.databinding.IncludeScheduleAppbarBinding) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelSwipeRefreshing((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeScheduleAppbar(com.google.samples.apps.iosched.databinding.IncludeScheduleAppbarBinding IncludeScheduleAppbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSwipeRefreshing(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelSwipeRefreshing, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSwipeRefreshingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsEmptyViewModelIsLoadingBooleanFalse = false;
        boolean isEmpty = mIsEmpty;
        java.lang.Boolean viewModelSwipeRefreshingGetValue = null;
        boolean isEmptyViewModelIsLoadingBooleanFalse = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelSwipeRefreshing = null;
        boolean ViewModelIsLoading1 = false;

        if ((dirtyFlags & 0x3aL) != 0) {

            if((dirtyFlags & 0x3aL) != 0) {
                if(isEmpty) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        if ((dirtyFlags & 0x36L) != 0) {


            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(1, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.swipeRefreshing
                        viewModelSwipeRefreshing = viewModel.getSwipeRefreshing();
                    }
                    updateLiveDataRegistration(2, viewModelSwipeRefreshing);


                    if (viewModelSwipeRefreshing != null) {
                        // read viewModel.swipeRefreshing.getValue()
                        viewModelSwipeRefreshingGetValue = viewModelSwipeRefreshing.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.swipeRefreshing.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSwipeRefreshingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSwipeRefreshingGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isLoading
                    viewModelIsLoading = viewModel.isLoading();
                }
                updateLiveDataRegistration(1, viewModelIsLoading);


                if (viewModelIsLoading != null) {
                    // read viewModel.isLoading.getValue()
                    viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                ViewModelIsLoading1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue;
        }

        if ((dirtyFlags & 0x3aL) != 0) {

                // read isEmpty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) : false
                isEmptyViewModelIsLoadingBooleanFalse = ((isEmpty) ? (ViewModelIsLoading1) : (false));


                // read androidx.databinding.ViewDataBinding.safeUnbox(isEmpty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) : false)
                androidxDatabindingViewDataBindingSafeUnboxIsEmptyViewModelIsLoadingBooleanFalse = androidx.databinding.ViewDataBinding.safeUnbox(isEmptyViewModelIsLoadingBooleanFalse);
        }
        // batch finished
        if ((dirtyFlags & 0x3aL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.empty, androidxDatabindingViewDataBindingSafeUnboxIsEmptyViewModelIsLoadingBooleanFalse);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.loading, androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView1.setOnRefreshListener(mCallback7);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setSwipeRefreshColors(this.mboundView1, mboundView1.getResources().getIntArray(R.array.swipe_refresh));
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView1.setRefreshing(androidxDatabindingViewDataBindingSafeUnboxViewModelSwipeRefreshingGetValue);
        }
        executeBindingsOn(includeScheduleAppbar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onSwipeRefresh();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeScheduleAppbar
        flag 1 (0x2L): viewModel.isLoading
        flag 2 (0x3L): viewModel.swipeRefreshing
        flag 3 (0x4L): isEmpty
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): isEmpty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) : false
        flag 7 (0x8L): isEmpty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) : false
    flag mapping end*/
    //end
}