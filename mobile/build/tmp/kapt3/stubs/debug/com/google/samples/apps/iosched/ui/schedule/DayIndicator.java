package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * An indicator for days on the Schedule.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/DayIndicator;", "", "day", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "checked", "", "enabled", "(Lcom/google/samples/apps/iosched/model/ConferenceDay;ZZ)V", "getChecked", "()Z", "getDay", "()Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getEnabled", "areUiContentsTheSame", "other", "equals", "hashCode", "", "mobile_debug"})
public final class DayIndicator {
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.model.ConferenceDay day = null;
    private final boolean checked = false;
    private final boolean enabled = false;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final boolean areUiContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.DayIndicator other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.model.ConferenceDay getDay() {
        return null;
    }
    
    public final boolean getChecked() {
        return false;
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public DayIndicator(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.ConferenceDay day, boolean checked, boolean enabled) {
        super();
    }
}