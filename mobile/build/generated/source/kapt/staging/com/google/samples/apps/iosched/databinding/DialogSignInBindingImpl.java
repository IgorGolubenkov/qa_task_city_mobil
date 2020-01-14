package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogSignInBindingImpl extends DialogSignInBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 5);
        sViewsWithIds.put(R.id.guideline_end, 6);
        sViewsWithIds.put(R.id.welcome, 7);
        sViewsWithIds.put(R.id.divider1, 8);
        sViewsWithIds.put(R.id.message, 9);
        sViewsWithIds.put(R.id.divider2, 10);
        sViewsWithIds.put(R.id.bullet, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogSignInBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogSignInBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[11]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.privacyPolicy.setTag(null);
        this.signIn.setTag(null);
        this.termsOfService.setTag(null);
        this.userAvatar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.google.samples.apps.iosched.ui.signin.SignInViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.privacyPolicy, privacyPolicy.getResources().getString(R.string.privacy_policy_url), (boolean)false);
            this.signIn.setOnClickListener(mCallback20);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.termsOfService, termsOfService.getResources().getString(R.string.tos_url), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.clipToCircle(this.userAvatar, true);
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


            viewModel.onSignIn();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}