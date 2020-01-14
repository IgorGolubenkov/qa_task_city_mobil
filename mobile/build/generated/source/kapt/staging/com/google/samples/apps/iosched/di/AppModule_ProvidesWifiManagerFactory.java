// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.di;

import android.content.Context;
import android.net.wifi.WifiManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesWifiManagerFactory implements Factory<WifiManager> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvidesWifiManagerFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public WifiManager get() {
    return providesWifiManager(module, contextProvider.get());
  }

  public static AppModule_ProvidesWifiManagerFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvidesWifiManagerFactory(module, contextProvider);
  }

  public static WifiManager providesWifiManager(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.providesWifiManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}