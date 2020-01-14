package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFeedSessionsContainerBindingImpl extends ItemFeedSessionsContainerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 5);
        sViewsWithIds.put(R.id.guideline_end, 6);
        sViewsWithIds.put(R.id.recyclerView, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedSessionsContainerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemFeedSessionsContainerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.actionButton.setTag(null);
        this.loading.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        this.username.setTag(null);
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
        if (BR.eventListener == variableId) {
            setEventListener((com.google.samples.apps.iosched.ui.feed.FeedEventListener) variable);
        }
        else if (BR.sessionContainerState == variableId) {
            setSessionContainerState((com.google.samples.apps.iosched.ui.feed.FeedSessions) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.feed.FeedEventListener EventListener) {
        this.mEventListener = EventListener;
    }
    public void setSessionContainerState(@Nullable com.google.samples.apps.iosched.ui.feed.FeedSessions SessionContainerState) {
        this.mSessionContainerState = SessionContainerState;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sessionContainerState);
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
        com.google.samples.apps.iosched.ui.feed.FeedSessions sessionContainerState = mSessionContainerState;
        int sessionContainerStateActionTextId = 0;
        java.lang.String sessionContainerStateUsername = null;
        boolean sessionContainerStateIsLoading = false;
        int sessionContainerStateTitleId = 0;
        boolean sessionContainerStateUsernameJavaLangObjectNull = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (sessionContainerState != null) {
                    // read sessionContainerState.actionTextId
                    sessionContainerStateActionTextId = sessionContainerState.getActionTextId();
                    // read sessionContainerState.username
                    sessionContainerStateUsername = sessionContainerState.getUsername();
                    // read sessionContainerState.isLoading
                    sessionContainerStateIsLoading = sessionContainerState.isLoading();
                    // read sessionContainerState.titleId
                    sessionContainerStateTitleId = sessionContainerState.getTitleId();
                }


                // read sessionContainerState.username != null
                sessionContainerStateUsernameJavaLangObjectNull = (sessionContainerStateUsername) != (null);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.actionButton, sessionContainerStateActionTextId);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.loading, sessionContainerStateIsLoading);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.title, sessionContainerStateTitleId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, sessionContainerStateUsername);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.username, sessionContainerStateUsernameJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventListener
        flag 1 (0x2L): sessionContainerState
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}