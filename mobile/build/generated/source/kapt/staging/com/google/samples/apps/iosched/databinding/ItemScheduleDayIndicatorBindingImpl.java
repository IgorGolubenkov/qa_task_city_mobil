package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemScheduleDayIndicatorBindingImpl extends ItemScheduleDayIndicatorBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemScheduleDayIndicatorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ItemScheduleDayIndicatorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckedTextView) bindings[0]
            );
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        if (BR.indicator == variableId) {
            setIndicator((com.google.samples.apps.iosched.ui.schedule.DayIndicator) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIndicator(@Nullable com.google.samples.apps.iosched.ui.schedule.DayIndicator Indicator) {
        this.mIndicator = Indicator;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.indicator);
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
                return onChangeViewModelIsConferenceTimeZone((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsConferenceTimeZone(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsConferenceTimeZone, int fieldId) {
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
        com.google.samples.apps.iosched.ui.schedule.DayIndicator indicator = mIndicator;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsConferenceTimeZoneGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsConferenceTimeZone = null;
        boolean indicatorChecked = false;
        boolean indicatorEnabled = false;
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelIsConferenceTimeZoneGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xaL) != 0) {

                    if (indicator != null) {
                        // read indicator.checked
                        indicatorChecked = indicator.getChecked();
                        // read indicator.enabled
                        indicatorEnabled = indicator.getEnabled();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.isConferenceTimeZone
                    viewModelIsConferenceTimeZone = viewModel.isConferenceTimeZone();
                }
                updateLiveDataRegistration(0, viewModelIsConferenceTimeZone);


                if (viewModelIsConferenceTimeZone != null) {
                    // read viewModel.isConferenceTimeZone.getValue()
                    viewModelIsConferenceTimeZoneGetValue = viewModelIsConferenceTimeZone.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isConferenceTimeZone.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsConferenceTimeZoneGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsConferenceTimeZoneGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.title.setChecked(indicatorChecked);
            this.title.setEnabled(indicatorEnabled);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.title.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.DayIndicatorAdapterKt.setIndicatorText(this.title, indicator, androidxDatabindingViewDataBindingSafeUnboxViewModelIsConferenceTimeZoneGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // indicator
        com.google.samples.apps.iosched.ui.schedule.DayIndicator indicator = mIndicator;
        // indicator.day
        com.google.samples.apps.iosched.model.ConferenceDay indicatorDay = null;
        // viewModel
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        // indicator != null
        boolean indicatorJavaLangObjectNull = false;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            indicatorJavaLangObjectNull = (indicator) != (null);
            if (indicatorJavaLangObjectNull) {


                indicatorDay = indicator.getDay();

                viewModel.scrollToStartOfDay(indicatorDay);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isConferenceTimeZone
        flag 1 (0x2L): indicator
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}