package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFeedMomentBindingImpl extends ItemFeedMomentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.momentImageCard, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedMomentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemFeedMomentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            );
        this.actionButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.momentImage.setTag(null);
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
        if (BR.eventListener == variableId) {
            setEventListener((com.google.samples.apps.iosched.ui.feed.FeedEventListener) variable);
        }
        else if (BR.moment == variableId) {
            setMoment((com.google.samples.apps.iosched.model.Moment) variable);
        }
        else if (BR.userInfo == variableId) {
            setUserInfo((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>) variable);
        }
        else if (BR.theme == variableId) {
            setTheme((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.feed.FeedEventListener EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }
    public void setMoment(@Nullable com.google.samples.apps.iosched.model.Moment Moment) {
        this.mMoment = Moment;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.moment);
        super.requestRebind();
    }
    public void setUserInfo(@Nullable androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> UserInfo) {
        updateLiveDataRegistration(0, UserInfo);
        this.mUserInfo = UserInfo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userInfo);
        super.requestRebind();
    }
    public void setTheme(@Nullable androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> Theme) {
        updateLiveDataRegistration(1, Theme);
        this.mTheme = Theme;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.theme);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserInfo((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>) object, fieldId);
            case 1 :
                return onChangeTheme((androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserInfo(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> UserInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTheme(androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> Theme, int fieldId) {
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
        java.lang.String momentImageUrlDarkTheme = null;
        com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
        com.google.samples.apps.iosched.model.Moment moment = mMoment;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> userInfo = mUserInfo;
        androidx.lifecycle.LiveData<com.google.samples.apps.iosched.model.Theme> theme = mTheme;
        com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo userInfoGetValue = null;
        com.google.samples.apps.iosched.model.Theme themeGetValue = null;
        java.lang.String momentImageUrl = null;

        if ((dirtyFlags & 0x1dL) != 0) {



                if (userInfo != null) {
                    // read userInfo.getValue()
                    userInfoGetValue = userInfo.getValue();
                }
        }
        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x1aL) != 0) {

                    if (moment != null) {
                        // read moment.imageUrlDarkTheme
                        momentImageUrlDarkTheme = moment.getImageUrlDarkTheme();
                        // read moment.imageUrl
                        momentImageUrl = moment.getImageUrl();
                    }
            }
            if ((dirtyFlags & 0x1dL) != 0) {
            }
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                if (theme != null) {
                    // read theme.getValue()
                    themeGetValue = theme.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x1dL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.feed.FeedHeaderViewBindersKt.setMomentActionButton(this.actionButton, moment, userInfoGetValue, eventListener);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.momentImageUrl(this.momentImage, momentImageUrl, momentImageUrlDarkTheme, themeGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userInfo
        flag 1 (0x2L): theme
        flag 2 (0x3L): eventListener
        flag 3 (0x4L): moment
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}