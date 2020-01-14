package com.google.samples.apps.iosched.shared.data.login.datasources;

import java.lang.System;

/**
 * A configurable [RegisteredUserDataSource] used for staging.
 *
 * @see LoginModule
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b0\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005R!\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingRegisteredUserDataSource;", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "isRegistered", "", "(Z)V", "()Z", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "getResult", "()Landroidx/lifecycle/MutableLiveData;", "listenToUserChanges", "", "userId", "", "observeResult", "Landroidx/lifecycle/LiveData;", "setAnonymousValue", "mobile_staging"})
public final class StagingRegisteredUserDataSource implements com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> result = null;
    private final boolean isRegistered = false;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> getResult() {
        return null;
    }
    
    @java.lang.Override()
    public void listenToUserChanges(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> observeResult() {
        return null;
    }
    
    @java.lang.Override()
    public void setAnonymousValue() {
    }
    
    public final boolean isRegistered() {
        return false;
    }
    
    public StagingRegisteredUserDataSource(boolean isRegistered) {
        super();
    }
}