package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogSignOutBindingImpl extends DialogSignOutBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 8);
        sViewsWithIds.put(R.id.guideline_end, 9);
        sViewsWithIds.put(R.id.username_email_container, 10);
        sViewsWithIds.put(R.id.divider1, 11);
        sViewsWithIds.put(R.id.message, 12);
        sViewsWithIds.put(R.id.divider2, 13);
        sViewsWithIds.put(R.id.bullet, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogSignOutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private DialogSignOutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[14]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[10]
            );
        this.email.setTag(null);
        this.manageAccount.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.privacyPolicy.setTag(null);
        this.signOut.setTag(null);
        this.termsOfService.setTag(null);
        this.userAvatar.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.google.samples.apps.iosched.ui.signin.SignInViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.signin.SignInViewModel ViewModel) {
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
                return onChangeViewModelCurrentUserInfo((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>) object, fieldId);
            case 1 :
                return onChangeViewModelCurrentUserImageUri((androidx.lifecycle.LiveData<android.net.Uri>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCurrentUserInfo(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> ViewModelCurrentUserInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCurrentUserImageUri(androidx.lifecycle.LiveData<android.net.Uri> ViewModelCurrentUserImageUri, int fieldId) {
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
        com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo viewModelCurrentUserInfoGetValue = null;
        android.net.Uri viewModelCurrentUserImageUriGetValue = null;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> viewModelCurrentUserInfo = null;
        androidx.lifecycle.LiveData<android.net.Uri> viewModelCurrentUserImageUri = null;
        com.google.samples.apps.iosched.ui.signin.SignInViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.currentUserInfo
                        viewModelCurrentUserInfo = viewModel.getCurrentUserInfo();
                    }
                    updateLiveDataRegistration(0, viewModelCurrentUserInfo);


                    if (viewModelCurrentUserInfo != null) {
                        // read viewModel.currentUserInfo.getValue()
                        viewModelCurrentUserInfoGetValue = viewModelCurrentUserInfo.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.currentUserImageUri
                        viewModelCurrentUserImageUri = viewModel.getCurrentUserImageUri();
                    }
                    updateLiveDataRegistration(1, viewModelCurrentUserImageUri);


                    if (viewModelCurrentUserImageUri != null) {
                        // read viewModel.currentUserImageUri.getValue()
                        viewModelCurrentUserImageUriGetValue = viewModelCurrentUserImageUri.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.signin.SignOutDialogFragmentKt.setUserEmail(this.email, viewModelCurrentUserInfoGetValue);
            com.google.samples.apps.iosched.ui.signin.SignOutDialogFragmentKt.setUsername(this.username, viewModelCurrentUserInfoGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.manageAccount, manageAccount.getResources().getString(R.string.manage_google_account_url), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.privacyPolicy, privacyPolicy.getResources().getString(R.string.privacy_policy_url), (boolean)false);
            this.signOut.setOnClickListener(mCallback4);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.termsOfService, termsOfService.getResources().getString(R.string.tos_url), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.clipToCircle(this.userAvatar, true);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.imageUri(this.userAvatar, viewModelCurrentUserImageUriGetValue, getDrawableFromResource(userAvatar, R.drawable.ic_default_profile_avatar));
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.signin.SignInViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onSignOut();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.currentUserInfo
        flag 1 (0x2L): viewModel.currentUserImageUri
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}