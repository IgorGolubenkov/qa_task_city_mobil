package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMapVariantBindingImpl extends ItemMapVariantBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMapVariantBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemMapVariantBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckedTextView) bindings[0]
            );
        this.mapVariantLabel.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.isChecked == variableId) {
            setIsChecked((java.lang.Boolean) variable);
        }
        else if (BR.variant == variableId) {
            setVariant((com.google.samples.apps.iosched.ui.map.MapVariant) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsChecked(@Nullable java.lang.Boolean IsChecked) {
        this.mIsChecked = IsChecked;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isChecked);
        super.requestRebind();
    }
    public void setVariant(@Nullable com.google.samples.apps.iosched.ui.map.MapVariant Variant) {
        this.mVariant = Variant;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.variant);
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
        int variantIconResId = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsChecked = false;
        int variantLabelResId = 0;
        java.lang.Boolean isChecked = mIsChecked;
        com.google.samples.apps.iosched.ui.map.MapVariant variant = mVariant;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isChecked)
                androidxDatabindingViewDataBindingSafeUnboxIsChecked = androidx.databinding.ViewDataBinding.safeUnbox(isChecked);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (variant != null) {
                    // read variant.iconResId
                    variantIconResId = variant.getIconResId();
                    // read variant.labelResId
                    variantLabelResId = variant.getLabelResId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mapVariantLabel.setChecked(androidxDatabindingViewDataBindingSafeUnboxIsChecked);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.mapVariantLabel, variantLabelResId);
            com.google.samples.apps.iosched.ui.map.MapVariantAdapterKt.variantIcon(this.mapVariantLabel, variantIconResId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isChecked
        flag 1 (0x2L): variant
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}