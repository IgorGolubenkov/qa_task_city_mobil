package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeAgendaContentsBindingImpl extends IncludeAgendaContentsBinding  {

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
    private final android.view.View mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeAgendaContentsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private IncludeAgendaContentsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            );
        this.agendaTitle.setTag(null);
        this.duration.setTag(null);
        this.icon.setTag(null);
        this.mboundView0 = (android.view.View) bindings[0];
        this.mboundView0.setTag(null);
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
        org.threeten.bp.ZonedDateTime agendaEndTime = null;
        int agendaStrokeColor = 0;
        org.threeten.bp.ZonedDateTime agendaStartTime = null;
        java.lang.String agendaType = null;
        org.threeten.bp.ZoneId timeZoneId = mTimeZoneId;
        java.lang.String AgendaTitle1 = null;
        int agendaColor = 0;
        com.google.samples.apps.iosched.model.Block agenda = mAgenda;

        if ((dirtyFlags & 0x7L) != 0) {



                if (agenda != null) {
                    // read agenda.endTime
                    agendaEndTime = agenda.getEndTime();
                    // read agenda.startTime
                    agendaStartTime = agenda.getStartTime();
                }
            if ((dirtyFlags & 0x6L) != 0) {

                    if (agenda != null) {
                        // read agenda.strokeColor
                        agendaStrokeColor = agenda.getStrokeColor();
                        // read agenda.type
                        agendaType = agenda.getType();
                        // read agenda.title
                        AgendaTitle1 = agenda.getTitle();
                        // read agenda.color
                        agendaColor = agenda.getColor();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.agendaTitle, AgendaTitle1);
            com.google.samples.apps.iosched.ui.agenda.AgendaItemBindingAdapterKt.agendaIcon(this.icon, agendaType);
            com.google.samples.apps.iosched.ui.agenda.AgendaItemBindingAdapterKt.agendaColor(this.mboundView0, agendaColor, agendaStrokeColor, mboundView0.getResources().getDimension(R.dimen.agenda_item_stroke_width));
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.agenda.AgendaItemBindingAdapterKt.agendaDuration(this.duration, agendaStartTime, agendaEndTime, timeZoneId);
        }
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