package com.google.samples.apps.iosched.ui.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/ui/agenda/AgendaViewModel;", "Landroidx/lifecycle/ViewModel;", "loadAgendaUseCase", "Lcom/google/samples/apps/iosched/shared/domain/agenda/LoadAgendaUseCase;", "getTimeZoneUseCase", "Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/agenda/LoadAgendaUseCase;Lcom/google/samples/apps/iosched/shared/domain/settings/GetTimeZoneUseCase;)V", "loadAgendaResult", "Landroidx/lifecycle/LiveData;", "", "Lcom/google/samples/apps/iosched/model/Block;", "getLoadAgendaResult", "()Landroidx/lifecycle/LiveData;", "preferConferenceTimeZoneResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "getTimeZoneId", "mobile_staging"})
public final class AgendaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Block>> loadAgendaResult = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> preferConferenceTimeZoneResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> timeZoneId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.model.Block>> getLoadAgendaResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.threeten.bp.ZoneId> getTimeZoneId() {
        return null;
    }
    
    @javax.inject.Inject()
    public AgendaViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase loadAgendaUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase getTimeZoneUseCase) {
        super();
    }
}