package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingsBindingImpl extends FragmentSettingsBinding implements com.google.samples.apps.iosched.generated.callback.OnCheckedChangeListener.Listener, com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 9);
        sViewsWithIds.put(R.id.toolbar, 10);
        sViewsWithIds.put(R.id.settings_scroll, 11);
        sViewsWithIds.put(R.id.settings_layout, 12);
        sViewsWithIds.put(R.id.snackbar, 13);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback17;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback15;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.appbar.AppBarLayout) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[3]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[11]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[4]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[2]
            , (com.google.samples.apps.iosched.widget.FadingSnackbar) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[10]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.openSourceLicense.setTag(null);
        this.privacyPolicy.setTag(null);
        this.settingsChooseTheme.setTag(null);
        this.settingsEnableNotifications.setTag(null);
        this.settingsSendAnonymousUsageStatistics.setTag(null);
        this.settingsTimeZone.setTag(null);
        this.termsOfService.setTag(null);
        this.versionBuildNumber.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.google.samples.apps.iosched.generated.callback.OnCheckedChangeListener(this, 4);
        mCallback15 = new com.google.samples.apps.iosched.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback16 = new com.google.samples.apps.iosched.generated.callback.OnCheckedChangeListener(this, 3);
        mCallback14 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.google.samples.apps.iosched.ui.settings.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.settings.SettingsViewModel ViewModel) {
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
                return onChangeViewModelEnableNotifications((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelPreferConferenceTimeZone((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelSendUsageStatistics((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelEnableNotifications(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelEnableNotifications, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPreferConferenceTimeZone(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelPreferConferenceTimeZone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSendUsageStatistics(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelSendUsageStatistics, int fieldId) {
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
        java.lang.Boolean viewModelEnableNotificationsGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelEnableNotifications = null;
        java.lang.Boolean viewModelPreferConferenceTimeZoneGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelPreferConferenceTimeZoneGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelPreferConferenceTimeZone = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelSendUsageStatistics = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelEnableNotificationsGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSendUsageStatisticsGetValue = false;
        java.lang.Boolean viewModelSendUsageStatisticsGetValue = null;
        com.google.samples.apps.iosched.ui.settings.SettingsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.enableNotifications
                        viewModelEnableNotifications = viewModel.getEnableNotifications();
                    }
                    updateLiveDataRegistration(0, viewModelEnableNotifications);


                    if (viewModelEnableNotifications != null) {
                        // read viewModel.enableNotifications.getValue()
                        viewModelEnableNotificationsGetValue = viewModelEnableNotifications.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.enableNotifications.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelEnableNotificationsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelEnableNotificationsGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.preferConferenceTimeZone
                        viewModelPreferConferenceTimeZone = viewModel.getPreferConferenceTimeZone();
                    }
                    updateLiveDataRegistration(1, viewModelPreferConferenceTimeZone);


                    if (viewModelPreferConferenceTimeZone != null) {
                        // read viewModel.preferConferenceTimeZone.getValue()
                        viewModelPreferConferenceTimeZoneGetValue = viewModelPreferConferenceTimeZone.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.preferConferenceTimeZone.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelPreferConferenceTimeZoneGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelPreferConferenceTimeZoneGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sendUsageStatistics
                        viewModelSendUsageStatistics = viewModel.getSendUsageStatistics();
                    }
                    updateLiveDataRegistration(2, viewModelSendUsageStatistics);


                    if (viewModelSendUsageStatistics != null) {
                        // read viewModel.sendUsageStatistics.getValue()
                        viewModelSendUsageStatisticsGetValue = viewModelSendUsageStatistics.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendUsageStatistics.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSendUsageStatisticsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSendUsageStatisticsGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.settings.SettingsFragmentKt.createDialogForFile(this.openSourceLicense, openSourceLicense.getResources().getString(R.string.settings_oss_licenses), openSourceLicense.getResources().getString(R.string.oss_file));
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.privacyPolicy, privacyPolicy.getResources().getString(R.string.privacy_policy_url), (boolean)false);
            this.settingsChooseTheme.setOnClickListener(mCallback14);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.settingsEnableNotifications, mCallback16, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.settingsSendAnonymousUsageStatistics, mCallback17, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.settingsTimeZone, mCallback15, (androidx.databinding.InverseBindingListener)null);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.termsOfService, termsOfService.getResources().getString(R.string.tos_url), (boolean)false);
            com.google.samples.apps.iosched.ui.settings.SettingsFragmentKt.setVersionName(this.versionBuildNumber, com.google.samples.apps.iosched.BuildConfig.VERSION_NAME);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.settingsEnableNotifications, androidxDatabindingViewDataBindingSafeUnboxViewModelEnableNotificationsGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.settingsSendAnonymousUsageStatistics, androidxDatabindingViewDataBindingSafeUnboxViewModelSendUsageStatisticsGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.settingsTimeZone, androidxDatabindingViewDataBindingSafeUnboxViewModelPreferConferenceTimeZoneGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.google.samples.apps.iosched.ui.settings.SettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.toggleSendUsageStatistics(callbackArg_1);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.google.samples.apps.iosched.ui.settings.SettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.toggleTimeZone(callbackArg_1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.google.samples.apps.iosched.ui.settings.SettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.toggleEnableNotifications(callbackArg_1);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.settings.SettingsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onThemeSettingClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.enableNotifications
        flag 1 (0x2L): viewModel.preferConferenceTimeZone
        flag 2 (0x3L): viewModel.sendUsageStatistics
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}