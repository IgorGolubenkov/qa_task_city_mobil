// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesPreferenceStorageFactory implements Factory<PreferenceStorage> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvidesPreferenceStorageFactory(AppModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceStorage get() {
    return providesPreferenceStorage(module, contextProvider.get());
  }

  public static AppModule_ProvidesPreferenceStorageFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvidesPreferenceStorageFactory(module, contextProvider);
  }

  public static PreferenceStorage providesPreferenceStorage(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.providesPreferenceStorage(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
