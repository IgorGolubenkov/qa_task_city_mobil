// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.signin;

import com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory implements Factory<SignInViewModelDelegate> {
  private final SignInViewModelDelegateModule module;

  private final Provider<ObserveUserAuthStateUseCase> dataSourceProvider;

  private final Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider;

  public SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory(
      SignInViewModelDelegateModule module,
      Provider<ObserveUserAuthStateUseCase> dataSourceProvider,
      Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider) {
    this.module = module;
    this.dataSourceProvider = dataSourceProvider;
    this.notificationsPrefIsShownUseCaseProvider = notificationsPrefIsShownUseCaseProvider;
  }

  @Override
  public SignInViewModelDelegate get() {
    return provideSignInViewModelDelegate(module, dataSourceProvider.get(), notificationsPrefIsShownUseCaseProvider.get());
  }

  public static SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory create(
      SignInViewModelDelegateModule module,
      Provider<ObserveUserAuthStateUseCase> dataSourceProvider,
      Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider) {
    return new SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory(module, dataSourceProvider, notificationsPrefIsShownUseCaseProvider);
  }

  public static SignInViewModelDelegate provideSignInViewModelDelegate(
      SignInViewModelDelegateModule instance, ObserveUserAuthStateUseCase dataSource,
      NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase) {
    return Preconditions.checkNotNull(instance.provideSignInViewModelDelegate(dataSource, notificationsPrefIsShownUseCase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
