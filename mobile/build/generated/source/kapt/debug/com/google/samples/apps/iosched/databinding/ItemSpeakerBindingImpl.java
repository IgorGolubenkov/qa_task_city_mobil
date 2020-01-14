package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSpeakerBindingImpl extends ItemSpeakerBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSpeakerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemSpeakerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.speakerItemCompany.setTag(null);
        this.speakerItemHeadshot.setTag(null);
        this.speakerItemName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
            setEventListener((com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener) variable);
        }
        else if (BR.speaker == variableId) {
            setSpeaker((com.google.samples.apps.iosched.model.Speaker) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }
    public void setSpeaker(@Nullable com.google.samples.apps.iosched.model.Speaker Speaker) {
        this.mSpeaker = Speaker;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.speaker);
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
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener eventListener = mEventListener;
        boolean speakerHasCompany = false;
        java.lang.String speakerCompany = null;
        com.google.samples.apps.iosched.model.Speaker speaker = mSpeaker;
        java.lang.String speakerId = null;
        java.lang.String speakerName = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (speaker != null) {
                    // read speaker.hasCompany
                    speakerHasCompany = speaker.getHasCompany();
                    // read speaker.company
                    speakerCompany = speaker.getCompany();
                    // read speaker.id
                    speakerId = speaker.getId();
                    // read speaker.name
                    speakerName = speaker.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakerItemCompany, speakerCompany);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.speakerItemCompany, speakerHasCompany);
            com.google.samples.apps.iosched.ui.speaker.SpeakerBindingAdaptersKt.speakerImage(this.speakerItemHeadshot, speaker, (com.google.samples.apps.iosched.ui.speaker.ImageLoadListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakerItemName, speakerName);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.speakerItemHeadshot.setTransitionName(speakerId);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // eventListener
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener eventListener = mEventListener;
        // eventListener != null
        boolean eventListenerJavaLangObjectNull = false;
        // speaker != null
        boolean speakerJavaLangObjectNull = false;
        // speaker
        com.google.samples.apps.iosched.model.Speaker speaker = mSpeaker;
        // speaker.id
        java.lang.String speakerId = null;



        eventListenerJavaLangObjectNull = (eventListener) != (null);
        if (eventListenerJavaLangObjectNull) {



            speakerJavaLangObjectNull = (speaker) != (null);
            if (speakerJavaLangObjectNull) {


                speakerId = speaker.getId();

                eventListener.onSpeakerClicked(speakerId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventListener
        flag 1 (0x2L): speaker
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}