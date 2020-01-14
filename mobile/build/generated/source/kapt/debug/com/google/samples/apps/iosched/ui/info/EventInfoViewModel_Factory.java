// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.info;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.logistics.LoadWifiInfoUseCase;
import com.google.samples.apps.iosched.util.wifi.WifiInstaller;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EventInfoViewModel_Factory implements Factory<EventInfoViewModel> {
  private final Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider;

  private final Provider<WifiInstaller> wifiInstallerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public EventInfoViewModel_Factory(Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider,
      Provider<WifiInstaller> wifiInstallerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.loadWifiInfoUseCaseProvider = loadWifiInfoUseCaseProvider;
    this.wifiInstallerProvider = wifiInstallerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  @Override
  public EventInfoViewModel get() {
    return new EventInfoViewModel(loadWifiInfoUseCaseProvider.get(), wifiInstallerProvider.get(), analyticsHelperProvider.get());
  }

  public static EventInfoViewModel_Factory create(
      Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider,
      Provider<WifiInstaller> wifiInstallerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new EventInfoViewModel_Factory(loadWifiInfoUseCaseProvider, wifiInstallerProvider, analyticsHelperProvider);
  }

  public static EventInfoViewModel newInstance(LoadWifiInfoUseCase loadWifiInfoUseCase,
      WifiInstaller wifiInstaller, AnalyticsHelper analyticsHelper) {
    return new EventInfoViewModel(loadWifiInfoUseCase, wifiInstaller, analyticsHelper);
  }
}