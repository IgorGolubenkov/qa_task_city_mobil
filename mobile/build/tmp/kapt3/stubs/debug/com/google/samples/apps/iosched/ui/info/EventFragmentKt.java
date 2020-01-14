package com.google.samples.apps.iosched.ui.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"bindWifiInfo", "", "textView", "Landroid/widget/TextView;", "wifiInfo", "Lcom/google/samples/apps/iosched/model/ConferenceWifiInfo;", "countdownVisibility", "countdown", "Landroid/view/View;", "ignored", "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "mobile_debug"})
public final class EventFragmentKt {
    
    @androidx.databinding.BindingAdapter(value = {"countdownVisibility"})
    public static final void countdownVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View countdown, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ignored) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"wifiInfo"})
    public static final void bindWifiInfo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.ConferenceWifiInfo wifiInfo) {
    }
}