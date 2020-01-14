package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInfoEventBindingImpl extends FragmentInfoEventBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"info_wifi_card"},
            new int[] {5},
            new int[] {com.google.samples.apps.iosched.R.layout.info_wifi_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 6);
        sViewsWithIds.put(R.id.guideline_end, 7);
        sViewsWithIds.put(R.id.assistant_app_logo, 8);
        sViewsWithIds.put(R.id.assistant_app_description, 9);
        sViewsWithIds.put(R.id.assistant_app_description2, 10);
        sViewsWithIds.put(R.id.event_types_header, 11);
        sViewsWithIds.put(R.id.event_sessions, 12);
        sViewsWithIds.put(R.id.event_sandbox, 13);
        sViewsWithIds.put(R.id.event_codelabs, 14);
        sViewsWithIds.put(R.id.event_officehours, 15);
        sViewsWithIds.put(R.id.event_afterhours, 16);
        sViewsWithIds.put(R.id.event_meals, 17);
    }
    // views
    @NonNull
    private final com.google.samples.apps.iosched.widget.CountdownView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInfoEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentInfoEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.google.samples.apps.iosched.widget.EventCardView) bindings[16]
            , (com.google.samples.apps.iosched.widget.EventCardView) bindings[14]
            , (com.google.samples.apps.iosched.widget.EventCardView) bindings[17]
            , (com.google.samples.apps.iosched.widget.EventCardView) bindings[15]
            , (com.google.samples.apps.iosched.widget.EventCardView) bindings[13]
            , (com.google.samples.apps.iosched.widget.EventCardView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.google.samples.apps.iosched.databinding.InfoWifiCardBinding) bindings[5]
            );
        this.assistantApp.setTag(null);
        this.content.setTag(null);
        this.mboundView4 = (com.google.samples.apps.iosched.widget.CountdownView) bindings[4];
        this.mboundView4.setTag(null);
        this.relatedAppsHeader.setTag(null);
        this.scrollView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        wifiCard.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (wifiCard.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.showAssistantApp == variableId) {
            setShowAssistantApp((java.lang.Boolean) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.info.EventInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowAssistantApp(@Nullable java.lang.Boolean ShowAssistantApp) {
        this.mShowAssistantApp = ShowAssistantApp;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showAssistantApp);
        super.requestRebind();
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
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        wifiCard.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWifiCard((com.google.samples.apps.iosched.databinding.InfoWifiCardBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWifiCard(com.google.samples.apps.iosched.databinding.InfoWifiCardBinding WifiCard, int fieldId) {
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
        java.lang.Boolean showAssistantApp = mShowAssistantApp;
        com.google.samples.apps.iosched.ui.info.EventInfoViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowAssistantApp = false;

        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showAssistantApp)
                androidxDatabindingViewDataBindingSafeUnboxShowAssistantApp = androidx.databinding.ViewDataBinding.safeUnbox(showAssistantApp);
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.assistantApp.setOnClickListener(mCallback12);
            com.google.samples.apps.iosched.ui.info.EventFragmentKt.countdownVisibility(this.mboundView4, true);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.assistantApp, androidxDatabindingViewDataBindingSafeUnboxShowAssistantApp);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.relatedAppsHeader, androidxDatabindingViewDataBindingSafeUnboxShowAssistantApp);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.wifiCard.setViewModel(viewModel);
        }
        executeBindingsOn(wifiCard);
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


            viewModel.onClickAssistantApp();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): wifiCard
        flag 1 (0x2L): showAssistantApp
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}