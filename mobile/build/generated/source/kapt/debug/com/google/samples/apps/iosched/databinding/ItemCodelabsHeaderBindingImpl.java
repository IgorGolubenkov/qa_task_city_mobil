package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCodelabsHeaderBindingImpl extends ItemCodelabsHeaderBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.flexbox.FlexboxLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCodelabsHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemCodelabsHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.codelabsBuilding.setTag(null);
        this.codelabsWebsite.setTag(null);
        this.mboundView0 = (com.google.android.flexbox.FlexboxLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        mCallback6 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 2);
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
        if (BR.mapEnabled == variableId) {
            setMapEnabled((boolean) variable);
        }
        else if (BR.actionHandler == variableId) {
            setActionHandler((com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMapEnabled(boolean MapEnabled) {
        this.mMapEnabled = MapEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mapEnabled);
        super.requestRebind();
    }
    public void setActionHandler(@Nullable com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler ActionHandler) {
        this.mActionHandler = ActionHandler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.actionHandler);
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
        boolean mapEnabled = mMapEnabled;
        com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.codelabsBuilding.setOnClickListener(mCallback5);
            this.codelabsWebsite.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.codelabsBuilding, mapEnabled);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // actionHandler
                com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;
                // actionHandler != null
                boolean actionHandlerJavaLangObjectNull = false;



                actionHandlerJavaLangObjectNull = (actionHandler) != (null);
                if (actionHandlerJavaLangObjectNull) {


                    actionHandler.openCodelabsOnMap();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // actionHandler
                com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;
                // actionHandler != null
                boolean actionHandlerJavaLangObjectNull = false;



                actionHandlerJavaLangObjectNull = (actionHandler) != (null);
                if (actionHandlerJavaLangObjectNull) {


                    actionHandler.launchCodelabsWebsite();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mapEnabled
        flag 1 (0x2L): actionHandler
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}