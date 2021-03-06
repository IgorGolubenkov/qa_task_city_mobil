// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.info;

import androidx.lifecycle.ViewModelProvider;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EventFragment_MembersInjector implements MembersInjector<EventFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<Boolean> assistantAppEnabledProvider;

  public EventFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<Boolean> assistantAppEnabledProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.assistantAppEnabledProvider = assistantAppEnabledProvider;
  }

  public static MembersInjector<EventFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<Boolean> assistantAppEnabledProvider) {
    return new EventFragment_MembersInjector(androidInjectorProvider, viewModelFactoryProvider, snackbarMessageManagerProvider, assistantAppEnabledProvider);}

  @Override
  public void injectMembers(EventFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectAssistantAppEnabled(instance, assistantAppEnabledProvider.get());
  }

  public static void injectViewModelFactory(EventFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectSnackbarMessageManager(EventFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  public static void injectAssistantAppEnabled(EventFragment instance,
      boolean assistantAppEnabled) {
    instance.assistantAppEnabled = assistantAppEnabled;
  }
}
