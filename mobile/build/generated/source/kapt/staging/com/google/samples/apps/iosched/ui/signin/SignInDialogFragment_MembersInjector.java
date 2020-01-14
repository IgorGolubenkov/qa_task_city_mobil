// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.signin;

import androidx.lifecycle.ViewModelProvider;
import com.google.samples.apps.iosched.util.signin.SignInHandler;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatDialogFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInDialogFragment_MembersInjector implements MembersInjector<SignInDialogFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SignInHandler> signInHandlerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public SignInDialogFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SignInHandler> signInHandlerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.signInHandlerProvider = signInHandlerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SignInDialogFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SignInHandler> signInHandlerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new SignInDialogFragment_MembersInjector(androidInjectorProvider, signInHandlerProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(SignInDialogFragment instance) {
    DaggerAppCompatDialogFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSignInHandler(instance, signInHandlerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectSignInHandler(SignInDialogFragment instance,
      SignInHandler signInHandler) {
    instance.signInHandler = signInHandler;
  }

  public static void injectViewModelFactory(SignInDialogFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
