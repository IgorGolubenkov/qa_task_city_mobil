// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesAnalyticsHelperFactory implements Factory<AnalyticsHelper> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  private final Provider<SignInViewModelDelegate> signInDelegateProvider;

  private final Provider<PreferenceStorage> preferenceStorageProvider;

  public AppModule_ProvidesAnalyticsHelperFactory(AppModule module,
      Provider<Context> contextProvider, Provider<SignInViewModelDelegate> signInDelegateProvider,
      Provider<PreferenceStorage> preferenceStorageProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.signInDelegateProvider = signInDelegateProvider;
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public AnalyticsHelper get() {
    return providesAnalyticsHelper(module, contextProvider.get(), signInDelegateProvider.get(), preferenceStorageProvider.get());
  }

  public static AppModule_ProvidesAnalyticsHelperFactory create(AppModule module,
      Provider<Context> contextProvider, Provider<SignInViewModelDelegate> signInDelegateProvider,
      Provider<PreferenceStorage> preferenceStorageProvider) {
    return new AppModule_ProvidesAnalyticsHelperFactory(module, contextProvider, signInDelegateProvider, preferenceStorageProvider);
  }

  public static AnalyticsHelper providesAnalyticsHelper(AppModule instance, Context context,
      SignInViewModelDelegate signInDelegate, PreferenceStorage preferenceStorage) {
    return Preconditions.checkNotNull(instance.providesAnalyticsHelper(context, signInDelegate, preferenceStorage), "Cannot return null from a non-@Nullable @Provides method");
  }
}
