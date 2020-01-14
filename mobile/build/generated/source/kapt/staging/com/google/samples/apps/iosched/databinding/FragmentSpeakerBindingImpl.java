package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSpeakerBindingImpl extends FragmentSpeakerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.speaker_detail_recycler_view, 2);
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.collapsing_toolbar, 4);
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.snackbar, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSpeakerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentSpeakerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[4]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.samples.apps.iosched.widget.FadingSnackbar) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            );
        this.coordinatorLayout.setTag(null);
        this.speakerImage.setTag(null);
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
        if (BR.headshotLoadListener == variableId) {
            setHeadshotLoadListener((com.google.samples.apps.iosched.ui.speaker.ImageLoadListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHeadshotLoadListener(@Nullable com.google.samples.apps.iosched.ui.speaker.ImageLoadListener HeadshotLoadListener) {
        this.mHeadshotLoadListener = HeadshotLoadListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.headshotLoadListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel ViewModel) {
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
                return onChangeViewModelSpeaker((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSpeaker(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> ViewModelSpeaker, int fieldId) {
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
        java.lang.String viewModelSpeakerId = null;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> viewModelSpeaker = null;
        com.google.samples.apps.iosched.ui.speaker.ImageLoadListener headshotLoadListener = mHeadshotLoadListener;
        com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel viewModel = mViewModel;
        com.google.samples.apps.iosched.model.Speaker viewModelSpeakerGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.speaker
                    viewModelSpeaker = viewModel.getSpeaker();
                }
                updateLiveDataRegistration(0, viewModelSpeaker);


                if (viewModelSpeaker != null) {
                    // read viewModel.speaker.getValue()
                    viewModelSpeakerGetValue = viewModelSpeaker.getValue();
                }

            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModelSpeakerGetValue != null) {
                        // read viewModel.speaker.getValue().id
                        viewModelSpeakerId = viewModelSpeakerGetValue.getId();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.speakerImage.setTransitionName(viewModelSpeakerId);
            }
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.speaker.SpeakerBindingAdaptersKt.speakerImage(this.speakerImage, viewModelSpeakerGetValue, headshotLoadListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.speaker
        flag 1 (0x2L): headshotLoadListener
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}