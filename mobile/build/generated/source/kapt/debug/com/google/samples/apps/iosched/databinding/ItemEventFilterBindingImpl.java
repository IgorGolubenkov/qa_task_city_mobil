package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEventFilterBindingImpl extends ItemEventFilterBinding  {

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

    public ItemEventFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemEventFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
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
        if (BR.eventFilter == variableId) {
            setEventFilter((com.google.samples.apps.iosched.ui.schedule.filters.EventFilter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventFilter(@Nullable com.google.samples.apps.iosched.ui.schedule.filters.EventFilter EventFilter) {
        this.mEventFilter = EventFilter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventFilter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEventFilterIsChecked((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEventFilterIsChecked(androidx.databinding.ObservableBoolean EventFilterIsChecked, int fieldId) {
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
        androidx.databinding.ObservableBoolean eventFilterIsChecked = null;
        com.google.samples.apps.iosched.ui.schedule.filters.EventFilter eventFilter = mEventFilter;
        int eventFilterGetSelectedTextColor = 0;
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        boolean eventFilterIsCheckedGet = false;
        int eventFilterGetColor = 0;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (eventFilter != null) {
                        // read eventFilter.isChecked
                        eventFilterIsChecked = eventFilter.isChecked();
                    }
                    updateRegistration(0, eventFilterIsChecked);


                    if (eventFilterIsChecked != null) {
                        // read eventFilter.isChecked.get()
                        eventFilterIsCheckedGet = eventFilterIsChecked.get();
                    }
            }
            if ((dirtyFlags & 0xaL) != 0) {

                    if (eventFilter != null) {
                        // read eventFilter.getSelectedTextColor()
                        eventFilterGetSelectedTextColor = eventFilter.getSelectedTextColor();
                        // read eventFilter.getColor()
                        eventFilterGetColor = eventFilter.getColor();
                    }
            }
        }
        if ((dirtyFlags & 0xeL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.filterLabel.setChecked(eventFilterIsCheckedGet);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.filterLabel.setColor(eventFilterGetColor);
            com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragmentKt.eventFilterText(this.filterLabel, eventFilter);
            this.filterLabel.setSelectedTextColor(eventFilterGetSelectedTextColor);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragmentKt.setClickListenerForFilter(this.filterLabel, eventFilter, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventFilter.isChecked
        flag 1 (0x2L): eventFilter
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}