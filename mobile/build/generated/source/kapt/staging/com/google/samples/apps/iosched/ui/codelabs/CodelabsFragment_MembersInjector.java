// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.codelabs;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CodelabsFragment_MembersInjector implements MembersInjector<CodelabsFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider;

  private final Provider<Boolean> mapFeatureEnabledProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public CodelabsFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider,
      Provider<Boolean> mapFeatureEnabledProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.tagRecycledViewPoolProvider = tagRecycledViewPoolProvider;
    this.mapFeatureEnabledProvider = mapFeatureEnabledProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<CodelabsFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider,
      Provider<Boolean> mapFeatureEnabledProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new CodelabsFragment_MembersInjector(androidInjectorProvider, viewModelFactoryProvider, tagRecycledViewPoolProvider, mapFeatureEnabledProvider, analyticsHelperProvider);}

  @Override
  public void injectMembers(CodelabsFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectTagRecycledViewPool(instance, tagRecycledViewPoolProvider.get());
    injectMapFeatureEnabled(instance, mapFeatureEnabledProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  public static void injectViewModelFactory(CodelabsFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectTagRecycledViewPool(CodelabsFragment instance,
      RecyclerView.RecycledViewPool tagRecycledViewPool) {
    instance.tagRecycledViewPool = tagRecycledViewPool;
  }

  public static void injectMapFeatureEnabled(CodelabsFragment instance, boolean mapFeatureEnabled) {
    instance.mapFeatureEnabled = mapFeatureEnabled;
  }

  public static void injectAnalyticsHelper(CodelabsFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}