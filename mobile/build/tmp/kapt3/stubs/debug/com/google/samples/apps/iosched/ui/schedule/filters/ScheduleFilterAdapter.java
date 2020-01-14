package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

/**
 * Adapter for the filters drawer
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001e\u001f B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001dH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006!"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "(Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;)V", "getViewModel", "()Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "createFilterViewHolder", "Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$FilterViewHolder;", "parent", "Landroid/view/ViewGroup;", "createHeadingViewHolder", "Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$HeadingViewHolder;", "getItemViewType", "", "position", "getSpanSize", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "submitEventFilterList", "list", "", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "submitList", "", "Companion", "FilterViewHolder", "HeadingViewHolder", "mobile_debug"})
public final class ScheduleFilterAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.Object, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = null;
    private static final int VIEW_TYPE_HEADING = com.google.samples.apps.iosched.R.layout.item_generic_section_header;
    private static final int VIEW_TYPE_FILTER = com.google.samples.apps.iosched.R.layout.item_event_filter;
    public static final com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Object> list) {
    }
    
    /**
     * Prefer this method over [submitList] to add category headings.
     */
    public final void submitEventFilterList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter> list) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final int getSpanSize(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter.HeadingViewHolder createHeadingViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    private final com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter.FilterViewHolder createFilterViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel getViewModel() {
        return null;
    }
    
    public ScheduleFilterAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel) {
        super(null);
    }
    
    /**
     * ViewHolder for category heading items.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$HeadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;)V", "bind", "", "item", "Lcom/google/samples/apps/iosched/ui/SectionHeader;", "bind$mobile_debug", "mobile_debug"})
    public static final class HeadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding binding = null;
        
        public final void bind$mobile_debug(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.SectionHeader item) {
        }
        
        public HeadingViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding binding) {
            super(null);
        }
    }
    
    /**
     * ViewHolder for [TagFilter] items.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$FilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemEventFilterBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemEventFilterBinding;)V", "bind", "", "item", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "bind$mobile_debug", "mobile_debug"})
    public static final class FilterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.google.samples.apps.iosched.databinding.ItemEventFilterBinding binding = null;
        
        public final void bind$mobile_debug(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.schedule.filters.EventFilter item) {
        }
        
        public FilterViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemEventFilterBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$Companion;", "", "()V", "VIEW_TYPE_FILTER", "", "VIEW_TYPE_HEADING", "insertCategoryHeadings", "", "list", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "mobile_debug"})
    public static final class Companion {
        
        /**
         * Inserts category headings in a list of [EventFilter]s to make a heterogeneous list.
         * Assumes the items are already sorted by the value of [EventFilter.getFilterCategory],
         * with items belonging to [NONE] first.
         */
        private final java.util.List<java.lang.Object> insertCategoryHeadings(java.util.List<? extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter> list) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}