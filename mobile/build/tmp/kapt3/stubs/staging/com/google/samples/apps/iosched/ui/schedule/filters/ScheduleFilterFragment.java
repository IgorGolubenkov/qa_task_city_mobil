package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

/**
 * Fragment that shows the list of filters for the Schedule
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "behavior", "Lcom/google/samples/apps/iosched/widget/BottomSheetBehavior;", "binding", "Lcom/google/samples/apps/iosched/databinding/FragmentScheduleFilterBinding;", "contentFadeInterpolator", "Landroidx/interpolator/view/animation/LinearOutSlowInInterpolator;", "descriptionAlpha", "Landroidx/databinding/ObservableFloat;", "filterAdapter", "Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter;", "headerAlpha", "recyclerviewAlpha", "viewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "updateFilterContentsAlpha", "slideOffset", "", "Companion", "mobile_staging"})
public final class ScheduleFilterFragment extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel;
    private com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter filterAdapter;
    private com.google.samples.apps.iosched.databinding.FragmentScheduleFilterBinding binding;
    private com.google.samples.apps.iosched.widget.BottomSheetBehavior<?> behavior;
    private androidx.databinding.ObservableFloat headerAlpha;
    private androidx.databinding.ObservableFloat descriptionAlpha;
    private androidx.databinding.ObservableFloat recyclerviewAlpha;
    private final androidx.interpolator.view.animation.LinearOutSlowInInterpolator contentFadeInterpolator = null;
    private static final float ALPHA_CHANGEOVER = 0.33F;
    private static final float ALPHA_DESC_MAX = 0.0F;
    private static final float ALPHA_HEADER_MAX = 0.67F;
    private static final float ALPHA_CONTENT_END_ALPHA = 1.0F;
    private static final float ALPHA_CONTENT_START_ALPHA = 0.2F;
    public static final com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateFilterContentsAlpha(float slideOffset) {
    }
    
    public ScheduleFilterFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterFragment$Companion;", "", "()V", "ALPHA_CHANGEOVER", "", "ALPHA_CONTENT_END_ALPHA", "ALPHA_CONTENT_START_ALPHA", "ALPHA_DESC_MAX", "ALPHA_HEADER_MAX", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}