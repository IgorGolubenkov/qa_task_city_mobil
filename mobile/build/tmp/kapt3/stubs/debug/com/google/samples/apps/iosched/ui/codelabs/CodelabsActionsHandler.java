package com.google.samples.apps.iosched.ui.codelabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsActionsHandler;", "", "dismissCodelabsInfoCard", "", "launchCodelabsWebsite", "openCodelabsOnMap", "startCodelab", "codelab", "Lcom/google/samples/apps/iosched/model/Codelab;", "mobile_debug"})
public abstract interface CodelabsActionsHandler {
    
    public abstract void dismissCodelabsInfoCard();
    
    public abstract void openCodelabsOnMap();
    
    public abstract void launchCodelabsWebsite();
    
    public abstract void startCodelab(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Codelab codelab);
}