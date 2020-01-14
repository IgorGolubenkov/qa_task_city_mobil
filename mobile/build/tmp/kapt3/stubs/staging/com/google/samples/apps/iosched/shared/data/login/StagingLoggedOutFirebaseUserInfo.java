package com.google.samples.apps.iosched.shared.data.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/StagingLoggedOutFirebaseUserInfo;", "Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthenticatedUserInfo;", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPhotoUrl", "Landroid/net/Uri;", "isRegistered", "", "isRegistrationDataReady", "isSignedIn", "mobile_staging"})
public final class StagingLoggedOutFirebaseUserInfo extends com.google.samples.apps.iosched.shared.data.login.datasources.StagingAuthenticatedUserInfo {
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.net.Uri getPhotoUrl() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistrationDataReady() {
        return false;
    }
    
    public StagingLoggedOutFirebaseUserInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context _context) {
        super(null, false, false, null);
    }
}