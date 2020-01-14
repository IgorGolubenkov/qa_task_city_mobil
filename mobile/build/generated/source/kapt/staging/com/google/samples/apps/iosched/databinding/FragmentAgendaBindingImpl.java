package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAgendaBindingImpl extends FragmentAgendaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 2);
        sViewsWithIds.put(R.id.toolbar, 3);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAgendaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentAgendaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.agenda.AgendaViewModel) variable);
        }
        else if (BR.activityViewModel == variableId) {
            setActivityViewModel((com.google.samples.apps.iosched.ui.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.agenda.AgendaViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setActivityViewModel(@Nullable com.google.samples.apps.iosched.ui.MainActivityViewModel ActivityViewModel) {
        this.mActivityViewModel = ActivityViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoadAgendaResult((androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Block>>) object, fieldId);
            case 1 :
                return onChangeViewModelTimeZoneId((androidx.lifecycle.LiveData<org.threeten.bp.ZoneId>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoadAgendaResult(androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Block>> ViewModelLoadAgendaResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimeZoneId(androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> ViewModelTimeZoneId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Block>> viewModelLoadAgendaResult = null;
        androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> viewModelTimeZoneId = null;
        org.threeten.bp.ZoneId viewModelTimeZoneIdGetValue = null;
        java.util.List<com.google.samples.apps.iosched.model.Block> viewModelLoadAgendaResultGetValue = null;
        com.google.samples.apps.iosched.ui.agenda.AgendaViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x17L) != 0) {



                if (viewModel != null) {
                    // read viewModel.loadAgendaResult
                    viewModelLoadAgendaResult = viewModel.getLoadAgendaResult();
                    // read viewModel.timeZoneId
                    viewModelTimeZoneId = viewModel.getTimeZoneId();
                }
                updateLiveDataRegistration(0, viewModelLoadAgendaResult);
                updateLiveDataRegistration(1, viewModelTimeZoneId);


                if (viewModelLoadAgendaResult != null) {
                    // read viewModel.loadAgendaResult.getValue()
                    viewModelLoadAgendaResultGetValue = viewModelLoadAgendaResult.getValue();
                }
                if (viewModelTimeZoneId != null) {
                    // read viewModel.timeZoneId.getValue()
                    viewModelTimeZoneIdGetValue = viewModelTimeZoneId.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x17L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.agenda.AgendaFragmentKt.agendaItems(this.recyclerView, viewModelLoadAgendaResultGetValue, viewModelTimeZoneIdGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loadAgendaResult
        flag 1 (0x2L): viewModel.timeZoneId
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): activityViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}