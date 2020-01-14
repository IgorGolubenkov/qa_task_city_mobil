// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.util.signin.SignInHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInModule_ProvideSignInHandlerFactory implements Factory<SignInHandler> {
  private final SignInModule module;

  private final Provider<Context> contextProvider;

  public SignInModule_ProvideSignInHandlerFactory(SignInModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SignInHandler get() {
    return provideSignInHandler(module, contextProvider.get());
  }

  public static SignInModule_ProvideSignInHandlerFactory create(SignInModule module,
      Provider<Context> contextProvider) {
    return new SignInModule_ProvideSignInHandlerFactory(module, contextProvider);
  }

  public static SignInHandler provideSignInHandler(SignInModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideSignInHandler(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
