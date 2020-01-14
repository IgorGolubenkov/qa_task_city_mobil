package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAgendaLightBindingImpl extends ItemAgendaLightBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(2);
        sIncludes.setIncludes(0, 
            new String[] {"include_agenda_contents"},
            new int[] {1},
            new int[] {com.google.samples.apps.iosched.R.layout.include_agenda_contents});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final com.google.samples.apps.iosched.databinding.IncludeAgendaContentsBinding mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView01;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAgendaLightBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemAgendaLightBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (com.google.samples.apps.iosched.databinding.IncludeAgendaContentsBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView01.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.timeZoneId == variableId) {
            setTimeZoneId((org.threeten.bp.ZoneId) variable);
        }
        else if (BR.agenda == variableId) {
            setAgenda((com.google.samples.apps.iosched.model.Block) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTimeZoneId(@Nullable org.threeten.bp.ZoneId TimeZoneId) {
        this.mTimeZoneId = TimeZoneId;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.timeZoneId);
        super.requestRebind();
    }
    public void setAgenda(@Nullable com.google.samples.apps.iosched.model.Block Agenda) {
        this.mAgenda = Agenda;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.agenda);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
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
        org.threeten.bp.ZoneId timeZoneId = mTimeZoneId;
        com.google.samples.apps.iosched.model.Block agenda = mAgenda;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setAgenda(agenda);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setTimeZoneId(timeZoneId);
        }
        executeBindingsOn(mboundView0);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): timeZoneId
        flag 1 (0x2L): agenda
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}