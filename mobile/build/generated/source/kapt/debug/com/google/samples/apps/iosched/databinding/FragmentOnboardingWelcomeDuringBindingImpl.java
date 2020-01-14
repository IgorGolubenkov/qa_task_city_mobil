package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOnboardingWelcomeDuringBindingImpl extends FragmentOnboardingWelcomeDuringBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 2);
        sViewsWithIds.put(R.id.guideline_end, 3);
        sViewsWithIds.put(R.id.io_hashtag, 4);
        sViewsWithIds.put(R.id.welcome_during_message, 5);
        sViewsWithIds.put(R.id.date_location, 6);
        sViewsWithIds.put(R.id.spacer, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOnboardingWelcomeDuringBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentOnboardingWelcomeDuringBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.Space) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.buttonSignin.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        if (BR.activityViewModel == variableId) {
            setActivityViewModel((com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActivityViewModel(@Nullable com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel ActivityViewModel) {
        this.mActivityViewModel = ActivityViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.activityViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeActivityViewModelObserveSignedInUser((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeActivityViewModelObserveSignedInUser(androidx.lifecycle.LiveData<java.lang.Boolean> ActivityViewModelObserveSignedInUser, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxActivityViewModelObserveSignedInUserGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxActivityViewModelObserveSignedInUser = false;
        com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel activityViewModel = mActivityViewModel;
        java.lang.Boolean activityViewModelObserveSignedInUserGetValue = null;
        boolean activityViewModelObserveSignedInUser = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> ActivityViewModelObserveSignedInUser1 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (activityViewModel != null) {
                    // read activityViewModel.observeSignedInUser
                    ActivityViewModelObserveSignedInUser1 = activityViewModel.observeSignedInUser();
                }
                updateLiveDataRegistration(0, ActivityViewModelObserveSignedInUser1);


                if (ActivityViewModelObserveSignedInUser1 != null) {
                    // read activityViewModel.observeSignedInUser.getValue()
                    activityViewModelObserveSignedInUserGetValue = ActivityViewModelObserveSignedInUser1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(activityViewModel.observeSignedInUser.getValue())
                androidxDatabindingViewDataBindingSafeUnboxActivityViewModelObserveSignedInUserGetValue = androidx.databinding.ViewDataBinding.safeUnbox(activityViewModelObserveSignedInUserGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(activityViewModel.observeSignedInUser.getValue())
                activityViewModelObserveSignedInUser = !androidxDatabindingViewDataBindingSafeUnboxActivityViewModelObserveSignedInUserGetValue;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(activityViewModel.observeSignedInUser.getValue()))
                androidxDatabindingViewDataBindingSafeUnboxActivityViewModelObserveSignedInUser = androidx.databinding.ViewDataBinding.safeUnbox(activityViewModelObserveSignedInUser);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonSignin.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.buttonSignin, androidxDatabindingViewDataBindingSafeUnboxActivityViewModelObserveSignedInUser);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // activityViewModel != null
        boolean activityViewModelJavaLangObjectNull = false;
        // activityViewModel
        com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel activityViewModel = mActivityViewModel;



        activityViewModelJavaLangObjectNull = (activityViewModel) != (null);
        if (activityViewModelJavaLangObjectNull) {


            activityViewModel.onSigninClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): activityViewModel.observeSignedInUser
        flag 1 (0x2L): activityViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}