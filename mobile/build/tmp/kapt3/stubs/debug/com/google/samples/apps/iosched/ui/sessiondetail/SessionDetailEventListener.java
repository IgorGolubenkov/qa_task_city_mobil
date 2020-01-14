package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailEventListener;", "", "onFeedbackClicked", "", "onLoginClicked", "onReservationClicked", "onSpeakerClicked", "speakerId", "", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "onStarClicked", "mobile_debug"})
public abstract interface SessionDetailEventListener {
    
    public abstract void onReservationClicked();
    
    public abstract void onStarClicked();
    
    public abstract void onLoginClicked();
    
    public abstract void onSpeakerClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String speakerId);
    
    public abstract void onFeedbackClicked();
}