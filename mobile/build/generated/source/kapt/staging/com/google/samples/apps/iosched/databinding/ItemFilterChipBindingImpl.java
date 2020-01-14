package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFilterChipBindingImpl extends ItemFilterChipBinding  {

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

    public ItemFilterChipBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemFilterChipBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.samples.apps.iosched.ui.schedule.filters.EventFilterView) bindings[0]
            );
        this.filterLabel.setTag(null);
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
        if (BR.eventFilter == variableId) {
            setEventFilter((com.google.samples.apps.iosched.ui.schedule.filters.EventFilter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventFilter(@Nullable com.google.samples.apps.iosched.ui.schedule.filters.EventFilter EventFilter) {
        this.mEventFilter = EventFilter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.eventFilter);
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
        com.google.samples.apps.iosched.ui.schedule.filters.EventFilter eventFilter = mEventFilter;
        int eventFilterGetSelectedTextColor = 0;
        int eventFilterGetColor = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (eventFilter != null) {
                    // read eventFilter.getSelectedTextColor()
                    eventFilterGetSelectedTextColor = eventFilter.getSelectedTextColor();
                    // read eventFilter.getColor()
                    eventFilterGetColor = eventFilter.getColor();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.filterLabel.setColor(eventFilterGetColor);
            com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragmentKt.eventFilterTextShort(this.filterLabel, eventFilter);
            this.filterLabel.setSelectedTextColor(eventFilterGetSelectedTextColor);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventFilter
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}