package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSpeakerInfoBindingImpl extends ItemSpeakerInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 7);
        sViewsWithIds.put(R.id.guideline_end, 8);
        sViewsWithIds.put(R.id.speaker_links, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSpeakerInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemSpeakerInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (com.google.android.flexbox.FlexboxLayout) bindings[9]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.speakerBio.setTag(null);
        this.speakerLinkGithub.setTag(null);
        this.speakerLinkLinkedin.setTag(null);
        this.speakerLinkTwitter.setTag(null);
        this.speakerLinkWebsite.setTag(null);
        this.speakerName.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSpeaker((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSpeaker(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> ViewModelSpeaker, int fieldId) {
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
        java.lang.String viewModelSpeakerBiography = null;
        java.lang.String viewModelSpeakerWebsiteUrl = null;
        java.lang.String viewModelSpeakerGithubUrl = null;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Speaker> viewModelSpeaker = null;
        java.lang.String viewModelSpeakerLinkedInUrl = null;
        java.lang.String viewModelSpeakerName = null;
        com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel viewModel = mViewModel;
        com.google.samples.apps.iosched.model.Speaker viewModelSpeakerGetValue = null;
        java.lang.String viewModelSpeakerTwitterUrl = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.speaker
                    viewModelSpeaker = viewModel.getSpeaker();
                }
                updateLiveDataRegistration(0, viewModelSpeaker);


                if (viewModelSpeaker != null) {
                    // read viewModel.speaker.getValue()
                    viewModelSpeakerGetValue = viewModelSpeaker.getValue();
                }


                if (viewModelSpeakerGetValue != null) {
                    // read viewModel.speaker.getValue().biography
                    viewModelSpeakerBiography = viewModelSpeakerGetValue.getBiography();
                    // read viewModel.speaker.getValue().websiteUrl
                    viewModelSpeakerWebsiteUrl = viewModelSpeakerGetValue.getWebsiteUrl();
                    // read viewModel.speaker.getValue().githubUrl
                    viewModelSpeakerGithubUrl = viewModelSpeakerGetValue.getGithubUrl();
                    // read viewModel.speaker.getValue().linkedInUrl
                    viewModelSpeakerLinkedInUrl = viewModelSpeakerGetValue.getLinkedInUrl();
                    // read viewModel.speaker.getValue().name
                    viewModelSpeakerName = viewModelSpeakerGetValue.getName();
                    // read viewModel.speaker.getValue().twitterUrl
                    viewModelSpeakerTwitterUrl = viewModelSpeakerGetValue.getTwitterUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakerBio, viewModelSpeakerBiography);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.speakerLinkGithub, viewModelSpeakerGithubUrl, true);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.speakerLinkLinkedin, viewModelSpeakerLinkedInUrl, true);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.speakerLinkTwitter, viewModelSpeakerTwitterUrl, true);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.speakerLinkWebsite, viewModelSpeakerWebsiteUrl, true);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakerName, viewModelSpeakerName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.speaker
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}