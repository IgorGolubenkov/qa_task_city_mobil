package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a)\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000e\u001a \u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013H\u0007\u001a \u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007\u00a8\u0006\u001f"}, d2 = {"eventFilterText", "", "view", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilterView;", "filter", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "eventFilterTextShort", "filterHeader", "textView", "Landroid/widget/TextView;", "hasFilters", "", "eventCount", "", "(Landroid/widget/TextView;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "selectedFilters", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "filters", "", "setClickListenerForFilter", "eventFilter", "viewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "setResetFiltersClickListener", "reset", "Landroid/widget/Button;", "eventFilters", "Landroid/view/ViewGroup;", "listener", "Landroid/view/View$OnClickListener;", "mobile_debug"})
public final class ScheduleFilterFragmentKt {
    
    @androidx.databinding.BindingAdapter(value = {"selectedFilters"})
    public static final void selectedFilters(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter> filters) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"hasFilters", "eventCount"})
    public static final void filterHeader(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean hasFilters, @org.jetbrains.annotations.Nullable()
    java.lang.Integer eventCount) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"eventFilter", "viewModel"})
    public static final void setClickListenerForFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilterView filter, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilter eventFilter, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel) {
    }
    
    /**
     * Sets up the `onClickListener` for the filter reset button, so that it calls the given
     * [listener] with the side effect of animating deselecting any filters.
     */
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"eventFilters", "animatedOnClick"})
    public static final void setResetFiltersClickListener(@org.jetbrains.annotations.NotNull()
    android.widget.Button reset, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup eventFilters, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"eventFilterText"})
    public static final void eventFilterText(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilterView view, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilter filter) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"eventFilterTextShort"})
    public static final void eventFilterTextShort(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilterView view, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilter filter) {
    }
}