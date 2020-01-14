package com.google.samples.apps.iosched.ui.sessioncommon;

import java.lang.System;

/**
 * Actions that can be performed on events.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessioncommon/EventActions;", "", "onStarClicked", "", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "openEventDetail", "id", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "mobile_debug"})
public abstract interface EventActions {
    
    public abstract void openEventDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void onStarClicked(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession);
}