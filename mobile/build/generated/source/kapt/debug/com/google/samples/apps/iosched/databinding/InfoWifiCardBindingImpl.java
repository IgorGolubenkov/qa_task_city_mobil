package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InfoWifiCardBindingImpl extends InfoWifiCardBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InfoWifiCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private InfoWifiCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.joinNetwork.setTag(null);
        this.wifiCard.setTag(null);
        this.wifiNetworkAndPassword.setTag(null);
        setRootTag(root);
        // listeners
        mCallback26 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.google.samples.apps.iosched.ui.info.EventInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.info.EventInfoViewModel ViewModel) {
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
                return onChangeViewModelShowWifi((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelWifiConfig((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.ConferenceWifiInfo>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowWifi(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowWifi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWifiConfig(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.ConferenceWifiInfo> ViewModelWifiConfig, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowWifi = null;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.ConferenceWifiInfo> viewModelWifiConfig = null;
        java.lang.Boolean viewModelShowWifiGetValue = null;
        com.google.samples.apps.iosched.model.ConferenceWifiInfo viewModelWifiConfigGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowWifiGetValue = false;
        com.google.samples.apps.iosched.ui.info.EventInfoViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showWifi
                        viewModelShowWifi = viewModel.getShowWifi();
                    }
                    updateLiveDataRegistration(0, viewModelShowWifi);


                    if (viewModelShowWifi != null) {
                        // read viewModel.showWifi.getValue()
                        viewModelShowWifiGetValue = viewModelShowWifi.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showWifi.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowWifiGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowWifiGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.wifiConfig
                        viewModelWifiConfig = viewModel.getWifiConfig();
                    }
                    updateLiveDataRegistration(1, viewModelWifiConfig);


                    if (viewModelWifiConfig != null) {
                        // read viewModel.wifiConfig.getValue()
                        viewModelWifiConfigGetValue = viewModelWifiConfig.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.joinNetwork.setOnClickListener(mCallback26);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.wifiCard, androidxDatabindingViewDataBindingSafeUnboxViewModelShowWifiGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.info.EventFragmentKt.bindWifiInfo(this.wifiNetworkAndPassword, viewModelWifiConfigGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.info.EventInfoViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onWifiConnect();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showWifi
        flag 1 (0x2L): viewModel.wifiConfig
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}