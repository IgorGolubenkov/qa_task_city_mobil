// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.map;

import androidx.lifecycle.ViewModelProvider;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapFragment_MembersInjector implements MembersInjector<MapFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public MapFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<MapFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new MapFragment_MembersInjector(androidInjectorProvider, viewModelFactoryProvider, analyticsHelperProvider);}

  @Override
  public void injectMembers(MapFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  public static void injectViewModelFactory(MapFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectAnalyticsHelper(MapFragment instance, AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}
