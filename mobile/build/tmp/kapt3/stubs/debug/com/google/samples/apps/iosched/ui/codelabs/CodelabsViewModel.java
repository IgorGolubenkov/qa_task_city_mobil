package com.google.samples.apps.iosched.ui.codelabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsViewModel;", "Landroidx/lifecycle/ViewModel;", "loadCodelabsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/codelabs/LoadCodelabsUseCase;", "getCodelabsInfoCardShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/codelabs/GetCodelabsInfoCardShownUseCase;", "setCodelabsInfoCardShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/codelabs/SetCodelabsInfoCardShownUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/codelabs/LoadCodelabsUseCase;Lcom/google/samples/apps/iosched/shared/domain/codelabs/GetCodelabsInfoCardShownUseCase;Lcom/google/samples/apps/iosched/shared/domain/codelabs/SetCodelabsInfoCardShownUseCase;)V", "codelabs", "Landroidx/lifecycle/LiveData;", "", "", "getCodelabs", "()Landroidx/lifecycle/LiveData;", "codelabsUseCaseResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/model/Codelab;", "infoCardShownResult", "", "dismissCodelabsInfoCard", "", "mobile_debug"})
public final class CodelabsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> infoCardShownResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.Codelab>>> codelabsUseCaseResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> codelabs = null;
    private final com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase setCodelabsInfoCardShownUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getCodelabs() {
        return null;
    }
    
    public final void dismissCodelabsInfoCard() {
    }
    
    @javax.inject.Inject()
    public CodelabsViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase loadCodelabsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase getCodelabsInfoCardShownUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase setCodelabsInfoCardShownUseCase) {
        super();
    }
}