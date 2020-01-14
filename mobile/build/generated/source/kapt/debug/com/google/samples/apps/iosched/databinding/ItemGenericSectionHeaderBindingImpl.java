package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGenericSectionHeaderBindingImpl extends ItemGenericSectionHeaderBinding  {

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
    private final android.widget.TextView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGenericSectionHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemGenericSectionHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.TextView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.sectionHeader == variableId) {
            setSectionHeader((com.google.samples.apps.iosched.ui.SectionHeader) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSectionHeader(@Nullable com.google.samples.apps.iosched.ui.SectionHeader SectionHeader) {
        this.mSectionHeader = SectionHeader;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sectionHeader);
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
        int sectionHeaderTitleId = 0;
        float sectionHeaderUseHorizontalPaddingMboundView0AndroidDimenMarginNormalInt0 = 0f;
        boolean sectionHeaderUseHorizontalPadding = false;
        com.google.samples.apps.iosched.ui.SectionHeader sectionHeader = mSectionHeader;

        if ((dirtyFlags & 0x3L) != 0) {



                if (sectionHeader != null) {
                    // read sectionHeader.titleId
                    sectionHeaderTitleId = sectionHeader.getTitleId();
                    // read sectionHeader.useHorizontalPadding
                    sectionHeaderUseHorizontalPadding = sectionHeader.getUseHorizontalPadding();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(sectionHeaderUseHorizontalPadding) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read sectionHeader.useHorizontalPadding ? @android:dimen/margin_normal : 0
                sectionHeaderUseHorizontalPaddingMboundView0AndroidDimenMarginNormalInt0 = ((sectionHeaderUseHorizontalPadding) ? (mboundView0.getResources().getDimension(R.dimen.margin_normal)) : (0));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setPaddingLeft(this.mboundView0, sectionHeaderUseHorizontalPaddingMboundView0AndroidDimenMarginNormalInt0);
            androidx.databinding.adapters.ViewBindingAdapter.setPaddingRight(this.mboundView0, sectionHeaderUseHorizontalPaddingMboundView0AndroidDimenMarginNormalInt0);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.mboundView0, sectionHeaderTitleId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sectionHeader
        flag 1 (0x2L): null
        flag 2 (0x3L): sectionHeader.useHorizontalPadding ? @android:dimen/margin_normal : 0
        flag 3 (0x4L): sectionHeader.useHorizontalPadding ? @android:dimen/margin_normal : 0
    flag mapping end*/
    //end
}