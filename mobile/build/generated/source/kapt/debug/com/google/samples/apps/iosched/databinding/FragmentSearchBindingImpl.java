package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.searchView, 5);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.SearchView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.empty.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.google.samples.apps.iosched.ui.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.search.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelSearchResults((androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSearchResults(androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult>> ViewModelSearchResults, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsEmpty = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue = false;
        java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult> viewModelSearchResultsGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult>> viewModelSearchResults = null;
        com.google.samples.apps.iosched.ui.search.SearchViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelIsEmptyGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEmpty
                        viewModelIsEmpty = viewModel.isEmpty();
                    }
                    updateLiveDataRegistration(0, viewModelIsEmpty);


                    if (viewModelIsEmpty != null) {
                        // read viewModel.isEmpty.getValue()
                        viewModelIsEmptyGetValue = viewModelIsEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmptyGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchResults
                        viewModelSearchResults = viewModel.getSearchResults();
                    }
                    updateLiveDataRegistration(1, viewModelSearchResults);


                    if (viewModelSearchResults != null) {
                        // read viewModel.searchResults.getValue()
                        viewModelSearchResultsGetValue = viewModelSearchResults.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.empty, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.search.SearchBindingAdaptersKt.searchResultItems(this.recyclerView, viewModelSearchResultsGetValue, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isEmpty
        flag 1 (0x2L): viewModel.searchResults
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}