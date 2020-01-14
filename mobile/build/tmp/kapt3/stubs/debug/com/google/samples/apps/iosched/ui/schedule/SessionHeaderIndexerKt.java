package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"indexSessionHeaders", "", "Lkotlin/Pair;", "", "Lorg/threeten/bp/ZonedDateTime;", "sessions", "Lcom/google/samples/apps/iosched/model/Session;", "zoneId", "Lorg/threeten/bp/ZoneId;", "mobile_debug"})
public final class SessionHeaderIndexerKt {
    
    /**
     * Find the first session at each start time (rounded down to nearest minute) and return pairs of
     * index to start time. Assumes that [sessions] are sorted by ascending start time.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<kotlin.Pair<java.lang.Integer, org.threeten.bp.ZonedDateTime>> indexSessionHeaders(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Session> sessions, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId zoneId) {
        return null;
    }
}