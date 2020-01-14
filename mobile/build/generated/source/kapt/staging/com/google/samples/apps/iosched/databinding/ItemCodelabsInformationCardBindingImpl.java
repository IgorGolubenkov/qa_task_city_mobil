package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCodelabsInformationCardBindingImpl extends ItemCodelabsInformationCardBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCodelabsInformationCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemCodelabsInformationCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            );
        this.dismissCard.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        if (BR.actionHandler == variableId) {
            setActionHandler((com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActionHandler(@Nullable com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler ActionHandler) {
        this.mActionHandler = ActionHandler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.dismissCard.setOnClickListener(mCallback18);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // actionHandler
        com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;
        // actionHandler != null
        boolean actionHandlerJavaLangObjectNull = false;



        actionHandlerJavaLangObjectNull = (actionHandler) != (null);
        if (actionHandlerJavaLangObjectNull) {


            actionHandler.dismissCodelabsInfoCard();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): actionHandler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}