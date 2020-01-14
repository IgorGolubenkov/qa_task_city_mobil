package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a*\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007\u00a8\u0006\u0012"}, d2 = {"sessionDateTimeLocation", "", "textView", "Landroid/widget/TextView;", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "zoneId", "Lorg/threeten/bp/ZoneId;", "showTime", "", "room", "Lcom/google/samples/apps/iosched/model/Room;", "setReservationStatus", "Lcom/google/samples/apps/iosched/ui/reservation/ReservationTextView;", "userEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "showReservations", "isReservable", "mobile_debug"})
public final class ScheduleItemBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"sessionStart", "timeZoneId", "showTime", "sessionRoom"})
    public static final void sessionDateTimeLocation(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZoneId zoneId, boolean showTime, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Room room) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"reservationStatus", "showReservations", "isReservable"})
    public static final void setReservationStatus(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.reservation.ReservationTextView textView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, boolean showReservations, boolean isReservable) {
    }
}