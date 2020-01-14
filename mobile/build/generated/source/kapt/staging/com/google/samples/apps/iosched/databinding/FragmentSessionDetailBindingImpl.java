package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSessionDetailBindingImpl extends FragmentSessionDetailBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.session_detail_recycler_view, 5);
        sViewsWithIds.put(R.id.appbar, 6);
        sViewsWithIds.put(R.id.collapsing_toolbar, 7);
        sViewsWithIds.put(R.id.toolbar, 8);
        sViewsWithIds.put(R.id.session_detail_bottom_app_bar, 9);
        sViewsWithIds.put(R.id.nav_bar_scrim, 10);
        sViewsWithIds.put(R.id.snackbar, 11);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSessionDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentSessionDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[7]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[10]
            , (android.widget.ImageButton) bindings[2]
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[9]
            , (com.google.samples.apps.iosched.ui.reservation.StarReserveFab) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.google.samples.apps.iosched.widget.FadingSnackbar) bindings[11]
            , (androidx.appcompat.widget.Toolbar) bindings[8]
            );
        this.coordinatorLayoutSessionDetail.setTag(null);
        this.detailImage.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.playButton.setTag(null);
        this.sessionDetailFab.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSession((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session>) object, fieldId);
            case 1 :
                return onChangeViewModelObserveRegisteredUser((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelObserveSignedInUser((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelIsReservationDisabled((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelUserEvent((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserEvent>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSession(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> ViewModelSession, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObserveRegisteredUser(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelObserveRegisteredUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelObserveSignedInUser(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelObserveSignedInUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsReservationDisabled(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsReservationDisabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUserEvent(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> ViewModelUserEvent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> viewModelSession = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelObserveRegisteredUser = null;
        com.google.samples.apps.iosched.model.userdata.UserEvent viewModelUserEventGetValue = null;
        boolean viewModelSessionHasVideo = false;
        com.google.samples.apps.iosched.model.Session viewModelSessionGetValue = null;
        java.lang.Boolean viewModelObserveRegisteredUserGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelObserveSignedInUser = null;
        boolean ViewModelSessionHasVideo1 = false;
        boolean viewModelSessionHasPhotoOrVideo = false;
        java.lang.Boolean viewModelIsReservationDisabledGetValue = null;
        boolean viewModelSessionIsReservable = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelObserveSignedInUserGetValue = false;
        java.lang.Boolean viewModelObserveSignedInUserGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsReservationDisabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelObserveRegisteredUserGetValue = false;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.userdata.UserEvent> viewModelUserEvent = null;
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsReservationDisabledGetValue = false;

        if ((dirtyFlags & 0x7fL) != 0) {



                if (viewModel != null) {
                    // read viewModel.session
                    viewModelSession = viewModel.getSession();
                    // read viewModel.observeRegisteredUser
                    viewModelObserveRegisteredUser = viewModel.observeRegisteredUser();
                    // read viewModel.observeSignedInUser
                    viewModelObserveSignedInUser = viewModel.observeSignedInUser();
                    // read viewModel.isReservationDisabled
                    viewModelIsReservationDisabled = viewModel.isReservationDisabled();
                    // read viewModel.userEvent
                    viewModelUserEvent = viewModel.getUserEvent();
                }
                updateLiveDataRegistration(0, viewModelSession);
                updateLiveDataRegistration(1, viewModelObserveRegisteredUser);
                updateLiveDataRegistration(2, viewModelObserveSignedInUser);
                updateLiveDataRegistration(3, viewModelIsReservationDisabled);
                updateLiveDataRegistration(4, viewModelUserEvent);


                if (viewModelSession != null) {
                    // read viewModel.session.getValue()
                    viewModelSessionGetValue = viewModelSession.getValue();
                }
                if (viewModelObserveRegisteredUser != null) {
                    // read viewModel.observeRegisteredUser.getValue()
                    viewModelObserveRegisteredUserGetValue = viewModelObserveRegisteredUser.getValue();
                }
                if (viewModelObserveSignedInUser != null) {
                    // read viewModel.observeSignedInUser.getValue()
                    viewModelObserveSignedInUserGetValue = viewModelObserveSignedInUser.getValue();
                }
                if (viewModelIsReservationDisabled != null) {
                    // read viewModel.isReservationDisabled.getValue()
                    viewModelIsReservationDisabledGetValue = viewModelIsReservationDisabled.getValue();
                }
                if (viewModelUserEvent != null) {
                    // read viewModel.userEvent.getValue()
                    viewModelUserEventGetValue = viewModelUserEvent.getValue();
                }

            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModelSessionGetValue != null) {
                        // read viewModel.session.getValue().hasVideo
                        viewModelSessionHasVideo = viewModelSessionGetValue.getHasVideo();
                        // read viewModel.session.getValue().hasPhotoOrVideo
                        viewModelSessionHasPhotoOrVideo = viewModelSessionGetValue.getHasPhotoOrVideo();
                    }


                    // read !viewModel.session.getValue().hasVideo
                    ViewModelSessionHasVideo1 = !viewModelSessionHasVideo;
            }

                if (viewModelSessionGetValue != null) {
                    // read viewModel.session.getValue().isReservable
                    viewModelSessionIsReservable = viewModelSessionGetValue.isReservable();
                }
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.observeRegisteredUser.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelObserveRegisteredUserGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelObserveRegisteredUserGetValue);
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.observeSignedInUser.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelObserveSignedInUserGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelObserveSignedInUserGetValue);
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isReservationDisabled.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsReservationDisabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsReservationDisabledGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.eventPhoto(this.detailImage, viewModelSessionGetValue);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.detailImage, viewModelSessionHasPhotoOrVideo);
            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.eventNarrowHeaderImage(this.mboundView3, viewModelSessionGetValue);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.mboundView3, ViewModelSessionHasVideo1);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.playButton, viewModelSessionHasVideo);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.playButton.setOnClickListener(mCallback27);
        }
        if ((dirtyFlags & 0x7fL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.assignFab(this.sessionDetailFab, viewModelUserEventGetValue, androidxDatabindingViewDataBindingSafeUnboxViewModelObserveSignedInUserGetValue, androidxDatabindingViewDataBindingSafeUnboxViewModelObserveRegisteredUserGetValue, viewModelSessionIsReservable, androidxDatabindingViewDataBindingSafeUnboxViewModelIsReservationDisabledGetValue, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onPlayVideo();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.session
        flag 1 (0x2L): viewModel.observeRegisteredUser
        flag 2 (0x3L): viewModel.observeSignedInUser
        flag 3 (0x4L): viewModel.isReservationDisabled
        flag 4 (0x5L): viewModel.userEvent
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}