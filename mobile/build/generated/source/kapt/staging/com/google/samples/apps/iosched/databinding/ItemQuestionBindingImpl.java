package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemQuestionBindingImpl extends ItemQuestionBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (com.google.samples.apps.iosched.widget.SimpleRatingBar) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.itemQuestion.setTag(null);
        this.labelEnd.setTag(null);
        this.labelStart.setTag(null);
        this.rating.setTag(null);
        this.text.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.question == variableId) {
            setQuestion((com.google.samples.apps.iosched.ui.sessiondetail.Question) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestion(@Nullable com.google.samples.apps.iosched.ui.sessiondetail.Question Question) {
        this.mQuestion = Question;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.question);
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
        int questionCurrentRating = 0;
        int questionLabelStart = 0;
        int questionLabelEnd = 0;
        int questionCurrentRatingInt1 = 0;
        int questionText = 0;
        com.google.samples.apps.iosched.ui.sessiondetail.Question question = mQuestion;

        if ((dirtyFlags & 0x3L) != 0) {



                if (question != null) {
                    // read question.currentRating
                    questionCurrentRating = question.getCurrentRating();
                    // read question.labelStart
                    questionLabelStart = question.getLabelStart();
                    // read question.labelEnd
                    questionLabelEnd = question.getLabelEnd();
                    // read question.text
                    questionText = question.getText();
                }


                // read (question.currentRating) - (1)
                questionCurrentRatingInt1 = (questionCurrentRating) - (1);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.labelEnd, questionLabelEnd);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.labelStart, questionLabelStart);
            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.rating, questionCurrentRatingInt1);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.text, questionText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): question
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}