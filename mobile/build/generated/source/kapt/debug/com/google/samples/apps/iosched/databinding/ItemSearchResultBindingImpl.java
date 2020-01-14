package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSearchResultBindingImpl extends ItemSearchResultBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSearchResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemSearchResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.searchResultIcon.setTag(null);
        this.searchResultTitle.setTag(null);
        this.searchResultType.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
            setEventListener((com.google.samples.apps.iosched.ui.search.SearchResultActionHandler) variable);
        }
        else if (BR.searchResult == variableId) {
            setSearchResult((com.google.samples.apps.iosched.ui.search.SearchResult) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.search.SearchResultActionHandler EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }
    public void setSearchResult(@Nullable com.google.samples.apps.iosched.ui.search.SearchResult SearchResult) {
        this.mSearchResult = SearchResult;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.searchResult);
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
        com.google.samples.apps.iosched.ui.search.SearchResultActionHandler eventListener = mEventListener;
        com.google.samples.apps.iosched.ui.search.SearchResult searchResult = mSearchResult;
        com.google.samples.apps.iosched.ui.search.SearchResultType SearchResultType1 = null;
        java.lang.String SearchResultTitle1 = null;
        java.lang.String searchResultSubtitle = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (searchResult != null) {
                    // read searchResult.type
                    SearchResultType1 = searchResult.getType();
                    // read searchResult.title
                    SearchResultTitle1 = searchResult.getTitle();
                    // read searchResult.subtitle
                    searchResultSubtitle = searchResult.getSubtitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.search.SearchBindingAdaptersKt.searchResultIcon(this.searchResultIcon, SearchResultType1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchResultTitle, SearchResultTitle1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchResultType, searchResultSubtitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // eventListener
        com.google.samples.apps.iosched.ui.search.SearchResultActionHandler eventListener = mEventListener;
        // eventListener != null
        boolean eventListenerJavaLangObjectNull = false;
        // searchResult
        com.google.samples.apps.iosched.ui.search.SearchResult searchResult = mSearchResult;



        eventListenerJavaLangObjectNull = (eventListener) != (null);
        if (eventListenerJavaLangObjectNull) {



            eventListener.openSearchResult(searchResult);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventListener
        flag 1 (0x2L): searchResult
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}