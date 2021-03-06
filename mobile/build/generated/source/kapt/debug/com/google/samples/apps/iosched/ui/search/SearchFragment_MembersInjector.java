// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.search;

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
public final class SearchFragment_MembersInjector implements MembersInjector<SearchFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public SearchFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SearchFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new SearchFragment_MembersInjector(androidInjectorProvider, analyticsHelperProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(SearchFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectAnalyticsHelper(SearchFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }

  public static void injectViewModelFactory(SearchFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
