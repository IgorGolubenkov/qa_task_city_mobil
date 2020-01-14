// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.sessioncommon;

import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DefaultEventActionsViewModelDelegate_Factory implements Factory<DefaultEventActionsViewModelDelegate> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  public DefaultEventActionsViewModelDelegate_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.starEventUseCaseProvider = starEventUseCaseProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
  }

  @Override
  public DefaultEventActionsViewModelDelegate get() {
    return new DefaultEventActionsViewModelDelegate(signInViewModelDelegateProvider.get(), starEventUseCaseProvider.get(), snackbarMessageManagerProvider.get());
  }

  public static DefaultEventActionsViewModelDelegate_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider) {
    return new DefaultEventActionsViewModelDelegate_Factory(signInViewModelDelegateProvider, starEventUseCaseProvider, snackbarMessageManagerProvider);
  }

  public static DefaultEventActionsViewModelDelegate newInstance(
      SignInViewModelDelegate signInViewModelDelegate, StarEventAndNotifyUseCase starEventUseCase,
      SnackbarMessageManager snackbarMessageManager) {
    return new DefaultEventActionsViewModelDelegate(signInViewModelDelegate, starEventUseCase, snackbarMessageManager);
  }
}