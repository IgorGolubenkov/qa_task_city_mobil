package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "openLiveStream", "", "liveStreamUrl", "", "openMap", "moment", "Lcom/google/samples/apps/iosched/model/Moment;", "openSchedule", "showOnlyPinnedSessions", "", "signIn", "mobile_staging"})
public abstract interface FeedEventListener extends com.google.samples.apps.iosched.ui.sessioncommon.EventActions {
    
    public abstract void openSchedule(boolean showOnlyPinnedSessions);
    
    public abstract void signIn();
    
    public abstract void openMap(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Moment moment);
    
    public abstract void openLiveStream(@org.jetbrains.annotations.NotNull()
    java.lang.String liveStreamUrl);
}