// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.map;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoadGeoJsonFeaturesUseCase_Factory implements Factory<LoadGeoJsonFeaturesUseCase> {
  private final Provider<Context> contextProvider;

  public LoadGeoJsonFeaturesUseCase_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public LoadGeoJsonFeaturesUseCase get() {
    return new LoadGeoJsonFeaturesUseCase(contextProvider.get());
  }

  public static LoadGeoJsonFeaturesUseCase_Factory create(Provider<Context> contextProvider) {
    return new LoadGeoJsonFeaturesUseCase_Factory(contextProvider);
  }

  public static LoadGeoJsonFeaturesUseCase newInstance(Context context) {
    return new LoadGeoJsonFeaturesUseCase(context);
  }
}
