package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCodelabBindingImpl extends ItemCodelabBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCodelabBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemCodelabBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (com.google.samples.apps.iosched.widget.NoTouchRecyclerView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.Button) bindings[7]
            );
        this.codelabDescription.setTag(null);
        this.codelabDuration.setTag(null);
        this.codelabIcon.setTag(null);
        this.codelabTags.setTag(null);
        this.codelabTitle.setTag(null);
        this.expandIcon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.startCodelab.setTag(null);
        setRootTag(root);
        // listeners
        mCallback22 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        if (BR.codelab == variableId) {
            setCodelab((com.google.samples.apps.iosched.model.Codelab) variable);
        }
        else if (BR.isExpanded == variableId) {
            setIsExpanded((java.lang.Boolean) variable);
        }
        else if (BR.actionHandler == variableId) {
            setActionHandler((com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCodelab(@Nullable com.google.samples.apps.iosched.model.Codelab Codelab) {
        this.mCodelab = Codelab;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.codelab);
        super.requestRebind();
    }
    public void setIsExpanded(@Nullable java.lang.Boolean IsExpanded) {
        this.mIsExpanded = IsExpanded;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isExpanded);
        super.requestRebind();
    }
    public void setActionHandler(@Nullable com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler ActionHandler) {
        this.mActionHandler = ActionHandler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
        java.lang.String codelabIconUrl = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsExpanded = false;
        com.google.samples.apps.iosched.model.Codelab codelab = mCodelab;
        java.lang.String CodelabTitle1 = null;
        boolean codelabHasUrl = false;
        java.lang.String CodelabDescription1 = null;
        boolean isExpandedCodelabHasUrlBooleanFalse = false;
        java.lang.Boolean isExpanded = mIsExpanded;
        int codelabDurationMinutes = 0;
        java.util.List<com.google.samples.apps.iosched.model.Tag> CodelabTags1 = null;
        com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;
        float isExpandedFloat180fFloat0f = 0f;

        if ((dirtyFlags & 0x9L) != 0) {



                if (codelab != null) {
                    // read codelab.iconUrl
                    codelabIconUrl = codelab.getIconUrl();
                    // read codelab.title
                    CodelabTitle1 = codelab.getTitle();
                    // read codelab.description
                    CodelabDescription1 = codelab.getDescription();
                    // read codelab.durationMinutes
                    codelabDurationMinutes = codelab.getDurationMinutes();
                    // read codelab.tags
                    CodelabTags1 = codelab.getTags();
                }
        }
        if ((dirtyFlags & 0xbL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isExpanded)
                androidxDatabindingViewDataBindingSafeUnboxIsExpanded = androidx.databinding.ViewDataBinding.safeUnbox(isExpanded);
            if((dirtyFlags & 0xbL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsExpanded) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsExpanded) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }

            if ((dirtyFlags & 0xaL) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(isExpanded) ? 180f : 0f
                    isExpandedFloat180fFloat0f = ((androidxDatabindingViewDataBindingSafeUnboxIsExpanded) ? (180f) : (0f));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {



                if (codelab != null) {
                    // read codelab.hasUrl()
                    codelabHasUrl = codelab.hasUrl();
                }
        }

        if ((dirtyFlags & 0xbL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(isExpanded) ? codelab.hasUrl() : false
                isExpandedCodelabHasUrlBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxIsExpanded) ? (codelabHasUrl) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.codelabDescription, CodelabDescription1);
            com.google.samples.apps.iosched.ui.codelabs.CodelabsAdapterKt.codelabDuration(this.codelabDuration, codelabDurationMinutes);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.imageUrl(this.codelabIcon, codelabIconUrl, getDrawableFromResource(codelabIcon, R.drawable.ic_nav_codelabs));
            com.google.samples.apps.iosched.ui.sessioncommon.TagBindingAdaptersKt.topicTags(this.codelabTags, CodelabTags1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.codelabTitle, CodelabTitle1);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.codelabDescription, androidxDatabindingViewDataBindingSafeUnboxIsExpanded);
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.expandIcon.setRotationX(isExpandedFloat180fFloat0f);
            }
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.startCodelab.setOnClickListener(mCallback22);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.startCodelab, isExpandedCodelabHasUrlBooleanFalse);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // codelab
        com.google.samples.apps.iosched.model.Codelab codelab = mCodelab;
        // actionHandler
        com.google.samples.apps.iosched.ui.codelabs.CodelabsActionsHandler actionHandler = mActionHandler;
        // actionHandler != null
        boolean actionHandlerJavaLangObjectNull = false;



        actionHandlerJavaLangObjectNull = (actionHandler) != (null);
        if (actionHandlerJavaLangObjectNull) {



            actionHandler.startCodelab(codelab);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): codelab
        flag 1 (0x2L): isExpanded
        flag 2 (0x3L): actionHandler
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isExpanded) ? codelab.hasUrl() : false
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isExpanded) ? codelab.hasUrl() : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isExpanded) ? 180f : 0f
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isExpanded) ? 180f : 0f
    flag mapping end*/
    //end
}