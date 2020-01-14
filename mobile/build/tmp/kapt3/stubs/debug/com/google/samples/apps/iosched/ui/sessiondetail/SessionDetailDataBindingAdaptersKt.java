package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u001a\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001a\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007\u001a.\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007\u00a8\u0006\u001e"}, d2 = {"assignFab", "", "fab", "Lcom/google/samples/apps/iosched/ui/reservation/StarReserveFab;", "userEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "isSignedIn", "", "isRegistered", "isReservable", "isReservationDisabled", "eventListener", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailEventListener;", "eventNarrowHeaderImage", "imageView", "Landroid/widget/ImageView;", "session", "Lcom/google/samples/apps/iosched/model/Session;", "eventPhoto", "sessionStartCountdown", "view", "Landroid/widget/TextView;", "timeUntilStart", "Lorg/threeten/bp/Duration;", "timeString", "sessionDetailStartTime", "Lorg/threeten/bp/ZonedDateTime;", "sessionDetailEndTime", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "mobile_debug"})
public final class SessionDetailDataBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"eventNarrowHeader"})
    public static final void eventNarrowHeaderImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session session) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"eventPhoto"})
    public static final void eventPhoto(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session session) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"sessionDetailStartTime", "sessionDetailEndTime", "timeZoneId"})
    public static final void timeString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZonedDateTime sessionDetailStartTime, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZonedDateTime sessionDetailEndTime, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZoneId timeZoneId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"sessionStartCountdown"})
    public static final void sessionStartCountdown(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.Duration timeUntilStart) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"userEvent", "isSignedIn", "isRegistered", "isReservable", "isReservationDisabled", "eventListener"})
    public static final void assignFab(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.reservation.StarReserveFab fab, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, boolean isSignedIn, boolean isRegistered, boolean isReservable, boolean isReservationDisabled, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailEventListener eventListener) {
    }
}