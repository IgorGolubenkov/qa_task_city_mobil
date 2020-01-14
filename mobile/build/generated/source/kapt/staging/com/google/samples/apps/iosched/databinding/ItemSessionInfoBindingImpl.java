package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSessionInfoBindingImpl extends ItemSessionInfoBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 10);
        sViewsWithIds.put(R.id.guideline_end, 11);
        sViewsWithIds.put(R.id.session_detail_level_barrier, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSessionInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemSessionInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.Barrier) bindings[12]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.sessionDetailCountdownTimer.setTag(null);
        this.sessionDetailDescription.setTag(null);
        this.sessionDetailFeedbackButton.setTag(null);
        this.sessionDetailLevel.setTag(null);
        this.sessionDetailRecorded.setTag(null);
        this.sessionDetailRoom.setTag(null);
        this.sessionDetailTime.setTag(null);
        this.sessionDetailTitle.setTag(null);
        this.tags.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.tagViewPool == variableId) {
            setTagViewPool((androidx.recyclerview.widget.RecyclerView.RecycledViewPool) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTagViewPool(@Nullable androidx.recyclerview.widget.RecyclerView.RecycledViewPool TagViewPool) {
        this.mTagViewPool = TagViewPool;
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSession((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session>) object, fieldId);
            case 1 :
                return onChangeViewModelShowFeedbackButton((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelTimeUntilStart((androidx.lifecycle.LiveData<org.threeten.bp.Duration>) object, fieldId);
            case 3 :
                return onChangeViewModelTimeZoneId((androidx.lifecycle.LiveData<org.threeten.bp.ZoneId>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSession(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> ViewModelSession, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowFeedbackButton(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowFeedbackButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimeUntilStart(androidx.lifecycle.LiveData<org.threeten.bp.Duration> ViewModelTimeUntilStart, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimeZoneId(androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> ViewModelTimeZoneId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        com.google.samples.apps.iosched.model.Room viewModelSessionRoom = null;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Session> viewModelSession = null;
        java.lang.String viewModelSessionLevelTagDisplayName = null;
        java.lang.Boolean viewModelShowFeedbackButtonGetValue = null;
        com.google.samples.apps.iosched.model.Session viewModelSessionGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowFeedbackButton = null;
        boolean viewModelSessionIsLivestream = false;
        java.lang.String viewModelSessionDescription = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowFeedbackButtonGetValue = false;
        androidx.lifecycle.LiveData<org.threeten.bp.Duration> viewModelTimeUntilStart = null;
        java.lang.String viewModelSessionTitle = null;
        androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> viewModelTimeZoneId = null;
        org.threeten.bp.ZoneId viewModelTimeZoneIdGetValue = null;
        org.threeten.bp.Duration viewModelTimeUntilStartGetValue = null;
        java.lang.String viewModelSessionRoomName = null;
        boolean viewModelSessionLevelTagJavaLangObjectNull = false;
        org.threeten.bp.ZonedDateTime viewModelSessionEndTime = null;
        java.util.List<com.google.samples.apps.iosched.model.Tag> viewModelSessionDisplayTags = null;
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel viewModel = mViewModel;
        org.threeten.bp.ZonedDateTime viewModelSessionStartTime = null;
        com.google.samples.apps.iosched.model.Tag viewModelSessionLevelTag = null;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x69L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.session
                        viewModelSession = viewModel.getSession();
                        // read viewModel.timeZoneId
                        viewModelTimeZoneId = viewModel.getTimeZoneId();
                    }
                    updateLiveDataRegistration(0, viewModelSession);
                    updateLiveDataRegistration(3, viewModelTimeZoneId);


                    if (viewModelSession != null) {
                        // read viewModel.session.getValue()
                        viewModelSessionGetValue = viewModelSession.getValue();
                    }
                    if (viewModelTimeZoneId != null) {
                        // read viewModel.timeZoneId.getValue()
                        viewModelTimeZoneIdGetValue = viewModelTimeZoneId.getValue();
                    }

                if ((dirtyFlags & 0x61L) != 0) {

                        if (viewModelSessionGetValue != null) {
                            // read viewModel.session.getValue().room
                            viewModelSessionRoom = viewModelSessionGetValue.getRoom();
                            // read viewModel.session.getValue().isLivestream
                            viewModelSessionIsLivestream = viewModelSessionGetValue.isLivestream();
                            // read viewModel.session.getValue().description
                            viewModelSessionDescription = viewModelSessionGetValue.getDescription();
                            // read viewModel.session.getValue().title
                            viewModelSessionTitle = viewModelSessionGetValue.getTitle();
                            // read viewModel.session.getValue().displayTags
                            viewModelSessionDisplayTags = viewModelSessionGetValue.getDisplayTags();
                            // read viewModel.session.getValue().levelTag
                            viewModelSessionLevelTag = viewModelSessionGetValue.levelTag();
                        }


                        if (viewModelSessionRoom != null) {
                            // read viewModel.session.getValue().room.name
                            viewModelSessionRoomName = viewModelSessionRoom.getName();
                        }
                        if (viewModelSessionLevelTag != null) {
                            // read viewModel.session.getValue().levelTag.displayName
                            viewModelSessionLevelTagDisplayName = viewModelSessionLevelTag.getDisplayName();
                        }
                        // read viewModel.session.getValue().levelTag != null
                        viewModelSessionLevelTagJavaLangObjectNull = (viewModelSessionLevelTag) != (null);
                }

                    if (viewModelSessionGetValue != null) {
                        // read viewModel.session.getValue().endTime
                        viewModelSessionEndTime = viewModelSessionGetValue.getEndTime();
                        // read viewModel.session.getValue().startTime
                        viewModelSessionStartTime = viewModelSessionGetValue.getStartTime();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showFeedbackButton
                        viewModelShowFeedbackButton = viewModel.getShowFeedbackButton();
                    }
                    updateLiveDataRegistration(1, viewModelShowFeedbackButton);


                    if (viewModelShowFeedbackButton != null) {
                        // read viewModel.showFeedbackButton.getValue()
                        viewModelShowFeedbackButtonGetValue = viewModelShowFeedbackButton.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showFeedbackButton.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowFeedbackButtonGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowFeedbackButtonGetValue);
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timeUntilStart
                        viewModelTimeUntilStart = viewModel.getTimeUntilStart();
                    }
                    updateLiveDataRegistration(2, viewModelTimeUntilStart);


                    if (viewModelTimeUntilStart != null) {
                        // read viewModel.timeUntilStart.getValue()
                        viewModelTimeUntilStartGetValue = viewModelTimeUntilStart.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.sessionStartCountdown(this.sessionDetailCountdownTimer, viewModelTimeUntilStartGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailDescription, viewModelSessionDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailLevel, viewModelSessionLevelTagDisplayName);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.sessionDetailLevel, viewModelSessionLevelTagJavaLangObjectNull);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.sessionDetailRecorded, viewModelSessionIsLivestream);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailRoom, viewModelSessionRoomName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailTitle, viewModelSessionTitle);
            com.google.samples.apps.iosched.ui.sessioncommon.TagBindingAdaptersKt.topicTags(this.tags, viewModelSessionDisplayTags);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.sessionDetailFeedbackButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.sessionDetailFeedbackButton, androidxDatabindingViewDataBindingSafeUnboxViewModelShowFeedbackButtonGetValue);
        }
        if ((dirtyFlags & 0x69L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.timeString(this.sessionDetailTime, viewModelSessionStartTime, viewModelSessionEndTime, viewModelTimeZoneIdGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onFeedbackClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.session
        flag 1 (0x2L): viewModel.showFeedbackButton
        flag 2 (0x3L): viewModel.timeUntilStart
        flag 3 (0x4L): viewModel.timeZoneId
        flag 4 (0x5L): tagViewPool
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}