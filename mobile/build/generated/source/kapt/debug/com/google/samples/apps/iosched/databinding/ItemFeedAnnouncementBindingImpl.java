package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFeedAnnouncementBindingImpl extends ItemFeedAnnouncementBinding  {

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
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedAnnouncementBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemFeedAnnouncementBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.image.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.message.setTag(null);
        this.title.setTag(null);
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
            setTimeZoneId((androidx.lifecycle.LiveData<org.threeten.bp.ZoneId>) variable);
        }
        else if (BR.announcement == variableId) {
            setAnnouncement((com.google.samples.apps.iosched.model.Announcement) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTimeZoneId(@Nullable androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> TimeZoneId) {
        this.mTimeZoneId = TimeZoneId;
    }
    public void setAnnouncement(@Nullable com.google.samples.apps.iosched.model.Announcement Announcement) {
        this.mAnnouncement = Announcement;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.announcement);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTimeZoneId((androidx.lifecycle.LiveData<org.threeten.bp.ZoneId>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTimeZoneId(androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> TimeZoneId, int fieldId) {
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
        java.lang.String announcementMessage = null;
        java.lang.String announcementTitle = null;
        java.lang.String announcementImageUrl = null;
        boolean announcementHasImage = false;
        com.google.samples.apps.iosched.model.Announcement announcement = mAnnouncement;

        if ((dirtyFlags & 0x6L) != 0) {



                if (announcement != null) {
                    // read announcement.message
                    announcementMessage = announcement.getMessage();
                    // read announcement.title
                    announcementTitle = announcement.getTitle();
                    // read announcement.imageUrl
                    announcementImageUrl = announcement.getImageUrl();
                    // read announcement.hasImage
                    announcementHasImage = announcement.getHasImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.image, announcementHasImage);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.imageUrl(this.image, announcementImageUrl, getDrawableFromResource(image, R.drawable.generic_placeholder));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, announcementMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, announcementTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): timeZoneId
        flag 1 (0x2L): announcement
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}