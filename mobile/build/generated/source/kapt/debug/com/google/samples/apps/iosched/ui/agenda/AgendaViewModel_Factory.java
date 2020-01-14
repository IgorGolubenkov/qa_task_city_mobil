// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.agenda;

import com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AgendaViewModel_Factory implements Factory<AgendaViewModel> {
  private final Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  public AgendaViewModel_Factory(Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider) {
    this.loadAgendaUseCaseProvider = loadAgendaUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
  }

  @Override
  public AgendaViewModel get() {
    return new AgendaViewModel(loadAgendaUseCaseProvider.get(), getTimeZoneUseCaseProvider.get());
  }

  public static AgendaViewModel_Factory create(
      Provider<LoadAgendaUseCase> loadAgendaUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider) {
    return new AgendaViewModel_Factory(loadAgendaUseCaseProvider, getTimeZoneUseCaseProvider);
  }

  public static AgendaViewModel newInstance(LoadAgendaUseCase loadAgendaUseCase,
      GetTimeZoneUseCase getTimeZoneUseCase) {
    return new AgendaViewModel(loadAgendaUseCase, getTimeZoneUseCase);
  }
}
