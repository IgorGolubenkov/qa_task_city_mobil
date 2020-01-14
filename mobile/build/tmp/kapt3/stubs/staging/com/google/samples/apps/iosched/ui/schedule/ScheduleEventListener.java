package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "clearFilters", "", "toggleFilter", "filter", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "enabled", "", "mobile_staging"})
public abstract interface ScheduleEventListener extends com.google.samples.apps.iosched.ui.sessioncommon.EventActions {
    
    /**
     * Called from the UI to enable or disable a particular filter.
     */
    public abstract void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.EventFilter filter, boolean enabled);
    
    /**
     * Called from the UI to remove all filters.
     */
    public abstract void clearFilters();
}