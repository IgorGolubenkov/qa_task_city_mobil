// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.feed;

import androidx.lifecycle.ViewModelProvider;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FeedFragment_MembersInjector implements MembersInjector<FeedFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public FeedFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  public static MembersInjector<FeedFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new FeedFragment_MembersInjector(androidInjectorProvider, viewModelFactoryProvider, snackbarMessageManagerProvider, analyticsHelperProvider);}

  @Override
  public void injectMembers(FeedFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
  }

  public static void injectViewModelFactory(FeedFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectSnackbarMessageManager(FeedFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  public static void injectAnalyticsHelper(FeedFragment instance, AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }
}