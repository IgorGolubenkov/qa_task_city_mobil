package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSessionBindingImpl extends ItemSessionBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 7);
        sViewsWithIds.put(R.id.guideline_end, 8);
        sViewsWithIds.put(R.id.tags_barrier, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.internal.CheckableImageButton) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (com.google.samples.apps.iosched.ui.reservation.ReservationTextView) bindings[3]
            , (com.google.samples.apps.iosched.widget.NoTouchRecyclerView) bindings[6]
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            , (android.widget.TextView) bindings[1]
            );
        this.bookmarkSession.setTag(null);
        this.lengthLocation.setTag(null);
        this.livestreamIcon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.reservationStatus.setTag(null);
        this.tags.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 2);
        mCallback10 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.userSession == variableId) {
            setUserSession((com.google.samples.apps.iosched.model.userdata.UserSession) variable);
        }
        else if (BR.eventListener == variableId) {
            setEventListener((com.google.samples.apps.iosched.ui.sessioncommon.EventActions) variable);
        }
        else if (BR.showReservations == variableId) {
            setShowReservations((androidx.lifecycle.LiveData<java.lang.Boolean>) variable);
        }
        else if (BR.showTime == variableId) {
            setShowTime((java.lang.Boolean) variable);
        }
        else if (BR.timeZoneId == variableId) {
            setTimeZoneId((androidx.lifecycle.LiveData<org.threeten.bp.ZoneId>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserSession(@Nullable com.google.samples.apps.iosched.model.userdata.UserSession UserSession) {
        this.mUserSession = UserSession;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.userSession);
        super.requestRebind();
    }
    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.sessioncommon.EventActions EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }
    public void setShowReservations(@Nullable androidx.lifecycle.LiveData<java.lang.Boolean> ShowReservations) {
        updateLiveDataRegistration(0, ShowReservations);
        this.mShowReservations = ShowReservations;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showReservations);
        super.requestRebind();
    }
    public void setShowTime(@Nullable java.lang.Boolean ShowTime) {
        this.mShowTime = ShowTime;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.showTime);
        super.requestRebind();
    }
    public void setTimeZoneId(@Nullable androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> TimeZoneId) {
        updateLiveDataRegistration(1, TimeZoneId);
        this.mTimeZoneId = TimeZoneId;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.timeZoneId);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeShowReservations((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeTimeZoneId((androidx.lifecycle.LiveData<org.threeten.bp.ZoneId>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeShowReservations(androidx.lifecycle.LiveData<java.lang.Boolean> ShowReservations, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTimeZoneId(androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> TimeZoneId, int fieldId) {
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
        com.google.samples.apps.iosched.model.userdata.UserSession userSession = mUserSession;
        com.google.samples.apps.iosched.ui.sessioncommon.EventActions eventListener = mEventListener;
        com.google.samples.apps.iosched.model.Room userSessionSessionRoom = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowReservationsGetValue = false;
        boolean userSessionUserEventIsStarred = false;
        java.util.List<com.google.samples.apps.iosched.model.Tag> userSessionSessionDisplayTags = null;
        org.threeten.bp.ZoneId timeZoneIdGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShowTime = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> showReservations = mShowReservations;
        java.lang.Boolean showReservationsGetValue = null;
        boolean userSessionSessionIsReservable = false;
        java.lang.Boolean showTime = mShowTime;
        boolean userSessionSessionIsLivestream = false;
        androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = mTimeZoneId;
        com.google.samples.apps.iosched.model.Session userSessionSession = null;
        org.threeten.bp.ZonedDateTime userSessionSessionStartTime = null;
        com.google.samples.apps.iosched.model.userdata.UserEvent userSessionUserEvent = null;
        java.lang.String userSessionSessionTitle = null;

        if ((dirtyFlags & 0x37L) != 0) {



                if (userSession != null) {
                    // read userSession.session
                    userSessionSession = userSession.getSession();
                }

            if ((dirtyFlags & 0x36L) != 0) {

                    if (userSessionSession != null) {
                        // read userSession.session.room
                        userSessionSessionRoom = userSessionSession.getRoom();
                        // read userSession.session.startTime
                        userSessionSessionStartTime = userSessionSession.getStartTime();
                    }
            }
            if ((dirtyFlags & 0x24L) != 0) {

                    if (userSessionSession != null) {
                        // read userSession.session.displayTags
                        userSessionSessionDisplayTags = userSessionSession.getDisplayTags();
                        // read userSession.session.isLivestream
                        userSessionSessionIsLivestream = userSessionSession.isLivestream();
                        // read userSession.session.title
                        userSessionSessionTitle = userSessionSession.getTitle();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (userSessionSession != null) {
                        // read userSession.session.isReservable
                        userSessionSessionIsReservable = userSessionSession.isReservable();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (userSession != null) {
                        // read userSession.userEvent
                        userSessionUserEvent = userSession.getUserEvent();
                    }

                if ((dirtyFlags & 0x24L) != 0) {

                        if (userSessionUserEvent != null) {
                            // read userSession.userEvent.isStarred
                            userSessionUserEventIsStarred = userSessionUserEvent.isStarred();
                        }
                }
            }
        }
        if ((dirtyFlags & 0x25L) != 0) {



                if (showReservations != null) {
                    // read showReservations.getValue()
                    showReservationsGetValue = showReservations.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(showReservations.getValue())
                androidxDatabindingViewDataBindingSafeUnboxShowReservationsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(showReservationsGetValue);
        }
        if ((dirtyFlags & 0x36L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showTime)
                androidxDatabindingViewDataBindingSafeUnboxShowTime = androidx.databinding.ViewDataBinding.safeUnbox(showTime);
                if (timeZoneId != null) {
                    // read timeZoneId.getValue()
                    timeZoneIdGetValue = timeZoneId.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.bookmarkSession.setChecked(userSessionUserEventIsStarred);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.livestreamIcon, userSessionSessionIsLivestream);
            com.google.samples.apps.iosched.ui.sessioncommon.TagBindingAdaptersKt.topicTags(this.tags, userSessionSessionDisplayTags);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, userSessionSessionTitle);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.bookmarkSession.setOnClickListener(mCallback11);
            this.mboundView0.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x36L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.ScheduleItemBindingAdapterKt.sessionDateTimeLocation(this.lengthLocation, userSessionSessionStartTime, timeZoneIdGetValue, androidxDatabindingViewDataBindingSafeUnboxShowTime, userSessionSessionRoom);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.ScheduleItemBindingAdapterKt.setReservationStatus(this.reservationStatus, userSessionUserEvent, androidxDatabindingViewDataBindingSafeUnboxShowReservationsGetValue, userSessionSessionIsReservable);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // userSession
                com.google.samples.apps.iosched.model.userdata.UserSession userSession = mUserSession;
                // eventListener
                com.google.samples.apps.iosched.ui.sessioncommon.EventActions eventListener = mEventListener;
                // eventListener != null
                boolean eventListenerJavaLangObjectNull = false;



                eventListenerJavaLangObjectNull = (eventListener) != (null);
                if (eventListenerJavaLangObjectNull) {



                    eventListener.onStarClicked(userSession);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // userSession
                com.google.samples.apps.iosched.model.userdata.UserSession userSession = mUserSession;
                // userSession.session
                com.google.samples.apps.iosched.model.Session userSessionSession = null;
                // eventListener
                com.google.samples.apps.iosched.ui.sessioncommon.EventActions eventListener = mEventListener;
                // eventListener != null
                boolean eventListenerJavaLangObjectNull = false;
                // userSession.session.id
                java.lang.String userSessionSessionId = null;
                // userSession != null
                boolean userSessionJavaLangObjectNull = false;
                // userSession.session != null
                boolean userSessionSessionJavaLangObjectNull = false;



                eventListenerJavaLangObjectNull = (eventListener) != (null);
                if (eventListenerJavaLangObjectNull) {



                    userSessionJavaLangObjectNull = (userSession) != (null);
                    if (userSessionJavaLangObjectNull) {


                        userSessionSession = userSession.getSession();

                        userSessionSessionJavaLangObjectNull = (userSessionSession) != (null);
                        if (userSessionSessionJavaLangObjectNull) {


                            userSessionSessionId = userSessionSession.getId();

                            eventListener.openEventDetail(userSessionSessionId);
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showReservations
        flag 1 (0x2L): timeZoneId
        flag 2 (0x3L): userSession
        flag 3 (0x4L): eventListener
        flag 4 (0x5L): showTime
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}