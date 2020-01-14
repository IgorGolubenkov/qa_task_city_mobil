package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFeedBindingImpl extends FragmentFeedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.status_bar, 2);
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.snackbar, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFeedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentFeedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.google.samples.apps.iosched.widget.FadingSnackbar) bindings[4]
            , (android.view.View) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.google.samples.apps.iosched.ui.feed.FeedViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.feed.FeedViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFeed((androidx.lifecycle.LiveData<java.util.List<java.lang.Object>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFeed(androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> ViewModelFeed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean viewModelFeedIsEmpty = false;
        java.util.List<java.lang.Object> viewModelFeedGetValue = null;
        boolean ViewModelFeedIsEmpty1 = false;
        com.google.samples.apps.iosched.ui.feed.FeedViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> viewModelFeed = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.feed
                    viewModelFeed = viewModel.getFeed();
                }
                updateLiveDataRegistration(0, viewModelFeed);


                if (viewModelFeed != null) {
                    // read viewModel.feed.getValue()
                    viewModelFeedGetValue = viewModelFeed.getValue();
                }


                if (viewModelFeedGetValue != null) {
                    // read viewModel.feed.getValue().isEmpty
                    viewModelFeedIsEmpty = viewModelFeedGetValue.isEmpty();
                }


                // read !viewModel.feed.getValue().isEmpty
                ViewModelFeedIsEmpty1 = !viewModelFeedIsEmpty;
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.recyclerView, ViewModelFeedIsEmpty1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.feed
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}